package com.pragma.user.infrastructure.out.jpa.adapter;

import com.pragma.user.domain.model.UserModel;
import com.pragma.user.domain.spi.IUserPersistencePort;
import com.pragma.user.infrastructure.exception.NoDataFoundException;
import com.pragma.user.infrastructure.out.jpa.entity.UserEntity;
import com.pragma.user.infrastructure.out.jpa.mapper.IUserEntityMapper;
import com.pragma.user.infrastructure.out.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {

    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    @Override
    public void saveUser(UserModel userModel) {
        userRepository.save(userEntityMapper.toEntity(userModel));
    }

    @Override
    public void updateUser(UserModel userModel) {
        userRepository.save(userEntityMapper.toEntity(userModel));
    }

    @Override
    public void deleteUser(UserModel userModel) {
        userRepository.delete(userEntityMapper.toEntity(userModel));
    }

    @Override
    public UserModel getUser(UserModel userModel) {
        return userRepository.findById(userModel.getId())
                .map(userEntityMapper::toUserModel)
                .orElse(null);
    }

    @Override
    public List<UserModel> getAllUsers() {
        List<UserEntity> userList = userRepository.findAll();
        if (userList.isEmpty()) {
            throw new NoDataFoundException();
        }
        return userEntityMapper.toUserModelList(userList);
    }
}
