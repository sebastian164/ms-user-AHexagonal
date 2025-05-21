package com.pragma.user.domain.usecase;

import com.pragma.user.domain.api.IUserServicePort;
import com.pragma.user.domain.model.UserModel;
import com.pragma.user.domain.spi.IUserPersistencePort;
import org.apache.catalina.User;

import java.util.List;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void saveUser(UserModel userModel) {
        userPersistencePort.saveUser(userModel);
    }

    @Override
    public void updateUser(UserModel userModel) {
        userPersistencePort.updateUser(userModel);
    }

    @Override
    public void deleteUser(UserModel userModel) {
        userPersistencePort.deleteUser(userModel);
    }

    @Override
    public UserModel getUser(UserModel userModel) {
        return userPersistencePort.getUser(userModel);
    }

    @Override
    public List<UserModel> getAllUsers() {
        return userPersistencePort.getAllUsers();
    }
}
