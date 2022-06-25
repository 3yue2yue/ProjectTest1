package com.jsnx.jzzy.datamonitor.mapper;

import com.jsnx.jzzy.datamonitor.entity.TradeRanking;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 14:58
 */
public interface TradeRankingMapper {

    List<TradeRanking> queryTradeRanking(@Param("type") String type, @Param("startTime") String startTime,
                                         @Param("endTime") String endTime, @Param("num") Integer num);
}
