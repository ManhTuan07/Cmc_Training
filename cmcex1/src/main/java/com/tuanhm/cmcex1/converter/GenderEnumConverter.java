package com.tuanhm.cmcex1.converter;

import com.tuanhm.cmcex1.constant.Gender;

import javax.persistence.AttributeConverter;

public class GenderEnumConverter implements AttributeConverter<Gender,String> {
    @Override
    public String convertToDatabaseColumn(Gender attribute) {
        return attribute.getValue();
    }

    @Override
    public Gender convertToEntityAttribute(String dbData) {
        return Gender.of(dbData);
    }
}
