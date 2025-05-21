package com.pragma.user.application.handler;

import com.pragma.user.application.dto.request.ObjectRequestDto;
import com.pragma.user.application.dto.response.ObjectResponseDto;

import java.util.List;

public interface IObjectHandler {

    void saveObject(ObjectRequestDto objectRequestDto);

    List<ObjectResponseDto> getAllObjects();
}