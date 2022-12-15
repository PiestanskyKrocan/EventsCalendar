package com.sdj3.eventscalendar.controller;
import com.sdj3.eventscalendar.dto.response.EventResponse;
import com.sdj3.eventscalendar.dto.request.EventRequest;
import com.sdj3.eventscalendar.entity.EventEntity;
import com.sdj3.eventscalendar.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/event")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<EventEntity> findAllEvents() {
        return eventService.findAllEvents();
    }

    @GetMapping("/{id}")
    public Optional<EventEntity> findEventById(@PathVariable("id") Long id) {
        return eventService.findById(id);
    }

    @PostMapping
    public EventEntity saveEvent(@RequestBody EventEntity eventEntity) {
        return eventService.saveEvent(eventEntity);
    }

    @PutMapping
    public EventEntity updateEvent(@RequestBody EventEntity employeeEntity) {
        return eventService.updateEvent(employeeEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable("id") Long id) {
        eventService.deleteEvent(id);
    }

//    Using Request and Response with save and update employee

    @PostMapping("/res")
    public EventResponse saveEmpResponse(@RequestBody EventRequest eventRequest) {
        return eventService.saveEvent(eventRequest);
    }

    @PutMapping("/res/{id}")
    public EventResponse updateEmpResponse(@RequestBody EventRequest eventRequest, @PathVariable("id") Long id) {
        return eventService.updateEvent(eventRequest, id);
    }

}