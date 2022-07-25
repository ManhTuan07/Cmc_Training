package com.tuanhm.cmcex1.repository;


import com.tuanhm.cmcex1.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PermissionRepository extends JpaRepository<Permission,Long> {
    List<Permission> findByUsers_Username(String username);

    Permission findByPermissionName(String permissionName);
}
