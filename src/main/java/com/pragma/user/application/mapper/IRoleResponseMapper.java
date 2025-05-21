package com.pragma.user.application.mapper;

import com.pragma.user.application.dto.response.ObjectResponseDto;
import com.pragma.user.application.dto.response.RoleResponseDto;
import com.pragma.user.domain.model.ObjectModel;
import com.pragma.user.domain.model.RoleModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRoleResponseMapper {
    RoleResponseDto toResponse(RoleModel roleModel);

    List<RoleResponseDto> toResponseList(List<RoleModel> roleModelList);
}
