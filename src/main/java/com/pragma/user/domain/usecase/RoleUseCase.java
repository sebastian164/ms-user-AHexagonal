package com.pragma.user.domain.usecase;

import com.pragma.user.domain.api.IObjectServicePort;
import com.pragma.user.domain.api.IRoleServicePort;
import com.pragma.user.domain.model.ObjectModel;
import com.pragma.user.domain.model.RoleModel;
import com.pragma.user.domain.spi.IObjectPersistencePort;
import com.pragma.user.domain.spi.IRolePersistencePort;

import javax.management.relation.Role;
import java.util.List;

public class RoleUseCase implements IRoleServicePort {

    private final IRolePersistencePort rolePersistencePort;

    public RoleUseCase(IRolePersistencePort rolePersistencePort) {
        this.rolePersistencePort = rolePersistencePort;
    }


    @Override
    public void saveRole(RoleModel roleModel) {
        rolePersistencePort.saveRole(roleModel);
    }

    @Override
    public void updateRole(RoleModel roleModel) {
        rolePersistencePort.updateRole(roleModel);
    }

    @Override
    public void deleteRole(RoleModel roleModel) {
        rolePersistencePort.deleteRole(roleModel);
    }

    @Override
    public RoleModel getRole(RoleModel roleModel) {
        return rolePersistencePort.getRole(roleModel);
    }

    @Override
    public List<RoleModel> getAllRoles() {
        return rolePersistencePort.getAllRoles();
    }
}
