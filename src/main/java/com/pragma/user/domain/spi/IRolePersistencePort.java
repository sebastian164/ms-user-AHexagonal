package com.pragma.user.domain.spi;

import com.pragma.user.domain.model.RoleModel;

import java.util.List;

public interface IRolePersistencePort {
    void saveRole(RoleModel roleModel);
    void updateRole(RoleModel roleModel);
    void deleteRole(RoleModel roleModel);
    RoleModel getRole(RoleModel roleModel);

    List<RoleModel> getAllRoles();
}
