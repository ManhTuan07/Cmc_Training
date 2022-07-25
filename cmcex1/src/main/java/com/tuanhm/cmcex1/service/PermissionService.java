package com.tuanhm.cmcex1.service;

import com.tuanhm.cmcex1.model.Permission;
import com.tuanhm.cmcex1.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface PermissionService {

    Permission findByName(String permissionName);

}
