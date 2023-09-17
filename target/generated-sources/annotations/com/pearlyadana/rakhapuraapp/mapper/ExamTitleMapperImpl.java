package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.ExamTitle;
import com.pearlyadana.rakhapuraapp.model.request.ExamTitleDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T22:17:48+0630",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class ExamTitleMapperImpl implements ExamTitleMapper {

    @Override
    public ExamTitleDto mapEntityToDto(ExamTitle entity) {
        if ( entity == null ) {
            return null;
        }

        ExamTitleDto examTitleDto = new ExamTitleDto();

        examTitleDto.setId( entity.getId() );
        examTitleDto.setName( entity.getName() );
        examTitleDto.setAuthorizedStatus( entity.isAuthorizedStatus() );
        examTitleDto.setAuthorizedUserId( entity.getAuthorizedUserId() );

        return examTitleDto;
    }

    @Override
    public ExamTitle mapDtoToEntity(ExamTitleDto dto) {
        if ( dto == null ) {
            return null;
        }

        ExamTitle examTitle = new ExamTitle();

        examTitle.setId( dto.getId() );
        examTitle.setName( dto.getName() );
        examTitle.setAuthorizedStatus( dto.isAuthorizedStatus() );
        examTitle.setAuthorizedUserId( dto.getAuthorizedUserId() );

        return examTitle;
    }
}
