package com.pragma.user.domain.api;

import com.pragma.user.domain.model.RoleModel;

import javax.management.relation.Role;
import java.util.List;

public interface IRoleServicePort {

    void saveRole(RoleModel roleModel);
    void updateRole(RoleModel roleModel);
    void deleteRole(RoleModel roleModel);
    RoleModel getRole(RoleModel roleModel);

    List<RoleModel> getAllRoles();
}
