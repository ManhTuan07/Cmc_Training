package com.tuanhm.cmcex1.service;

import com.tuanhm.cmcex1.dto.UserDto;
import com.tuanhm.cmcex1.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

    List<UserDto> getAll();
    User saveOrUpdate(User user);

    Page<UserDto> getPage(Pageable pageable);
}
