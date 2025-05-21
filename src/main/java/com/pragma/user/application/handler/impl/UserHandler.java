package com.pragma.user.application.handler.impl;

import com.pragma.user.application.dto.request.UserRequestDto;
import com.pragma.user.application.dto.response.UserResponseDto;
import com.pragma.user.application.handler.IUserHandler;
import com.pragma.user.application.mapper.IUserRequestMapper;
import com.pragma.user.application.mapper.IUserResponseMapper;
import com.pragma.user.domain.api.IUserServicePort;
import com.pragma.user.domain.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserHandler implements IUserHandler {

    private final IUserServicePort userServicePort;
    private final IUserRequestMapper userRequestMapper;
    private final IUserResponseMapper userResponseMapper;
    @Override
    public void saveUser(UserRequestDto userRequestDto) {
        UserModel userModel = userRequestMapper.toUser(userRequestDto);
        userServicePort.saveUser(userModel);
    }

    @Override
    public void updateUser(UserRequestDto userRequestDto) {
        UserModel userModel = userRequestMapper.toUser(userRequestDto);
        userServicePort.updateUser(userModel);
    }

    @Override
    public void deleteUser(UserRequestDto userRequestDto) {
        UserModel userModel = userRequestMapper.toUser(userRequestDto);
        userServicePort.deleteUser(userModel);
    }

    @Override
    public UserResponseDto getUser(UserRequestDto userRequestDto) {
        UserModel userModel = userRequestMapper.toUser(userRequestDto);
        return userResponseMapper.toResponse(userServicePort.getUser(userModel));
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        return userResponseMapper.toResponseList(userServicePort.getAllUsers());
    }
}
