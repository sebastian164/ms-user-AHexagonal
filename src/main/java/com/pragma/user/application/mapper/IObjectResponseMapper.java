package com.pragma.user.application.mapper;

import com.pragma.user.application.dto.response.ObjectResponseDto;
import com.pragma.user.domain.model.ObjectModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IObjectResponseMapper {
    ObjectResponseDto toResponse(ObjectModel objectModel);

    List<ObjectResponseDto> toResponseList(List<ObjectModel> objectModelList);
}
