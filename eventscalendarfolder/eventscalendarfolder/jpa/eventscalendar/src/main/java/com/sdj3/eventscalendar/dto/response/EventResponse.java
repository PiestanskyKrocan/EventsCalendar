package com.sdj3.eventscalendar.dto.response;

import com.google.type.DateTime;

import java.io.Serializable;
import java.util.Date;

public class EventResponse implements Serializable {
    private Long id;
    private String event;
    private DateTime startdate;
    private DateTime enddate;

    public EventResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return event;
    }

    public void setName(String event) {
        this.event = event;
    }

    public void setStartdate(DateTime startdate) {
        this.startdate = startdate;
    }

    public void setEnddate(DateTime enddate) {
        this.enddate = enddate;
    }

    public DateTime getStartdate() {
        return startdate;
    }

    public DateTime getEnddate() {
        return enddate;
    }
}
