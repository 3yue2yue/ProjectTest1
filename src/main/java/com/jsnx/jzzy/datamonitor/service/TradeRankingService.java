package com.jsnx.jzzy.datamonitor.service;

import com.jsnx.jzzy.datamonitor.entity.TradeRanking;
import com.jsnx.jzzy.datamonitor.mapper.TradeRankingMapper;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 15:14
 */
@Service
public class TradeRankingService {
    @Resource
    private TradeRankingMapper tradeRankingMapper;

    public List<TradeRanking> queryAuthTradeRanking(Integer num) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String startTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMinimumValue().toDate());
        String endTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMaximumValue().toDate());

        return tradeRankingMapper.queryTradeRanking("0", startTime, endTime, num);
    }

    public List<TradeRanking> queryWorkTradeRanking(Integer num) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String startTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMinimumValue().toDate());
        String endTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMaximumValue().toDate());

        return tradeRankingMapper.queryTradeRanking("1", startTime, endTime, num);
    }
}
