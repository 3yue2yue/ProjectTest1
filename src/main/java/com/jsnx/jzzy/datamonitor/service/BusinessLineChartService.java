package com.jsnx.jzzy.datamonitor.service;

import com.jsnx.jzzy.datamonitor.entity.TradeNumber;
import com.jsnx.jzzy.datamonitor.mapper.BusinessLineChartMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class BusinessLineChartService {
    @Resource
    BusinessLineChartMapper businessLineChartMapper;

    /**
     * 根据岗位技能查询各个时间段内碎片任务数
     * @param skillId
     * @return
     */
    public Map<String, Integer> queryCpsChartLineData(String skillId) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String today = format.format(date);
//        String today = "20220616";

        List<TradeNumber> tradeNumbersLogging = businessLineChartMapper
                .queryBusinessLineChart(today, skillId);
        Map<String, Integer> map = new HashMap<>();
        q:for (int i = 7; i <= 24; i++) {
            for (int j = 0; j < tradeNumbersLogging.size(); j++) {
                String getTime = tradeNumbersLogging.get(j).getTime();
                String getTimeOfHour = getTime.substring(getTime.indexOf(":") + 1
                        , getTime.length()).trim();
                if (i == Integer.valueOf(getTimeOfHour)) {
                    map.put(String.valueOf(i), tradeNumbersLogging.get(j).getNumber());
                    continue q;
                }
            }
//            map.put(String.format("%02d", i), 0);
            map.put(String.valueOf(i),0);
            continue ;
        }
        return map;
    }
}
