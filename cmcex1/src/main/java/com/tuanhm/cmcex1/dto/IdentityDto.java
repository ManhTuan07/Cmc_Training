package com.tuanhm.cmcex1.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class IdentityDto {

    private Long id;
    private String idNumber;
    private UserDto userDto;
}
