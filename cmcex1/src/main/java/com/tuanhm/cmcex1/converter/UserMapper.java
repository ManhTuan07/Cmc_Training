package com.tuanhm.cmcex1.converter;

import com.tuanhm.cmcex1.dto.UserDto;

import com.tuanhm.cmcex1.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "usernameDto", source = "username")
    UserDto toDto(User user);
}
