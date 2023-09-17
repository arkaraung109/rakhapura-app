package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.AcademicYear;
import com.pearlyadana.rakhapuraapp.model.request.AcademicYearDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T22:17:48+0630",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class AcademicYearMapperImpl implements AcademicYearMapper {

    @Override
    public AcademicYearDto mapEntityToDto(AcademicYear entity) {
        if ( entity == null ) {
            return null;
        }

        AcademicYearDto academicYearDto = new AcademicYearDto();

        academicYearDto.setId( entity.getId() );
        academicYearDto.setName( entity.getName() );
        academicYearDto.setAuthorizedStatus( entity.isAuthorizedStatus() );
        academicYearDto.setAuthorizedUserId( entity.getAuthorizedUserId() );

        return academicYearDto;
    }

    @Override
    public AcademicYear mapDtoToEntity(AcademicYearDto dto) {
        if ( dto == null ) {
            return null;
        }

        AcademicYear academicYear = new AcademicYear();

        academicYear.setId( dto.getId() );
        academicYear.setName( dto.getName() );
        academicYear.setAuthorizedStatus( dto.isAuthorizedStatus() );
        academicYear.setAuthorizedUserId( dto.getAuthorizedUserId() );

        return academicYear;
    }
}
