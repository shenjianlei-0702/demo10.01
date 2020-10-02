package com.kgc.controller;

import com.kgc.pojo.Meetingroom;
import com.kgc.servlce.MeetingroomServlce;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
public class MeetingroomContriller {
    @Resource
    MeetingroomServlce meetingroomServlce;
    @RequestMapping("index")
    public String selectAll(Model model){
        List<Meetingroom> meetingrooms=meetingroomServlce.selectAll();
        model.addAttribute("list",meetingrooms);
        return "index";
    }
    @RequestMapping("addAll")
    public String add(){

        return "add";
    }
    @RequestMapping("selectadd")
    public String addAll(String meetingName,String devanceName){
        Meetingroom m=new Meetingroom();
        m.setDevanceName(devanceName);
        m.setMeetingName(meetingName);
        m.setMeetingOr3der(new Date());
        int i=meetingroomServlce.add(m);
        return "redirect:index";
    }
}
