package com.kgc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Meetingroom {
    private Integer id;

    private String meetingName;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date meetingOr3der;

    private String devanceName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName == null ? null : meetingName.trim();
    }

    public Date getMeetingOr3der() {
        return meetingOr3der;
    }

    public void setMeetingOr3der(Date meetingOr3der) {
        this.meetingOr3der = meetingOr3der;
    }

    public String getDevanceName() {
        return devanceName;
    }

    public void setDevanceName(String devanceName) {
        this.devanceName = devanceName == null ? null : devanceName.trim();
    }
}