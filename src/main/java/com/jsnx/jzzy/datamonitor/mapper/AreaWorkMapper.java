package com.jsnx.jzzy.datamonitor.mapper;

import com.jsnx.jzzy.datamonitor.entity.AreaWork;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreaWorkMapper {

    List<AreaWork> queryAreaWork(@Param("startTime") String startTime, @Param("endTime") String endTime);


}
