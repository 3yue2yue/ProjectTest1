package com.jsnx.jzzy.datamonitor.controller;

import com.jsnx.jzzy.datamonitor.entity.TradeInfo;
import com.jsnx.jzzy.datamonitor.service.TradeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-17 21:13
 */
@RestController
@CrossOrigin
@RequestMapping("data/monitor/tradeInfo")
public class TradeInfoController {
    @Autowired
    public TradeInfoService tradeInfoService;

    @RequestMapping("queryTradeInfo")
    public TradeInfo queryTradeInfo() {
        return tradeInfoService.queryTradeInfo();
    }
}
