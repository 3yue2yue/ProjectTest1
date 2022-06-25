package com.jsnx.jzzy.datamonitor.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jsnx.jzzy.datamonitor.entity.TradeInfo;
import org.apache.ibatis.annotations.Param;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-17 21:04
 */
public interface TradeInfoMapper {
    TradeInfo queryTradeInfo(@Param("startTime") String startTime, @Param("endTime") String endTime);

    TradeInfo querySq(@Param("startTime") String startTime, @Param("endTime") String endTime);
}
