package com.tuanhm.cmcex1.converter;

import com.tuanhm.cmcex1.constant.Permission;

import javax.persistence.AttributeConverter;

public class PermissionEnumConverter implements AttributeConverter<Permission, String> {
    @Override
    public String convertToDatabaseColumn(Permission attribute) {
        return attribute.getValue();
    }

    @Override
    public Permission convertToEntityAttribute(String dbData) {
        return Permission.of(dbData);
    }
}
