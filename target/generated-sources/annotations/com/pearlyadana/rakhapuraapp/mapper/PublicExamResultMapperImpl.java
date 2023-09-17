package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.AcademicYear;
import com.pearlyadana.rakhapuraapp.entity.Class;
import com.pearlyadana.rakhapuraapp.entity.ExamTitle;
import com.pearlyadana.rakhapuraapp.entity.Grade;
import com.pearlyadana.rakhapuraapp.entity.Hostel;
import com.pearlyadana.rakhapuraapp.entity.PublicExamResult;
import com.pearlyadana.rakhapuraapp.entity.Region;
import com.pearlyadana.rakhapuraapp.entity.Student;
import com.pearlyadana.rakhapuraapp.entity.StudentClass;
import com.pearlyadana.rakhapuraapp.model.request.AcademicYearDto;
import com.pearlyadana.rakhapuraapp.model.request.ClassDto;
import com.pearlyadana.rakhapuraapp.model.request.ExamTitleDto;
import com.pearlyadana.rakhapuraapp.model.request.GradeDto;
import com.pearlyadana.rakhapuraapp.model.request.HostelDto;
import com.pearlyadana.rakhapuraapp.model.request.PublicExamResultDto;
import com.pearlyadana.rakhapuraapp.model.request.RegionDto;
import com.pearlyadana.rakhapuraapp.model.request.StudentClassDto;
import com.pearlyadana.rakhapuraapp.model.request.StudentDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T22:17:48+0630",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class PublicExamResultMapperImpl implements PublicExamResultMapper {

    @Override
    public PublicExamResultDto mapEntityToDto(PublicExamResult entity) {
        if ( entity == null ) {
            return null;
        }

        PublicExamResultDto publicExamResultDto = new PublicExamResultDto();

        publicExamResultDto.setId( entity.getId() );
        publicExamResultDto.setSerialNo( entity.getSerialNo() );
        publicExamResultDto.setStudentClass( studentClassToStudentClassDto( entity.getStudentClass() ) );

        return publicExamResultDto;
    }

    @Override
    public PublicExamResult mapDtoToEntity(PublicExamResultDto dto) {
        if ( dto == null ) {
            return null;
        }

        PublicExamResult publicExamResult = new PublicExamResult();

        publicExamResult.setId( dto.getId() );
        publicExamResult.setSerialNo( dto.getSerialNo() );
        publicExamResult.setStudentClass( studentClassDtoToStudentClass( dto.getStudentClass() ) );

        return publicExamResult;
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

    protected ClassDto classToClassDto(Class class1) {
        if ( class1 == null ) {
            return null;
        }

        ClassDto classDto = new ClassDto();

        classDto.setId( class1.getId() );
        classDto.setName( class1.getName() );
        classDto.setAuthorizedStatus( class1.isAuthorizedStatus() );
        classDto.setAuthorizedUserId( class1.getAuthorizedUserId() );
        classDto.setAcademicYear( academicYearToAcademicYearDto( class1.getAcademicYear() ) );
        classDto.setGrade( gradeToGradeDto( class1.getGrade() ) );

        return classDto;
    }

    protected HostelDto hostelToHostelDto(Hostel hostel) {
        if ( hostel == null ) {
            return null;
        }

        HostelDto hostelDto = new HostelDto();

        hostelDto.setId( hostel.getId() );
        hostelDto.setName( hostel.getName() );
        hostelDto.setAddress( hostel.getAddress() );
        hostelDto.setPhone( hostel.getPhone() );
        hostelDto.setAuthorizedStatus( hostel.isAuthorizedStatus() );
        hostelDto.setAuthorizedUserId( hostel.getAuthorizedUserId() );

        return hostelDto;
    }

    protected RegionDto regionToRegionDto(Region region) {
        if ( region == null ) {
            return null;
        }

        RegionDto regionDto = new RegionDto();

        regionDto.setId( region.getId() );
        regionDto.setName( region.getName() );
        regionDto.setAuthorizedStatus( region.isAuthorizedStatus() );
        regionDto.setAuthorizedUserId( region.getAuthorizedUserId() );

        return regionDto;
    }

    protected StudentDto studentToStudentDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setId( student.getId() );
        studentDto.setRegDate( student.getRegDate() );
        studentDto.setName( student.getName() );
        studentDto.setDob( student.getDob() );
        studentDto.setSex( student.getSex() );
        studentDto.setNationality( student.getNationality() );
        studentDto.setNrc( student.getNrc() );
        studentDto.setFatherName( student.getFatherName() );
        studentDto.setMotherName( student.getMotherName() );
        studentDto.setAddress( student.getAddress() );
        studentDto.setMonasteryName( student.getMonasteryName() );
        studentDto.setMonasteryHeadmaster( student.getMonasteryHeadmaster() );
        studentDto.setMonasteryTownship( student.getMonasteryTownship() );
        studentDto.setCreatedTimestamp( student.getCreatedTimestamp() );
        studentDto.setRegion( regionToRegionDto( student.getRegion() ) );

        return studentDto;
    }

    protected StudentClassDto studentClassToStudentClassDto(StudentClass studentClass) {
        if ( studentClass == null ) {
            return null;
        }

        StudentClassDto studentClassDto = new StudentClassDto();

        studentClassDto.setId( studentClass.getId() );
        studentClassDto.setRegNo( studentClass.getRegNo() );
        studentClassDto.setRegSeqNo( studentClass.getRegSeqNo() );
        studentClassDto.setArrival( studentClass.isArrival() );
        studentClassDto.setCreatedTimestamp( studentClass.getCreatedTimestamp() );
        studentClassDto.setExamTitle( examTitleToExamTitleDto( studentClass.getExamTitle() ) );
        studentClassDto.setStudentClass( classToClassDto( studentClass.getStudentClass() ) );
        studentClassDto.setHostel( hostelToHostelDto( studentClass.getHostel() ) );
        studentClassDto.setStudent( studentToStudentDto( studentClass.getStudent() ) );

        return studentClassDto;
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

    protected Class classDtoToClass(ClassDto classDto) {
        if ( classDto == null ) {
            return null;
        }

        Class class1 = new Class();

        class1.setId( classDto.getId() );
        class1.setName( classDto.getName() );
        class1.setAuthorizedStatus( classDto.isAuthorizedStatus() );
        class1.setAuthorizedUserId( classDto.getAuthorizedUserId() );
        class1.setAcademicYear( academicYearDtoToAcademicYear( classDto.getAcademicYear() ) );
        class1.setGrade( gradeDtoToGrade( classDto.getGrade() ) );

        return class1;
    }

    protected Hostel hostelDtoToHostel(HostelDto hostelDto) {
        if ( hostelDto == null ) {
            return null;
        }

        Hostel hostel = new Hostel();

        hostel.setId( hostelDto.getId() );
        hostel.setName( hostelDto.getName() );
        hostel.setAddress( hostelDto.getAddress() );
        hostel.setPhone( hostelDto.getPhone() );
        hostel.setAuthorizedStatus( hostelDto.isAuthorizedStatus() );
        hostel.setAuthorizedUserId( hostelDto.getAuthorizedUserId() );

        return hostel;
    }

    protected Region regionDtoToRegion(RegionDto regionDto) {
        if ( regionDto == null ) {
            return null;
        }

        Region region = new Region();

        region.setId( regionDto.getId() );
        region.setName( regionDto.getName() );
        region.setAuthorizedStatus( regionDto.isAuthorizedStatus() );
        region.setAuthorizedUserId( regionDto.getAuthorizedUserId() );

        return region;
    }

    protected Student studentDtoToStudent(StudentDto studentDto) {
        if ( studentDto == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( studentDto.getId() );
        student.setRegDate( studentDto.getRegDate() );
        student.setName( studentDto.getName() );
        student.setDob( studentDto.getDob() );
        student.setSex( studentDto.getSex() );
        student.setNationality( studentDto.getNationality() );
        student.setNrc( studentDto.getNrc() );
        student.setFatherName( studentDto.getFatherName() );
        student.setMotherName( studentDto.getMotherName() );
        student.setAddress( studentDto.getAddress() );
        student.setMonasteryName( studentDto.getMonasteryName() );
        student.setMonasteryHeadmaster( studentDto.getMonasteryHeadmaster() );
        student.setMonasteryTownship( studentDto.getMonasteryTownship() );
        student.setCreatedTimestamp( studentDto.getCreatedTimestamp() );
        student.setRegion( regionDtoToRegion( studentDto.getRegion() ) );

        return student;
    }

    protected StudentClass studentClassDtoToStudentClass(StudentClassDto studentClassDto) {
        if ( studentClassDto == null ) {
            return null;
        }

        StudentClass studentClass = new StudentClass();

        studentClass.setId( studentClassDto.getId() );
        studentClass.setRegNo( studentClassDto.getRegNo() );
        studentClass.setRegSeqNo( studentClassDto.getRegSeqNo() );
        studentClass.setArrival( studentClassDto.isArrival() );
        studentClass.setCreatedTimestamp( studentClassDto.getCreatedTimestamp() );
        studentClass.setExamTitle( examTitleDtoToExamTitle( studentClassDto.getExamTitle() ) );
        studentClass.setStudentClass( classDtoToClass( studentClassDto.getStudentClass() ) );
        studentClass.setHostel( hostelDtoToHostel( studentClassDto.getHostel() ) );
        studentClass.setStudent( studentDtoToStudent( studentClassDto.getStudent() ) );

        return studentClass;
    }
}
