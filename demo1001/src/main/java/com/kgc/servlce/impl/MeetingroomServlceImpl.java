package com.kgc.servlce.impl;

import com.kgc.mapper.MeetingroomMapper;
import com.kgc.pojo.Meetingroom;
import com.kgc.servlce.MeetingroomServlce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("meetingroom")
public class MeetingroomServlceImpl implements MeetingroomServlce {
    @Resource
    MeetingroomMapper meetingroomMapper;
    @Override
    public List<Meetingroom> selectAll() {
        return meetingroomMapper.selectByExample(null);
    }

    @Override
    public int add(Meetingroom meetingroom) {
        return meetingroomMapper.insert(meetingroom);
    }
}
