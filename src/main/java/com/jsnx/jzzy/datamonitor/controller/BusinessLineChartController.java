package com.jsnx.jzzy.datamonitor.controller;

import com.jsnx.jzzy.datamonitor.entity.ServiceResponse;
import com.jsnx.jzzy.datamonitor.service.BusinessLineChartService;
import com.jsnx.jzzy.datamonitor.service.BusinessStaticService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("data/monitor/businessLineChart")
public class BusinessLineChartController {
    @Autowired
    BusinessLineChartService businessLineChartService;

    private Logger logger = LoggerFactory.getLogger(BusinessStaticController.class);

    @RequestMapping(value = "/queryCpsChartLogging", method = RequestMethod.POST)
    public ServiceResponse queryCpsChartLogging() {
        ServiceResponse res = new ServiceResponse();
        try {
            res.setResult(businessLineChartService.queryCpsChartLineData("1001"));
            res.setMessage(ServiceResponse.MESSAGE_SUCCESS, "请求成功");
        } catch (Exception e) {
            logger.error("查询失败",e);
            res.setMessage(res.MESSAGE_ERROR, "请查看后台异常！");
        }
        return res;
    }

    @RequestMapping("queryCpsChartVerify")
    public ServiceResponse queryCpsChartVerify(){
        ServiceResponse res = new ServiceResponse();
        try {
            res.setResult(businessLineChartService.queryCpsChartLineData("4001"));
            res.setMessage(ServiceResponse.MESSAGE_SUCCESS, "请求成功");
        } catch (Exception e) {
            logger.error("查询失败",e);
            res.setMessage(res.MESSAGE_ERROR, "请查看后台异常！");
        }
        return res;

    }
}
