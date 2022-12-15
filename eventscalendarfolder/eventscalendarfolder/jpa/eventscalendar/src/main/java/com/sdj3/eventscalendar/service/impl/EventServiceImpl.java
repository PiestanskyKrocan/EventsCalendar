package com.sdj3.eventscalendar.service.impl;
import com.sdj3.eventscalendar.dto.mapper.EventMapper;
import com.sdj3.eventscalendar.dto.request.EventRequest;
import com.sdj3.eventscalendar.dto.response.EventResponse;
import com.sdj3.eventscalendar.entity.EventEntity;
import com.sdj3.eventscalendar.respiratory.EventRepository;
import com.sdj3.eventscalendar.service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<EventEntity> findAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Optional<EventEntity> findById(Long id) {
        return eventRepository.findById(id);
    }

    @Override
    public EventEntity saveEvent(EventEntity eventEntity) {
        return eventRepository.save(eventEntity);
    }

    @Override
    public EventEntity updateEvent(EventEntity eventEntity) {
        return eventRepository.save(eventEntity);
    }

    @Override
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }


    @Override
    public EventResponse saveEvent(EventRequest eventRequest) {
        EventEntity eventEntity = EventMapper.MAPPER.fromRequestToEntity(eventRequest);
        eventRepository.save(eventEntity);
        return EventMapper.MAPPER.fromEntityToResponse(eventEntity);
    }

    @Override
    public EventResponse updateEvent(EventRequest eventRequest, Long id) {

        Optional<EventEntity> checkExistingEvent = findById(id);
        if (!checkExistingEvent.isPresent())
            throw new RuntimeException("Event Id " + id + " Not Found!");

        EventEntity eventEntity = EventMapper.MAPPER.fromRequestToEntity(eventRequest);
        eventEntity.setId(id);
        eventRepository.save(eventEntity);
        return EventMapper.MAPPER.fromEntityToResponse(eventEntity);
    }
}

