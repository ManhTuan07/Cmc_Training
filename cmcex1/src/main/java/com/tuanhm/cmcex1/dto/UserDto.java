package com.tuanhm.cmcex1.dto;


import com.tuanhm.cmcex1.constant.Gender;
import com.tuanhm.cmcex1.constant.Permission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDto {
    private Long id;
    private String usernameDto;
    private Gender gender;
    private List<Permission> permissions;

}
