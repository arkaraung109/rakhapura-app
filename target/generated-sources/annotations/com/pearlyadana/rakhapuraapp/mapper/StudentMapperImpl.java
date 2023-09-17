package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.Region;
import com.pearlyadana.rakhapuraapp.entity.Student;
import com.pearlyadana.rakhapuraapp.model.request.RegionDto;
import com.pearlyadana.rakhapuraapp.model.request.StudentDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T22:17:48+0630",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDto mapEntityToDto(Student entity) {
        if ( entity == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setId( entity.getId() );
        studentDto.setRegDate( entity.getRegDate() );
        studentDto.setName( entity.getName() );
        studentDto.setDob( entity.getDob() );
        studentDto.setSex( entity.getSex() );
        studentDto.setNationality( entity.getNationality() );
        studentDto.setNrc( entity.getNrc() );
        studentDto.setFatherName( entity.getFatherName() );
        studentDto.setMotherName( entity.getMotherName() );
        studentDto.setAddress( entity.getAddress() );
        studentDto.setMonasteryName( entity.getMonasteryName() );
        studentDto.setMonasteryHeadmaster( entity.getMonasteryHeadmaster() );
        studentDto.setMonasteryTownship( entity.getMonasteryTownship() );
        studentDto.setCreatedTimestamp( entity.getCreatedTimestamp() );
        studentDto.setRegion( regionToRegionDto( entity.getRegion() ) );

        return studentDto;
    }

    @Override
    public Student mapDtoToEntity(StudentDto dto) {
        if ( dto == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( dto.getId() );
        student.setRegDate( dto.getRegDate() );
        student.setName( dto.getName() );
        student.setDob( dto.getDob() );
        student.setSex( dto.getSex() );
        student.setNationality( dto.getNationality() );
        student.setNrc( dto.getNrc() );
        student.setFatherName( dto.getFatherName() );
        student.setMotherName( dto.getMotherName() );
        student.setAddress( dto.getAddress() );
        student.setMonasteryName( dto.getMonasteryName() );
        student.setMonasteryHeadmaster( dto.getMonasteryHeadmaster() );
        student.setMonasteryTownship( dto.getMonasteryTownship() );
        student.setCreatedTimestamp( dto.getCreatedTimestamp() );
        student.setRegion( regionDtoToRegion( dto.getRegion() ) );

        return student;
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
}
