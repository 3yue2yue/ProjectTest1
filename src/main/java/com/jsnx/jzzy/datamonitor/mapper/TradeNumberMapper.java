package com.jsnx.jzzy.datamonitor.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 10:05
 */
public interface TradeNumberMapper {
    Integer queryTradeNumber(@Param("type") String type, @Param("startTime") String startTime, @Param("endTime") String endTime);
}