package com.jsnx.jzzy.datamonitor.controller;

import com.jsnx.jzzy.datamonitor.entity.TradeRanking;
import com.jsnx.jzzy.datamonitor.service.TradeRankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 16:25
 */
@RestController
@CrossOrigin
@RequestMapping("data/monitor/tradeRanking")
public class TradeRankingController {
    @Autowired
    private TradeRankingService tradeRankingService;

    @RequestMapping("queryAuthTradeRanking")
    public List<TradeRanking> queryAuthTradeRanking(Integer num) {
        return tradeRankingService.queryAuthTradeRanking(num);
    }

    @RequestMapping("queryWorkTradeRanking")
    public List<TradeRanking> queryWorkTradeRanking(Integer num) {
        return tradeRankingService.queryWorkTradeRanking(num);
    }

}
