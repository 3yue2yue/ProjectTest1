package com.jsnx.jzzy.datamonitor.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.alibaba.fastjson.JSON;
import com.jsnx.jzzy.datamonitor.entity.TradeAvgTime;
import com.jsnx.jzzy.datamonitor.entity.TradeTotalTime;
import com.jsnx.jzzy.datamonitor.mapper.TradeTotalTimeMapper;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 23:00
 */
@Service
public class TradeAvgTimeService {
    @Resource
    private TradeTotalTimeMapper tradeTotalTimeMapper;

    public TradeAvgTime queryTradeAvgTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String startTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMinimumValue().toDate());
        String endTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMaximumValue().toDate());

        TradeTotalTime tradeTotalTime = tradeTotalTimeMapper.queryAllTime(startTime, endTime);
        TradeTotalTime tradeProcessTime = tradeTotalTimeMapper.queryProcessTime(startTime, endTime);
        TradeAvgTime tradeAvgTime = new TradeAvgTime();
        if(tradeTotalTime != null){
            if (Objects.isNull(tradeTotalTime.getZyNum()) || 0 == tradeTotalTime.getZyNum()) {
                tradeAvgTime.setZyAllTimeAvg(0);
                tradeAvgTime.setZyProcessTimeAvg(0);
                tradeAvgTime.setZyWaitTimeAvg(0);
            } else {
                tradeAvgTime.setZyAllTimeAvg(new BigDecimal(tradeTotalTime.getZyAllTime())
                        .divide(new BigDecimal(tradeTotalTime.getZyNum()), BigDecimal.ROUND_HALF_UP)
                        .setScale(0).intValue());
                tradeAvgTime.setZyProcessTimeAvg(new BigDecimal(tradeProcessTime.getZyProcessTime()).divide(new BigDecimal(tradeTotalTime.getZyNum()), BigDecimal.ROUND_HALF_UP).setScale(0).intValue());
                tradeAvgTime.setZyWaitTimeAvg(new BigDecimal(tradeTotalTime.getZyAllTime()).subtract(new BigDecimal(tradeProcessTime.getZyProcessTime())).divide(new BigDecimal(tradeTotalTime.getZyNum()), BigDecimal.ROUND_HALF_UP).setScale(0).intValue());
            }
        }else{
            tradeAvgTime.setZyAllTimeAvg(0);
            tradeAvgTime.setZyProcessTimeAvg(0);
            tradeAvgTime.setZyWaitTimeAvg(0);
        }
        if(tradeProcessTime != null){
            if (Objects.isNull(tradeTotalTime.getSqNum()) || 0 == tradeTotalTime.getSqNum()) {
                tradeAvgTime.setSqAllTimeAvg(0);
                tradeAvgTime.setSqProcessTimeAvg(0);
                tradeAvgTime.setSqWaitTimeAvg(0);
            } else {
                tradeAvgTime.setSqAllTimeAvg(new BigDecimal(tradeTotalTime.getSqAllTime()).divide(new BigDecimal(tradeTotalTime.getSqNum()), BigDecimal.ROUND_HALF_UP).setScale(0).intValue());
                tradeAvgTime.setSqProcessTimeAvg(new BigDecimal(tradeProcessTime.getSqProcessTime()).divide(new BigDecimal(tradeTotalTime.getSqNum()), BigDecimal.ROUND_HALF_UP).setScale(0).intValue());
                tradeAvgTime.setSqWaitTimeAvg(new BigDecimal(tradeTotalTime.getSqAllTime()).subtract(new BigDecimal(tradeProcessTime.getSqProcessTime())).divide(new BigDecimal(tradeTotalTime.getSqNum()), BigDecimal.ROUND_HALF_UP).setScale(0).intValue());
            }
        }else{
            tradeAvgTime.setSqAllTimeAvg(0);
            tradeAvgTime.setSqProcessTimeAvg(0);
            tradeAvgTime.setSqWaitTimeAvg(0);
        }
        return tradeAvgTime;
    }
}
