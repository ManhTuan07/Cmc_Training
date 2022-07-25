package com.tuanhm.cmcex1.dto;


import com.tuanhm.cmcex1.constant.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private Long id;
    private String username;
    private Gender gender;
}
