package com.jsnx.jzzy.datamonitor.mapper;

import com.jsnx.jzzy.datamonitor.entity.TradeNumber;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BusinessLineChartMapper {
    List<TradeNumber> queryBusinessLineChart(@Param("today") String today
            , @Param("skillId") String skillId);

}
