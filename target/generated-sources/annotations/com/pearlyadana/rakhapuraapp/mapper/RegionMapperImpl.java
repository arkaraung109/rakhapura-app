package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.Region;
import com.pearlyadana.rakhapuraapp.model.request.RegionDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T21:37:41+0630",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class RegionMapperImpl implements RegionMapper {

    @Override
    public RegionDto mapEntityToDto(Region entity) {
        if ( entity == null ) {
            return null;
        }

        RegionDto regionDto = new RegionDto();

        regionDto.setId( entity.getId() );
        regionDto.setName( entity.getName() );
        regionDto.setAuthorizedStatus( entity.isAuthorizedStatus() );
        regionDto.setAuthorizedUserId( entity.getAuthorizedUserId() );

        return regionDto;
    }

    @Override
    public Region mapDtoToEntity(RegionDto dto) {
        if ( dto == null ) {
            return null;
        }

        Region region = new Region();

        region.setId( dto.getId() );
        region.setName( dto.getName() );
        region.setAuthorizedStatus( dto.isAuthorizedStatus() );
        region.setAuthorizedUserId( dto.getAuthorizedUserId() );

        return region;
    }
}
