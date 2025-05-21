package com.pragma.user.domain.api;

import com.pragma.user.domain.model.RoleModel;
import com.pragma.user.domain.model.UserModel;

import java.util.List;

public interface IUserServicePort {
    void saveUser(UserModel userModel);
    void updateUser(UserModel userModel);
    void deleteUser(UserModel userModel);

    UserModel getUser(UserModel userModel);

    List<UserModel> getAllUsers();
}
