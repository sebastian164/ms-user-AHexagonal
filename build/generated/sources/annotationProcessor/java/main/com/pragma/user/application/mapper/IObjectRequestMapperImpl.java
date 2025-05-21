package com.pragma.user.application.mapper;

import com.pragma.user.application.dto.request.ObjectRequestDto;
import com.pragma.user.domain.model.ObjectModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-21T12:20:10-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class IObjectRequestMapperImpl implements IObjectRequestMapper {

    @Override
    public ObjectModel toObject(ObjectRequestDto objectRequestDto) {
        if ( objectRequestDto == null ) {
            return null;
        }

        ObjectModel objectModel = new ObjectModel();

        objectModel.setName( objectRequestDto.getName() );

        return objectModel;
    }
}
