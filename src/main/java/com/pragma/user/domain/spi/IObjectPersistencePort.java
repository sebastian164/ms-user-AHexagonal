package com.pragma.user.domain.spi;

import com.pragma.user.domain.model.ObjectModel;
import java.util.List;

public interface IObjectPersistencePort {
    ObjectModel saveObject(ObjectModel objectModel);

    List<ObjectModel> getAllObjects();
}