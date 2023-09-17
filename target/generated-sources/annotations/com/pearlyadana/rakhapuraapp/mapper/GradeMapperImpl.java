package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.Grade;
import com.pearlyadana.rakhapuraapp.model.request.GradeDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T22:17:48+0630",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class GradeMapperImpl implements GradeMapper {

    @Override
    public GradeDto mapEntityToDto(Grade entity) {
        if ( entity == null ) {
            return null;
        }

        GradeDto gradeDto = new GradeDto();

        gradeDto.setId( entity.getId() );
        gradeDto.setName( entity.getName() );
        gradeDto.setRemark( entity.getRemark() );
        gradeDto.setAbbreviate( entity.getAbbreviate() );
        gradeDto.setAuthorizedStatus( entity.isAuthorizedStatus() );
        gradeDto.setAuthorizedUserId( entity.getAuthorizedUserId() );

        return gradeDto;
    }

    @Override
    public Grade mapDtoToEntity(GradeDto dto) {
        if ( dto == null ) {
            return null;
        }

        Grade grade = new Grade();

        grade.setId( dto.getId() );
        grade.setName( dto.getName() );
        grade.setRemark( dto.getRemark() );
        grade.setAbbreviate( dto.getAbbreviate() );
        grade.setAuthorizedStatus( dto.isAuthorizedStatus() );
        grade.setAuthorizedUserId( dto.getAuthorizedUserId() );

        return grade;
    }
}
