package com.tuanhm.cmcex1.converter;

import com.tuanhm.cmcex1.dto.UserDto;

import com.tuanhm.cmcex1.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
