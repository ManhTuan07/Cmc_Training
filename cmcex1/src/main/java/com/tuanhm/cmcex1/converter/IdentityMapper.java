package com.tuanhm.cmcex1.converter;

import com.tuanhm.cmcex1.dto.IdentityDto;
import com.tuanhm.cmcex1.model.Identity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IdentityMapper {
    @Mapping(target = "userDto", source = "user")
    IdentityDto toDto(Identity identity);
}
