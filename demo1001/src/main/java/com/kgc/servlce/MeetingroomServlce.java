package com.kgc.servlce;

import com.kgc.pojo.Meetingroom;

import java.util.List;

public interface MeetingroomServlce {
    List<Meetingroom> selectAll();
    int add(Meetingroom meetingroom);
}
