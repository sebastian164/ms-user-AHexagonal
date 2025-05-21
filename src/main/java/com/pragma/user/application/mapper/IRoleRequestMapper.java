package com.pragma.user.application.mapper;

import com.pragma.user.application.dto.request.RoleRequestDto;
import com.pragma.user.domain.model.RoleModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRoleRequestMapper {
    RoleModel toRole(RoleRequestDto roleRequestDto);
}
