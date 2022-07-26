package com.tuanhm.cmcex1.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum Gender {
    MALE("m"),
    FEMALE("f"),
    OTHER("o"),
    HIDDEN("h");

    private String value;

    private static final Map<String, Gender> genderMap = new HashMap<>();

    static{
        System.out.println("static block in Gender Enum");
        for(Gender gender : Gender.values()){
            genderMap.put(gender.value,gender);
        }
    }

    public static Gender of(String s){
        System.out.println("of function in Gender");
        return genderMap.get(s);
    }
}
