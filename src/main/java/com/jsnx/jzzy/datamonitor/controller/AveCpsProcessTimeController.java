package com.jsnx.jzzy.datamonitor.controller;

import com.jsnx.jzzy.datamonitor.entity.ServiceResponse;
import com.jsnx.jzzy.datamonitor.service.AveCpsProcessTimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("data/monitor/cpsProcessTime")
public class AveCpsProcessTimeController {
    @Autowired
    AveCpsProcessTimeService aveCpsProcessTimeService;

    private Logger logger = LoggerFactory.getLogger(AveCpsProcessTimeController.class);

    @RequestMapping("aveProcessTime")
    public ServiceResponse aveProcessTime(){
        ServiceResponse res = new ServiceResponse();
        try {
            res.setResult(aveCpsProcessTimeService.getAveProcessTime());
            res.setMessage(ServiceResponse.MESSAGE_SUCCESS, "请求成功");
        } catch (Exception e){
            logger.error("查询失败",e);
            res.setMessage(res.MESSAGE_ERROR, "请查看后台异常！");
        }
        return res;
    }

}
