package com.jsnx.jzzy.datamonitor.mapper;

import com.jsnx.jzzy.datamonitor.entity.CpsProcessTime;
import org.apache.ibatis.annotations.Param;

public interface TotalCpsAmountMapper {
    /**
     * 查询任务累计量（已完成）
     * @return
     */
    Integer queryTotalCps();
}
