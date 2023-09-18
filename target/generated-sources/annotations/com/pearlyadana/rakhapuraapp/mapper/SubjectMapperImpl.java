package com.pearlyadana.rakhapuraapp.mapper;

import com.pearlyadana.rakhapuraapp.entity.Subject;
import com.pearlyadana.rakhapuraapp.model.request.SubjectDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-18T08:25:59+0630",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class SubjectMapperImpl implements SubjectMapper {

    @Override
    public SubjectDto mapEntityToDto(Subject entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        boolean authorizedStatus = false;
        Long authorizedUserId = null;

        id = entity.getId();
        name = entity.getName();
        authorizedStatus = entity.isAuthorizedStatus();
        authorizedUserId = entity.getAuthorizedUserId();

        SubjectDto subjectDto = new SubjectDto( id, name, authorizedStatus, authorizedUserId );

        return subjectDto;
    }

    @Override
    public Subject mapDtoToEntity(SubjectDto dto) {
        if ( dto == null ) {
            return null;
        }

        Subject subject = new Subject();

        subject.setId( dto.getId() );
        subject.setName( dto.getName() );
        subject.setAuthorizedStatus( dto.isAuthorizedStatus() );
        subject.setAuthorizedUserId( dto.getAuthorizedUserId() );

        return subject;
    }
}
