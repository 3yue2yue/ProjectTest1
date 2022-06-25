package com.jsnx.jzzy.datamonitor.controller;


import com.jsnx.jzzy.datamonitor.entity.BusinessVolume;
import com.jsnx.jzzy.datamonitor.entity.IndexData;
import com.jsnx.jzzy.datamonitor.service.IndexDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("data/monitor/indexData")
public class IndexDataController {

    @Autowired

    private IndexDataService indexDataService;

    @RequestMapping("queryIndexData")
    public List<IndexData> queryIndexData(){
        return indexDataService.queryIndexData();
    }

    @RequestMapping("queryOneIndexData")
    public List<IndexData> queryOneIndexData(@RequestParam Integer refresh,@RequestParam Integer traffic,@RequestParam Integer overrun,@RequestParam String rout){
        return indexDataService.queryOneIndexData(refresh,traffic,overrun,rout);
    }

}
