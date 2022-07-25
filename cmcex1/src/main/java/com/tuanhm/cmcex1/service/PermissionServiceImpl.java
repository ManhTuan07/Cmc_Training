package com.tuanhm.cmcex1.service;

import com.tuanhm.cmcex1.model.Permission;
import com.tuanhm.cmcex1.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public Permission findByName(String permissionName) {
        return permissionName == null ? null : permissionRepository.findByPermissionName(permissionName);
    }
}
