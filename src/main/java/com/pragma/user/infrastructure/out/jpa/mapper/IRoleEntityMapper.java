package com.pragma.user.infrastructure.out.jpa.mapper;

import com.pragma.user.domain.model.ObjectModel;
import com.pragma.user.domain.model.RoleModel;
import com.pragma.user.infrastructure.out.jpa.entity.ObjectEntity;
import com.pragma.user.infrastructure.out.jpa.entity.RoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IRoleEntityMapper {

    RoleEntity toEntity(RoleModel role);
    RoleModel toRoleModel(RoleEntity roleEntity);
    List<RoleModel> toRoleModelList(List<RoleEntity> roleEntityList);
}
