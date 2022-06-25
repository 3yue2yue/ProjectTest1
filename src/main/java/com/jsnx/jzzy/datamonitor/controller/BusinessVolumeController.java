package com.jsnx.jzzy.datamonitor.controller;

import com.jsnx.jzzy.datamonitor.entity.BusinessVolume;
import com.jsnx.jzzy.datamonitor.service.BusinessVolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("data/monitor/businessVolume")
public class BusinessVolumeController {

    @Autowired
    private BusinessVolumeService businessVolumeService;

    @RequestMapping("queryBusinessZyVolume")
    public List<BusinessVolume> queryBusinessZyVolume(){
        return businessVolumeService.queryBusinessZyVolume();
    }

    @RequestMapping("queryBusinessSqVolume")
    public List<BusinessVolume> queryBusinessSqVolume(){
        return businessVolumeService.queryBusinessSqVolume();
    }

}
