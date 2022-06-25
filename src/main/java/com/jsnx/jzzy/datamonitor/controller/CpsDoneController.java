package com.jsnx.jzzy.datamonitor.controller;

import com.jsnx.jzzy.datamonitor.entity.AreaWork;
import com.jsnx.jzzy.datamonitor.entity.CPSDone;
import com.jsnx.jzzy.datamonitor.entity.CpsProcessTime;
import com.jsnx.jzzy.datamonitor.entity.ServiceResponse;
import com.jsnx.jzzy.datamonitor.mapper.TotalCpsAmountMapper;
import com.jsnx.jzzy.datamonitor.service.CpsDoneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("data/monitor/cpsDone")
public class CpsDoneController {
    @Autowired
    CpsDoneService cpsDoneService;
    private Logger logger = LoggerFactory.getLogger(AveCpsProcessTimeController.class);

    @RequestMapping("queryBasicCpsData")
    public ServiceResponse queryBasicCpsData(){
        ServiceResponse res = new ServiceResponse();
        try {
            res.setResult(cpsDoneService.getCpsDoneAmount());
            res.setMessage(ServiceResponse.MESSAGE_SUCCESS, "请求成功");
        } catch (Exception e){
            logger.error("查询失败",e);
            res.setMessage(res.MESSAGE_ERROR, "请查看后台异常！");
        }
        return res;
    }

    @RequestMapping("queryTotalCpsAmount")
    public ServiceResponse queryTotalCpsAmount(){
        ServiceResponse res = new ServiceResponse();
        Map<String,Object> map = new HashMap<>();
        try {
            map.put("totalCps",cpsDoneService.queryTotalCps());
            res.setResult(map);
            res.setMessage(ServiceResponse.MESSAGE_SUCCESS, "请求成功");
        } catch (Exception e){
            logger.error("查询失败",e);
            res.setMessage(res.MESSAGE_ERROR, "请查看后台异常！");
        }
        return res;
    }
}
