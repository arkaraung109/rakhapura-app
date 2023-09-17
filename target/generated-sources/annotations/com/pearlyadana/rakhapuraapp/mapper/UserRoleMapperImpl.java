package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.UserRole;
import com.pearlyadana.rakhapuraapp.model.response.UserRoleDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T22:17:48+0630",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class UserRoleMapperImpl implements UserRoleMapper {

    @Override
    public UserRoleDto mapEntityToDto(UserRole entity) {
        if ( entity == null ) {
            return null;
        }

        UserRoleDto userRoleDto = new UserRoleDto();

        userRoleDto.setId( entity.getId() );
        userRoleDto.setName( entity.getName() );

        return userRoleDto;
    }

    @Override
    public UserRole mapDtoToEntity(UserRoleDto dto) {
        if ( dto == null ) {
            return null;
        }

        UserRole userRole = new UserRole();

        userRole.setId( dto.getId() );
        userRole.setName( dto.getName() );

        return userRole;
    }
}
