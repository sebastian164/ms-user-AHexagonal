package com.pragma.user.infrastructure.out.jpa.mapper;

import com.pragma.user.domain.model.ObjectModel;
import com.pragma.user.domain.model.UserModel;
import com.pragma.user.infrastructure.out.jpa.entity.ObjectEntity;
import com.pragma.user.infrastructure.out.jpa.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IUserEntityMapper {
    UserEntity toEntity(UserModel user);
    UserModel toUserModel(UserEntity userEntity);
    List<UserModel> toUserModelList(List<UserEntity> userEntityList);
}
