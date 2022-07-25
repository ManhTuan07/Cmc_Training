package com.tuanhm.cmcex1.service;

import com.tuanhm.cmcex1.dto.UserDto;
import com.tuanhm.cmcex1.model.User;

import java.util.List;

public interface UserService {

    List<UserDto> getAll(String permissionName);
    User saveOrUpdate(User user);
}
