package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.Award;
import com.pearlyadana.rakhapuraapp.entity.Region;
import com.pearlyadana.rakhapuraapp.entity.Student;
import com.pearlyadana.rakhapuraapp.model.request.AwardDto;
import com.pearlyadana.rakhapuraapp.model.request.RegionDto;
import com.pearlyadana.rakhapuraapp.model.request.StudentDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T21:37:41+0630",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class AwardMapperImpl implements AwardMapper {

    @Override
    public AwardDto mapEntityToDto(Award entity) {
        if ( entity == null ) {
            return null;
        }

        AwardDto awardDto = new AwardDto();

        awardDto.setId( entity.getId() );
        awardDto.setAward( entity.getAward() );
        awardDto.setDescription( entity.getDescription() );
        awardDto.setEventDate( entity.getEventDate() );
        awardDto.setStudent( studentToStudentDto( entity.getStudent() ) );

        return awardDto;
    }

    @Override
    public Award mapDtoToEntity(AwardDto dto) {
        if ( dto == null ) {
            return null;
        }

        Award award = new Award();

        award.setId( dto.getId() );
        award.setAward( dto.getAward() );
        award.setDescription( dto.getDescription() );
        award.setEventDate( dto.getEventDate() );
        award.setStudent( studentDtoToStudent( dto.getStudent() ) );

        return award;
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
}
