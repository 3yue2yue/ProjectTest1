package com.jsnx.jzzy.datamonitor.controller;


import com.jsnx.jzzy.datamonitor.entity.BusinessStaticEntity;
import com.jsnx.jzzy.datamonitor.entity.ServiceResponse;
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
@RequestMapping("data/monitor/businessStatic")
public class BusinessStaticController {
    @Autowired
    BusinessStaticService businessStaticService;

    private Logger logger = LoggerFactory.getLogger(BusinessStaticController.class);

    @RequestMapping(value = "/queryOperStatus", method = RequestMethod.POST)
    public ServiceResponse queryOperStatus() {
        ServiceResponse res = new ServiceResponse();
        try {
            res.setResult(businessStaticService.queryBusinessStatus());
            res.setMessage(ServiceResponse.MESSAGE_SUCCESS, "请求成功");
        } catch (Exception e) {
            logger.error("查询失败",e);
            res.setMessage(res.MESSAGE_ERROR, "请查看后台异常！");
        }
        return res;
    }
}
