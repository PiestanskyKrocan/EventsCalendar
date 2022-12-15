package com.sdj3.eventscalendar.dto.mapper;

import com.sdj3.eventscalendar.dto.request.EventRequest;
import com.sdj3.eventscalendar.dto.response.EventResponse;
import com.sdj3.eventscalendar.entity.EventEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-09T03:17:26+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class EventMapperImpl implements EventMapper {

    @Override
    public EventEntity fromRequestToEntity(EventRequest eventRequest) {
        if ( eventRequest == null ) {
            return null;
        }

        EventEntity eventEntity = new EventEntity();

        eventEntity.setName( eventRequest.getName() );
        eventEntity.setStartdate( eventRequest.getStartdate() );
        eventEntity.setEnddate( eventRequest.getEnddate() );

        return eventEntity;
    }

    @Override
    public EventResponse fromEntityToResponse(EventEntity eventEntity) {
        if ( eventEntity == null ) {
            return null;
        }

        EventResponse eventResponse = new EventResponse();

        eventResponse.setId( eventEntity.getId() );
        eventResponse.setName( eventEntity.getName() );
        eventResponse.setStartdate( eventEntity.getStartdate() );
        eventResponse.setEnddate( eventEntity.getEnddate() );

        return eventResponse;
    }
}
