package com.jsnx.jzzy.datamonitor.mapper;

import com.jsnx.jzzy.datamonitor.entity.FieldValueDisagree;
import com.jsnx.jzzy.datamonitor.entity.FieldValueEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FieldValueDisagreeMapper {
    /**
     * 查询当天已进入校验岗的碎片
     * @return
     */
    List<FieldValueDisagree> filedValueDisagree(@Param("startTime") String startTime,
                                                @Param("endTime") String endTime);

    /**
     * 根据chipId查询数据
     */

    List<FieldValueEntity> getFieldValue(@Param("chipId") String chipId,
                                         @Param("startTime") String startTime,
                                         @Param("endTime") String endTime);

    /**
     * 根据chipId查询录入岗数据
     * @param chipId
     * @param startTime
     * @param endTime
     * @return
     */
    List<FieldValueEntity> getFieldValueLogging(@Param("chipId") String chipId,
                                         @Param("startTime") String startTime,
                                         @Param("endTime") String endTime);
}
