package com.jsnx.jzzy.datamonitor.controller;

import com.jsnx.jzzy.datamonitor.entity.TotalBusiness;
import com.jsnx.jzzy.datamonitor.service.TotalBusinessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-17 19:05
 */
@RestController
@CrossOrigin
@RequestMapping("data/monitor/totalTransaction")
public class TotalTransactionController {
    private Logger logger = LoggerFactory.getLogger(TotalTransactionController.class);
    @Autowired
    private TotalBusinessService totalBusinessService;

    @RequestMapping("queryTotalBusiness")
    public TotalBusiness queryTotalBusiness() {
        return totalBusinessService.queryTotalBusiness();
    }
}
