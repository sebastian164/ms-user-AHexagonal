package com.pragma.user.infrastructure.out.jpa.mapper;

import com.pragma.user.domain.model.ObjectModel;
import com.pragma.user.infrastructure.out.jpa.entity.ObjectEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-21T12:20:10-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class IObjectEntityMapperImpl implements IObjectEntityMapper {

    @Override
    public ObjectEntity toEntity(ObjectModel user) {
        if ( user == null ) {
            return null;
        }

        ObjectEntity objectEntity = new ObjectEntity();

        objectEntity.setId( user.getId() );
        objectEntity.setName( user.getName() );

        return objectEntity;
    }

    @Override
    public ObjectModel toObjectModel(ObjectEntity objectEntity) {
        if ( objectEntity == null ) {
            return null;
        }

        ObjectModel objectModel = new ObjectModel();

        objectModel.setId( objectEntity.getId() );
        objectModel.setName( objectEntity.getName() );

        return objectModel;
    }

    @Override
    public List<ObjectModel> toObjectModelList(List<ObjectEntity> userEntityList) {
        if ( userEntityList == null ) {
            return null;
        }

        List<ObjectModel> list = new ArrayList<ObjectModel>( userEntityList.size() );
        for ( ObjectEntity objectEntity : userEntityList ) {
            list.add( toObjectModel( objectEntity ) );
        }

        return list;
    }
}
