package com.jsnx.jzzy.datamonitor.mapper;

import org.apache.ibatis.annotations.Param;

public interface CpsDoneMapper {
    /**
     * 查询碎片当日已完成
     * @param startTime
     * @param endTime
     * @return
     */
    Integer queryChipIdDone(@Param("startTime") String startTime, @Param("endTime") String endTime);

    /**
     * 碎片待处理
     * @param startTime
     * @param endTime
     * @return
     */
    Integer queryChipIdIsFetch(@Param("startTime") String startTime,@Param("endTime") String endTime);

    /**
     * 碎片处理中
     * @param startTime
     * @param endTime
     * @return
     */
    Integer queryChipIdIsProcess(@Param("startTime") String startTime,@Param("endTime") String endTime);

    /**
     * 问题件
     * @param startTime
     * @param endTime
     * @return
     */
    Integer problemChips(@Param("startTime") String startTime,@Param("endTime") String endTime);


}
