package com.jsnx.jzzy.datamonitor.mapper;

import com.jsnx.jzzy.datamonitor.entity.TradeAvgTime;
import com.jsnx.jzzy.datamonitor.entity.TradeTotalTime;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 22:44
 */
public interface TradeTotalTimeMapper {
    TradeTotalTime queryAllTime(String startTime, String endTime);

    TradeTotalTime queryProcessTime(String startTime, String endTime);
}
