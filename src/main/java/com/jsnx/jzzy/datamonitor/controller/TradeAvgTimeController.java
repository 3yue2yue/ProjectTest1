package com.jsnx.jzzy.datamonitor.controller;

import com.jsnx.jzzy.datamonitor.entity.TradeAvgTime;
import com.jsnx.jzzy.datamonitor.service.TradeAvgTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 23:19
 */
@RestController
@CrossOrigin
@RequestMapping("data/monitor/tradeAvgTime")
public class TradeAvgTimeController {
    @Autowired
    private TradeAvgTimeService tradeAvgTimeService;

    @RequestMapping("queryTradeAvgTime")
    public TradeAvgTime queryTradeAvgTime() {
        return tradeAvgTimeService.queryTradeAvgTime();
    }
}
