package com.jsnx.jzzy.datamonitor.controller;

import com.jsnx.jzzy.datamonitor.entity.AreaWork;
import com.jsnx.jzzy.datamonitor.service.AreaWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("data/monitor/areaWork")
public class AreaWorkController {

    @Autowired
    private  AreaWorkService areaWorkService;

    @RequestMapping("queryAreaWork")
    public List<AreaWork> queryAreaWork(){
        return areaWorkService.queryAreaWork();
    }

}
