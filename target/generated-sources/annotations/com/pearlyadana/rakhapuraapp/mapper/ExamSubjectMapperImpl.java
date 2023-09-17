package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.AcademicYear;
import com.pearlyadana.rakhapuraapp.entity.Exam;
import com.pearlyadana.rakhapuraapp.entity.ExamSubject;
import com.pearlyadana.rakhapuraapp.entity.ExamTitle;
import com.pearlyadana.rakhapuraapp.entity.Grade;
import com.pearlyadana.rakhapuraapp.entity.Subject;
import com.pearlyadana.rakhapuraapp.entity.SubjectType;
import com.pearlyadana.rakhapuraapp.model.request.AcademicYearDto;
import com.pearlyadana.rakhapuraapp.model.request.ExamDto;
import com.pearlyadana.rakhapuraapp.model.request.ExamSubjectDto;
import com.pearlyadana.rakhapuraapp.model.request.ExamTitleDto;
import com.pearlyadana.rakhapuraapp.model.request.GradeDto;
import com.pearlyadana.rakhapuraapp.model.request.SubjectDto;
import com.pearlyadana.rakhapuraapp.model.request.SubjectTypeDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T21:37:41+0630",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class ExamSubjectMapperImpl implements ExamSubjectMapper {

    @Override
    public ExamSubjectDto mapEntityToDto(ExamSubject entity) {
        if ( entity == null ) {
            return null;
        }

        ExamSubjectDto examSubjectDto = new ExamSubjectDto();

        examSubjectDto.setId( entity.getId() );
        examSubjectDto.setPassMark( entity.getPassMark() );
        examSubjectDto.setMarkPercentage( entity.getMarkPercentage() );
        examSubjectDto.setAuthorizedStatus( entity.isAuthorizedStatus() );
        examSubjectDto.setAuthorizedUserId( entity.getAuthorizedUserId() );
        examSubjectDto.setExam( examToExamDto( entity.getExam() ) );
        examSubjectDto.setSubject( subjectToSubjectDto( entity.getSubject() ) );

        return examSubjectDto;
    }

    @Override
    public ExamSubject mapDtoToEntity(ExamSubjectDto dto) {
        if ( dto == null ) {
            return null;
        }

        ExamSubject examSubject = new ExamSubject();

        examSubject.setId( dto.getId() );
        examSubject.setPassMark( dto.getPassMark() );
        examSubject.setMarkPercentage( dto.getMarkPercentage() );
        examSubject.setAuthorizedStatus( dto.isAuthorizedStatus() );
        examSubject.setAuthorizedUserId( dto.getAuthorizedUserId() );
        examSubject.setExam( examDtoToExam( dto.getExam() ) );
        examSubject.setSubject( subjectDtoToSubject( dto.getSubject() ) );

        return examSubject;
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

    protected ExamDto examToExamDto(Exam exam) {
        if ( exam == null ) {
            return null;
        }

        ExamDto examDto = new ExamDto();

        examDto.setId( exam.getId() );
        examDto.setExamDate( exam.getExamDate() );
        examDto.setTime( exam.getTime() );
        examDto.setPassMark( exam.getPassMark() );
        examDto.setMarkPercentage( exam.getMarkPercentage() );
        examDto.setPublished( exam.isPublished() );
        examDto.setAuthorizedStatus( exam.isAuthorizedStatus() );
        examDto.setAuthorizedUserId( exam.getAuthorizedUserId() );
        examDto.setAcademicYear( academicYearToAcademicYearDto( exam.getAcademicYear() ) );
        examDto.setExamTitle( examTitleToExamTitleDto( exam.getExamTitle() ) );
        examDto.setSubjectType( subjectTypeToSubjectTypeDto( exam.getSubjectType() ) );

        return examDto;
    }

    protected SubjectDto subjectToSubjectDto(Subject subject) {
        if ( subject == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        boolean authorizedStatus = false;
        Long authorizedUserId = null;

        id = subject.getId();
        name = subject.getName();
        authorizedStatus = subject.isAuthorizedStatus();
        authorizedUserId = subject.getAuthorizedUserId();

        SubjectDto subjectDto = new SubjectDto( id, name, authorizedStatus, authorizedUserId );

        return subjectDto;
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

    protected Exam examDtoToExam(ExamDto examDto) {
        if ( examDto == null ) {
            return null;
        }

        Exam exam = new Exam();

        exam.setId( examDto.getId() );
        exam.setExamDate( examDto.getExamDate() );
        exam.setTime( examDto.getTime() );
        exam.setPassMark( examDto.getPassMark() );
        exam.setMarkPercentage( examDto.getMarkPercentage() );
        exam.setPublished( examDto.isPublished() );
        exam.setAuthorizedStatus( examDto.isAuthorizedStatus() );
        exam.setAuthorizedUserId( examDto.getAuthorizedUserId() );
        exam.setAcademicYear( academicYearDtoToAcademicYear( examDto.getAcademicYear() ) );
        exam.setExamTitle( examTitleDtoToExamTitle( examDto.getExamTitle() ) );
        exam.setSubjectType( subjectTypeDtoToSubjectType( examDto.getSubjectType() ) );

        return exam;
    }

    protected Subject subjectDtoToSubject(SubjectDto subjectDto) {
        if ( subjectDto == null ) {
            return null;
        }

        Subject subject = new Subject();

        subject.setId( subjectDto.getId() );
        subject.setName( subjectDto.getName() );
        subject.setAuthorizedStatus( subjectDto.isAuthorizedStatus() );
        subject.setAuthorizedUserId( subjectDto.getAuthorizedUserId() );

        return subject;
    }
}
