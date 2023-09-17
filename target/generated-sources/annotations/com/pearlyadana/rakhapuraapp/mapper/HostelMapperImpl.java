package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.Hostel;
import com.pearlyadana.rakhapuraapp.model.request.HostelDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T21:37:41+0630",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class HostelMapperImpl implements HostelMapper {

    @Override
    public HostelDto mapEntityToDto(Hostel entity) {
        if ( entity == null ) {
            return null;
        }

        HostelDto hostelDto = new HostelDto();

        hostelDto.setId( entity.getId() );
        hostelDto.setName( entity.getName() );
        hostelDto.setAddress( entity.getAddress() );
        hostelDto.setPhone( entity.getPhone() );
        hostelDto.setAuthorizedStatus( entity.isAuthorizedStatus() );
        hostelDto.setAuthorizedUserId( entity.getAuthorizedUserId() );

        return hostelDto;
    }

    @Override
    public Hostel mapDtoToEntity(HostelDto dto) {
        if ( dto == null ) {
            return null;
        }

        Hostel hostel = new Hostel();

        hostel.setId( dto.getId() );
        hostel.setName( dto.getName() );
        hostel.setAddress( dto.getAddress() );
        hostel.setPhone( dto.getPhone() );
        hostel.setAuthorizedStatus( dto.isAuthorizedStatus() );
        hostel.setAuthorizedUserId( dto.getAuthorizedUserId() );

        return hostel;
    }
}
