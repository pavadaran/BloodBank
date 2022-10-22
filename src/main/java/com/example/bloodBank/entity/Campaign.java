package com.example.bloodBank.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Table(name="campaign")
@Entity
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "campaign_id")
    private Integer campaign_id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private Time time;

    @Column(name = "status")
    private Character status;

    public Campaign(Integer campaign_id, String name, String location, Date date, Time time, Character status) {
        this.campaign_id = campaign_id;
        this.name = name;
        this.location = location;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public Campaign(){ }

    public Integer getCampaign_id() {
        return campaign_id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public Character getStatus() {
        return status;
    }

    public void setCampaign_id(Integer campaign_id) {
        this.campaign_id = campaign_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setStatus(Character status) {
        this.status = status;
    }
}
