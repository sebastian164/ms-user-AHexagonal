package com.pragma.user.domain.api;

import com.pragma.user.domain.model.ObjectModel;

import java.util.List;

public interface IObjectServicePort {

    void saveObject(ObjectModel objectModel);

    List<ObjectModel> getAllObjects();
}