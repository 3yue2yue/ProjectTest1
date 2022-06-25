package com.jsnx.jzzy.datamonitor.mapper;

import com.jsnx.jzzy.datamonitor.entity.CpsProcessTime;
import org.apache.ibatis.annotations.Param;

public interface CpsProcessTimeMapper {
    /**
     * 查询录入岗碎片数，处理时间。校验岗碎片数，处理时间
     * @param today
     * @return
     */
    CpsProcessTime aveCpsProcessTime(@Param("today") String today);

}
