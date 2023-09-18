package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.Grade;
import com.pearlyadana.rakhapuraapp.entity.SubjectType;
import com.pearlyadana.rakhapuraapp.model.request.GradeDto;
import com.pearlyadana.rakhapuraapp.model.request.SubjectTypeDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-18T08:25:59+0630",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class SubjectTypeMapperImpl implements SubjectTypeMapper {

    @Override
    public SubjectTypeDto mapEntityToDto(SubjectType entity) {
        if ( entity == null ) {
            return null;
        }

        SubjectTypeDto subjectTypeDto = new SubjectTypeDto();

        subjectTypeDto.setId( entity.getId() );
        subjectTypeDto.setName( entity.getName() );
        subjectTypeDto.setAuthorizedStatus( entity.isAuthorizedStatus() );
        subjectTypeDto.setAuthorizedUserId( entity.getAuthorizedUserId() );
        subjectTypeDto.setGrade( gradeToGradeDto( entity.getGrade() ) );

        return subjectTypeDto;
    }

    @Override
    public SubjectType mapDtoToEntity(SubjectTypeDto dto) {
        if ( dto == null ) {
            return null;
        }

        SubjectType subjectType = new SubjectType();

        subjectType.setId( dto.getId() );
        subjectType.setName( dto.getName() );
        subjectType.setAuthorizedStatus( dto.isAuthorizedStatus() );
        subjectType.setAuthorizedUserId( dto.getAuthorizedUserId() );
        subjectType.setGrade( gradeDtoToGrade( dto.getGrade() ) );

        return subjectType;
    }

    protected GradeDto gradeToGradeDto(Grade grade) {
        if ( grade == null ) {
            return null;
        }

        GradeDto gradeDto = new GradeDto();

        gradeDto.setId( grade.getId() );
        gradeDto.setName( grade.getName() );
        gradeDto.setRemark( grade.getRemark() );
        gradeDto.setAbbreviate( grade.getAbbreviate() );
        gradeDto.setAuthorizedStatus( grade.isAuthorizedStatus() );
        gradeDto.setAuthorizedUserId( grade.getAuthorizedUserId() );

        return gradeDto;
    }

    protected Grade gradeDtoToGrade(GradeDto gradeDto) {
        if ( gradeDto == null ) {
            return null;
        }

        Grade grade = new Grade();

        grade.setId( gradeDto.getId() );
        grade.setName( gradeDto.getName() );
        grade.setRemark( gradeDto.getRemark() );
        grade.setAbbreviate( gradeDto.getAbbreviate() );
        grade.setAuthorizedStatus( gradeDto.isAuthorizedStatus() );
        grade.setAuthorizedUserId( gradeDto.getAuthorizedUserId() );

        return grade;
    }
}
