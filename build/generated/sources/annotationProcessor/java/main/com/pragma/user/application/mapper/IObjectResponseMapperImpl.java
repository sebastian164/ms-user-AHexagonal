package com.pragma.user.application.mapper;

import com.pragma.user.application.dto.response.ObjectResponseDto;
import com.pragma.user.domain.model.ObjectModel;
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
public class IObjectResponseMapperImpl implements IObjectResponseMapper {

    @Override
    public ObjectResponseDto toResponse(ObjectModel objectModel) {
        if ( objectModel == null ) {
            return null;
        }

        ObjectResponseDto objectResponseDto = new ObjectResponseDto();

        objectResponseDto.setId( objectModel.getId() );
        objectResponseDto.setName( objectModel.getName() );

        return objectResponseDto;
    }

    @Override
    public List<ObjectResponseDto> toResponseList(List<ObjectModel> objectModelList) {
        if ( objectModelList == null ) {
            return null;
        }

        List<ObjectResponseDto> list = new ArrayList<ObjectResponseDto>( objectModelList.size() );
        for ( ObjectModel objectModel : objectModelList ) {
            list.add( toResponse( objectModel ) );
        }

        return list;
    }
}
