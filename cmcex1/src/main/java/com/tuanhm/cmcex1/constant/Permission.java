package com.tuanhm.cmcex1.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum Permission {
    WRITE("w"),
    READ("r"),
    EXECUTE("e");

    private String value;

    private static final Map<String,Permission> permissionMap = new HashMap<>();

    static {
        for (Permission permission : Permission.values()){
            permissionMap.put(permission.getValue(),permission);
        }
    }

    public static Permission of(String p){
        return permissionMap.get(p);
    }
}
