package com.jsnx.jzzy.datamonitor.controller;

import com.jsnx.jzzy.datamonitor.entity.LrgalRanking;
import com.jsnx.jzzy.datamonitor.entity.TradeRanking;
import com.jsnx.jzzy.datamonitor.service.LrgalRankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 21:06
 */
@RestController
@CrossOrigin
    @RequestMapping("data/monitor/lrgalRanking")
public class LrgalRankingController {
    @Autowired
    private LrgalRankingService lrgalRankingService;

    @RequestMapping("queryAuthLraglRanking")
    public List<LrgalRanking> queryAuthLraglRanking(Integer num) {
        return lrgalRankingService.queryAuthLraglRanking(num);
    }

    @RequestMapping("queryWorkLraglRanking")
    public List<LrgalRanking> queryWorkLraglRanking(Integer num) {
        return lrgalRankingService.queryWorkLraglRanking(num);
    }
}
