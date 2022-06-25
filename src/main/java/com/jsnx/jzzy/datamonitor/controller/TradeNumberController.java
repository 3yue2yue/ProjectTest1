package com.jsnx.jzzy.datamonitor.controller;

import com.jsnx.jzzy.datamonitor.entity.TradeNumber;
import com.jsnx.jzzy.datamonitor.service.TradeNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 14:26
 */
@RestController
@CrossOrigin
@RequestMapping("data/monitor/tradeNumber")
public class TradeNumberController {
    @Autowired
    private TradeNumberService tradeNumberService;

    @RequestMapping("queryAuthTradeNumber")
    public List<TradeNumber> queryAuthTradeNumber() throws ParseException {
        return tradeNumberService.queryAuthTradeNumber();
    }

    @RequestMapping("queryWorkTradeNumber")
    public List<TradeNumber> queryWorkTradeNumber() throws ParseException {
        return tradeNumberService.queryWorkTradeNumber();
    }
}
