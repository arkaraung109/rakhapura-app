package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.AcademicYear;
import com.pearlyadana.rakhapuraapp.entity.Exam;
import com.pearlyadana.rakhapuraapp.entity.ExamTitle;
import com.pearlyadana.rakhapuraapp.entity.Grade;
import com.pearlyadana.rakhapuraapp.entity.SubjectType;
import com.pearlyadana.rakhapuraapp.model.request.AcademicYearDto;
import com.pearlyadana.rakhapuraapp.model.request.ExamDto;
import com.pearlyadana.rakhapuraapp.model.request.ExamTitleDto;
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
public class ExamMapperImpl implements ExamMapper {

    @Override
    public ExamDto mapEntityToDto(Exam entity) {
        if ( entity == null ) {
            return null;
        }

        ExamDto examDto = new ExamDto();

        examDto.setId( entity.getId() );
        examDto.setExamDate( entity.getExamDate() );
        examDto.setTime( entity.getTime() );
        examDto.setPassMark( entity.getPassMark() );
        examDto.setMarkPercentage( entity.getMarkPercentage() );
        examDto.setPublished( entity.isPublished() );
        examDto.setAuthorizedStatus( entity.isAuthorizedStatus() );
        examDto.setAuthorizedUserId( entity.getAuthorizedUserId() );
        examDto.setAcademicYear( academicYearToAcademicYearDto( entity.getAcademicYear() ) );
        examDto.setExamTitle( examTitleToExamTitleDto( entity.getExamTitle() ) );
        examDto.setSubjectType( subjectTypeToSubjectTypeDto( entity.getSubjectType() ) );

        return examDto;
    }

    @Override
    public Exam mapDtoToEntity(ExamDto dto) {
        if ( dto == null ) {
            return null;
        }

        Exam exam = new Exam();

        exam.setId( dto.getId() );
        exam.setExamDate( dto.getExamDate() );
        exam.setTime( dto.getTime() );
        exam.setPassMark( dto.getPassMark() );
        exam.setMarkPercentage( dto.getMarkPercentage() );
        exam.setPublished( dto.isPublished() );
        exam.setAuthorizedStatus( dto.isAuthorizedStatus() );
        exam.setAuthorizedUserId( dto.getAuthorizedUserId() );
        exam.setAcademicYear( academicYearDtoToAcademicYear( dto.getAcademicYear() ) );
        exam.setExamTitle( examTitleDtoToExamTitle( dto.getExamTitle() ) );
        exam.setSubjectType( subjectTypeDtoToSubjectType( dto.getSubjectType() ) );

        return exam;
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

    protected ExamTitleDto examTitleToExamTitleDto(ExamTitle examTitle) {
        if ( examTitle == null ) {
            return null;
        }

        ExamTitleDto examTitleDto = new ExamTitleDto();

        examTitleDto.setId( examTitle.getId() );
        examTitleDto.setName( examTitle.getName() );
        examTitleDto.setAuthorizedStatus( examTitle.isAuthorizedStatus() );
        examTitleDto.setAuthorizedUserId( examTitle.getAuthorizedUserId() );

        return examTitleDto;
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

    protected SubjectTypeDto subjectTypeToSubjectTypeDto(SubjectType subjectType) {
        if ( subjectType == null ) {
            return null;
        }

        SubjectTypeDto subjectTypeDto = new SubjectTypeDto();

        subjectTypeDto.setId( subjectType.getId() );
        subjectTypeDto.setName( subjectType.getName() );
        subjectTypeDto.setAuthorizedStatus( subjectType.isAuthorizedStatus() );
        subjectTypeDto.setAuthorizedUserId( subjectType.getAuthorizedUserId() );
        subjectTypeDto.setGrade( gradeToGradeDto( subjectType.getGrade() ) );

        return subjectTypeDto;
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

    protected ExamTitle examTitleDtoToExamTitle(ExamTitleDto examTitleDto) {
        if ( examTitleDto == null ) {
            return null;
        }

        ExamTitle examTitle = new ExamTitle();

        examTitle.setId( examTitleDto.getId() );
        examTitle.setName( examTitleDto.getName() );
        examTitle.setAuthorizedStatus( examTitleDto.isAuthorizedStatus() );
        examTitle.setAuthorizedUserId( examTitleDto.getAuthorizedUserId() );

        return examTitle;
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

    protected SubjectType subjectTypeDtoToSubjectType(SubjectTypeDto subjectTypeDto) {
        if ( subjectTypeDto == null ) {
            return null;
        }

        SubjectType subjectType = new SubjectType();

        subjectType.setId( subjectTypeDto.getId() );
        subjectType.setName( subjectTypeDto.getName() );
        subjectType.setAuthorizedStatus( subjectTypeDto.isAuthorizedStatus() );
        subjectType.setAuthorizedUserId( subjectTypeDto.getAuthorizedUserId() );
        subjectType.setGrade( gradeDtoToGrade( subjectTypeDto.getGrade() ) );

        return subjectType;
    }
}
