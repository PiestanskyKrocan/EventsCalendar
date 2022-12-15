package com.sdj3.eventscalendar.service;

import com.sdj3.eventscalendar.dto.request.EventRequest;
import com.sdj3.eventscalendar.dto.response.EventResponse;
import com.sdj3.eventscalendar.entity.EventEntity;

import java.util.List;
import java.util.Optional;


public interface EventService {
    List<EventEntity> findAllEvents();

    Optional<EventEntity> findById(Long id);

    EventEntity saveEvent(EventEntity eventEntity);

    EventEntity updateEvent(EventEntity eventEntity);


    void deleteEvent(Long id);

    EventResponse saveEvent(EventRequest eventRequest);

    EventResponse updateEvent(EventRequest eventRequest, Long id);
}
