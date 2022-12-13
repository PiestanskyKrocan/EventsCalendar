package com.sdj3.eventscalendar.dto.request;

import com.google.type.DateTime;

import java.io.Serializable;
import java.util.Date;

public class EventRequest implements Serializable {
    private String event;
    private DateTime startdate;
    private DateTime enddate;

    public String getName() {
        return event;
    }

    public void setName(String name) {
        this.event = name;
    }

    public DateTime getStartdate() {
        return startdate;
    }

    public DateTime getEnddate() {
        return enddate;
    }

    public void setStartdate(DateTime startdate) {
        this.startdate = startdate;
    }

    public void setEnddate(DateTime enddate) {
        this.enddate = enddate;
    }

}
