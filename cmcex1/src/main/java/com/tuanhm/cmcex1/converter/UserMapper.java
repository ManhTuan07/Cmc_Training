package com.tuanhm.cmcex1.converter;

import com.tuanhm.cmcex1.dto.UserDto;

import com.tuanhm.cmcex1.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javax.xml.stream.events.StartDocument;

@Mapper(componentModel = "spring", uses = IdentityMapper.class)
public interface UserMapper {
    @Mapping(target = "usernameDto", source = "username")
    @Mapping(target = "identityDto" ,source = "identity")
    UserDto toDto(User user);
}
