package com.pragma.user.application.handler.impl;

import com.pragma.user.application.dto.request.RoleRequestDto;
import com.pragma.user.application.dto.response.RoleResponseDto;
import com.pragma.user.application.handler.IRoleHandler;
import com.pragma.user.application.mapper.IRoleRequestMapper;
import com.pragma.user.application.mapper.IRoleResponseMapper;
import com.pragma.user.domain.api.IRoleServicePort;
import com.pragma.user.domain.model.RoleModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class Rolehandler implements IRoleHandler {

    private final IRoleServicePort roleServicePort;
    private final IRoleRequestMapper roleRequestMapper;
    private final IRoleResponseMapper roleResponseMapper;

    @Override
    public void saveRole(RoleRequestDto roleRequestDto) {
        RoleModel roleModel = roleRequestMapper.toRole(roleRequestDto);
        roleServicePort.saveRole(roleModel);
    }

    @Override
    public void updateRole(RoleRequestDto roleRequestDto) {
        RoleModel roleModel = roleRequestMapper.toRole(roleRequestDto);
    }

    @Override
    public void deleteRole(RoleRequestDto roleRequestDto) {
        RoleModel roleModel = roleRequestMapper.toRole(roleRequestDto);
    }

    @Override
    public RoleResponseDto getRole(RoleRequestDto roleRequestDto) {
        RoleModel roleModel = roleRequestMapper.toRole(roleRequestDto);
        return roleResponseMapper.toResponse(roleServicePort.getRole(roleModel));
    }

    @Override
    public List<RoleResponseDto> getAllRoles() {
        return roleResponseMapper.toResponseList(roleServicePort.getAllRoles());
    }

}