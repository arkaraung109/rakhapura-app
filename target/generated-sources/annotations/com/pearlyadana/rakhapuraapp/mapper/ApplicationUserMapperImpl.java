package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.ApplicationUser;
import com.pearlyadana.rakhapuraapp.entity.UserRole;
import com.pearlyadana.rakhapuraapp.model.response.ApplicationUserDto;
import com.pearlyadana.rakhapuraapp.model.response.UserRoleDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-18T08:25:59+0630",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class ApplicationUserMapperImpl implements ApplicationUserMapper {

    @Override
    public ApplicationUserDto mapEntityToDto(ApplicationUser entity) {
        if ( entity == null ) {
            return null;
        }

        ApplicationUserDto applicationUserDto = new ApplicationUserDto();

        applicationUserDto.setId( entity.getId() );
        applicationUserDto.setFirstName( entity.getFirstName() );
        applicationUserDto.setLastName( entity.getLastName() );
        applicationUserDto.setLoginUserName( entity.getLoginUserName() );
        applicationUserDto.setPassword( entity.getPassword() );
        applicationUserDto.setActiveStatus( entity.isActiveStatus() );
        applicationUserDto.setRole( userRoleToUserRoleDto( entity.getRole() ) );

        return applicationUserDto;
    }

    @Override
    public ApplicationUser mapDtoToEntity(ApplicationUserDto dto) {
        if ( dto == null ) {
            return null;
        }

        ApplicationUser applicationUser = new ApplicationUser();

        applicationUser.setId( dto.getId() );
        applicationUser.setFirstName( dto.getFirstName() );
        applicationUser.setLastName( dto.getLastName() );
        applicationUser.setLoginUserName( dto.getLoginUserName() );
        applicationUser.setPassword( dto.getPassword() );
        applicationUser.setActiveStatus( dto.isActiveStatus() );
        applicationUser.setRole( userRoleDtoToUserRole( dto.getRole() ) );

        return applicationUser;
    }

    protected UserRoleDto userRoleToUserRoleDto(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }

        UserRoleDto userRoleDto = new UserRoleDto();

        userRoleDto.setId( userRole.getId() );
        userRoleDto.setName( userRole.getName() );

        return userRoleDto;
    }

    protected UserRole userRoleDtoToUserRole(UserRoleDto userRoleDto) {
        if ( userRoleDto == null ) {
            return null;
        }

        UserRole userRole = new UserRole();

        userRole.setId( userRoleDto.getId() );
        userRole.setName( userRoleDto.getName() );

        return userRole;
    }
}
