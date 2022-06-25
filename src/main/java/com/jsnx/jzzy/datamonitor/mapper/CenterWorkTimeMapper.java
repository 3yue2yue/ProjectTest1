package com.jsnx.jzzy.datamonitor.mapper;

import com.jsnx.jzzy.datamonitor.entity.CenterWorkTime;
import org.apache.ibatis.annotations.Param;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 10:56
 */
public interface CenterWorkTimeMapper {
    CenterWorkTime queryCenterWorkTime(@Param("type") String type);
}
