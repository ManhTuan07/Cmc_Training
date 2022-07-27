package com.tuanhm.cmcex1.dto;


import com.tuanhm.cmcex1.constant.Gender;
import com.tuanhm.cmcex1.constant.Permission;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class UserDto {
    private Long id;
    private String usernameDto;
    private Gender gender;
    private List<Permission> permissions;
    private IdentityDto identityDto;

}
