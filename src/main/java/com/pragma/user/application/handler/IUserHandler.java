package com.pragma.user.application.handler;

import com.pragma.user.application.dto.request.UserRequestDto;
import com.pragma.user.application.dto.response.UserResponseDto;
import com.pragma.user.domain.model.UserModel;

import java.util.List;

public interface IUserHandler {
    void saveUser(UserRequestDto userRequestDto);
    void updateUser(UserRequestDto userRequestDto);
    void deleteUser(UserRequestDto userRequestDto);

    UserResponseDto getUser(UserRequestDto userRequestDto);
    List<UserResponseDto> getAllUsers();
}
