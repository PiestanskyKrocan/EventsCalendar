package com.sdj3.eventscalendar.entity;

import com.google.type.DateTime;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mt_event")
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "startdate")
    private DateTime startdate;

    @Column(name = "enddate")
    private DateTime enddate;

    @Column(name = "address")
    private String address;

    public EventEntity() {
    }

    public EventEntity(Long id, String name, DateTime startdate, DateTime enddate) {
        this.id = id;
        this.name = name;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getEnddate() {
        return enddate;
    }

    public DateTime getStartdate() {
        return startdate;
    }

    public void setStartdate(DateTime startdate) {
        this.startdate = startdate;
    }

    public void setEnddate(DateTime enddate) {
        this.enddate = enddate;
    }

}
