package com.pragma.user.infrastructure.out.jpa.adapter;

import com.pragma.user.domain.model.RoleModel;
import com.pragma.user.domain.spi.IRolePersistencePort;
import com.pragma.user.infrastructure.exception.NoDataFoundException;
import com.pragma.user.infrastructure.out.jpa.entity.RoleEntity;
import com.pragma.user.infrastructure.out.jpa.mapper.IRoleEntityMapper;
import com.pragma.user.infrastructure.out.jpa.repository.IRoleRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class RoleJpaAdapter implements IRolePersistencePort {

    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleEntityMapper;
    @Override
    public void saveRole(RoleModel roleModel) {
        roleRepository.save(roleEntityMapper.toEntity(roleModel));
    }

    @Override
    public void updateRole(RoleModel roleModel) {
        roleRepository.save(roleEntityMapper.toEntity(roleModel));
    }

    @Override
    public void deleteRole(RoleModel roleModel) {
        roleRepository.delete(roleEntityMapper.toEntity(roleModel));
    }

    @Override
    public RoleModel getRole(RoleModel roleModel) {
        return roleRepository.findById(roleModel.getId())
                .map(roleEntityMapper::toRoleModel)
                .orElse(null);
    }

    @Override
    public List<RoleModel> getAllRoles() {
        List<RoleEntity> roleList = roleRepository.findAll();
        if (roleList.isEmpty()) {
            throw new NoDataFoundException();
        }
        return roleEntityMapper.toRoleModelList(roleList);
    }
}
