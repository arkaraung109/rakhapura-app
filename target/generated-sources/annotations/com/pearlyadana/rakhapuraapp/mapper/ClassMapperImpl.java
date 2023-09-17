package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.AcademicYear;
import com.pearlyadana.rakhapuraapp.entity.Class;
import com.pearlyadana.rakhapuraapp.entity.Grade;
import com.pearlyadana.rakhapuraapp.model.request.AcademicYearDto;
import com.pearlyadana.rakhapuraapp.model.request.ClassDto;
import com.pearlyadana.rakhapuraapp.model.request.GradeDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T21:37:41+0630",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class ClassMapperImpl implements ClassMapper {

    @Override
    public ClassDto mapEntityToDto(Class entity) {
        if ( entity == null ) {
            return null;
        }

        ClassDto classDto = new ClassDto();

        classDto.setId( entity.getId() );
        classDto.setName( entity.getName() );
        classDto.setAuthorizedStatus( entity.isAuthorizedStatus() );
        classDto.setAuthorizedUserId( entity.getAuthorizedUserId() );
        classDto.setAcademicYear( academicYearToAcademicYearDto( entity.getAcademicYear() ) );
        classDto.setGrade( gradeToGradeDto( entity.getGrade() ) );

        return classDto;
    }

    @Override
    public Class mapDtoToEntity(ClassDto dto) {
        if ( dto == null ) {
            return null;
        }

        Class class1 = new Class();

        class1.setId( dto.getId() );
        class1.setName( dto.getName() );
        class1.setAuthorizedStatus( dto.isAuthorizedStatus() );
        class1.setAuthorizedUserId( dto.getAuthorizedUserId() );
        class1.setAcademicYear( academicYearDtoToAcademicYear( dto.getAcademicYear() ) );
        class1.setGrade( gradeDtoToGrade( dto.getGrade() ) );

        return class1;
    }

    protected AcademicYearDto academicYearToAcademicYearDto(AcademicYear academicYear) {
        if ( academicYear == null ) {
            return null;
        }

        AcademicYearDto academicYearDto = new AcademicYearDto();

        academicYearDto.setId( academicYear.getId() );
        academicYearDto.setName( academicYear.getName() );
        academicYearDto.setAuthorizedStatus( academicYear.isAuthorizedStatus() );
        academicYearDto.setAuthorizedUserId( academicYear.getAuthorizedUserId() );

        return academicYearDto;
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

    protected AcademicYear academicYearDtoToAcademicYear(AcademicYearDto academicYearDto) {
        if ( academicYearDto == null ) {
            return null;
        }

        AcademicYear academicYear = new AcademicYear();

        academicYear.setId( academicYearDto.getId() );
        academicYear.setName( academicYearDto.getName() );
        academicYear.setAuthorizedStatus( academicYearDto.isAuthorizedStatus() );
        academicYear.setAuthorizedUserId( academicYearDto.getAuthorizedUserId() );

        return academicYear;
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
