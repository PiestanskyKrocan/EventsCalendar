package com.sdj3.eventscalendar.dto.mapper;

import com.sdj3.eventscalendar.dto.request.EventRequest;
import com.sdj3.eventscalendar.dto.response.EventResponse;
import com.sdj3.eventscalendar.entity.EventEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EventMapper {
    EventMapper MAPPER = Mappers.getMapper(EventMapper.class);
    EventEntity fromRequestToEntity(EventRequest eventRequest);
    EventResponse fromEntityToResponse(EventEntity eventEntity);
}
