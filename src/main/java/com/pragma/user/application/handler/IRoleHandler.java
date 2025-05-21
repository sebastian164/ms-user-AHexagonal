package com.pragma.user.application.handler;

import com.pragma.user.application.dto.request.ObjectRequestDto;
import com.pragma.user.application.dto.request.RoleRequestDto;
import com.pragma.user.application.dto.response.ObjectResponseDto;
import com.pragma.user.application.dto.response.RoleResponseDto;
import com.pragma.user.application.dto.response.UserResponseDto;
import com.pragma.user.domain.model.RoleModel;

import java.util.List;

public interface IRoleHandler {
    void saveRole(RoleRequestDto roleRequestDto);
    void updateRole(RoleRequestDto roleRequestDto);
    void deleteRole(RoleRequestDto roleRequestDto);
    RoleResponseDto getRole(RoleRequestDto roleRequestDto);
    List<RoleResponseDto> getAllRoles();
}
