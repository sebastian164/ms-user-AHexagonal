package com.pragma.user.domain.spi;

import com.pragma.user.domain.model.UserModel;
import java.util.List;

public interface IUserPersistencePort {
    void saveUser(UserModel userModel);
    void updateUser(UserModel userModel);
    void deleteUser(UserModel userModel);

    UserModel getUser(UserModel userModel);

    List<UserModel> getAllUsers();
}
