package com.jsnx.jzzy.datamonitor.controller;

import com.jsnx.jzzy.datamonitor.entity.WorkSaturation;
import com.jsnx.jzzy.datamonitor.service.WorkSaturationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
@RequestMapping("data/monitor/workSaturation")
public class WorkSaturationController {

    @Autowired
    private WorkSaturationService workSaturationService;

    @ResponseBody
        @RequestMapping("queryZyWorkSaturation")
    public List<WorkSaturation> queryZyWorkSaturation(){
        return workSaturationService.queryZyWorkSaturation();
    }

    @ResponseBody
    @RequestMapping("querySqWorkSaturation")
    public List<WorkSaturation> querySqWorkSaturation(){
        return workSaturationService.querySqWorkSaturation();
    }

}
