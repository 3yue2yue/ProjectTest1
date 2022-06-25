package com.jsnx.jzzy.datamonitor.mapper;

import com.jsnx.jzzy.datamonitor.entity.LrgalRanking;
import com.jsnx.jzzy.datamonitor.entity.TradeRanking;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 17:00
 */
public interface LrgalRankingMapper {
    List<LrgalRanking> queryLrgalRanking(@Param("type") String type, @Param("startTime") String startTime,
                                         @Param("endTime") String endTime, @Param("num") Integer num);

    List<LrgalRanking> queryWorkRanking(@Param("type") String type, @Param("startTime") String startTime,
                                         @Param("endTime") String endTime, @Param("num") Integer num);
}
