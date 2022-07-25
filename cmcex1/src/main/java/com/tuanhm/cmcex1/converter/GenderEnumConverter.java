package com.tuanhm.cmcex1.converter;

import com.tuanhm.cmcex1.constant.Gender;
import org.mapstruct.Mapping;

import javax.persistence.AttributeConverter;

public class GenderEnumConverter implements AttributeConverter<Gender,String> {

    public String convertToDatabaseColumn(Gender attribute) {
        return attribute.getValue();
    }

    @Override
    public Gender convertToEntityAttribute(String dbData) {
        return Gender.of(dbData);
    }
}
