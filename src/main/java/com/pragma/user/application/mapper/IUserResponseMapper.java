package com.pragma.user.application.mapper;

import com.pragma.user.application.dto.response.ObjectResponseDto;
import com.pragma.user.application.dto.response.RoleResponseDto;
import com.pragma.user.application.dto.response.UserResponseDto;
import com.pragma.user.domain.model.RoleModel;
import com.pragma.user.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserResponseMapper {
    UserResponseDto toResponse(UserModel userModel);

    List<UserResponseDto> toResponseList(List<UserModel> userModelList);
}