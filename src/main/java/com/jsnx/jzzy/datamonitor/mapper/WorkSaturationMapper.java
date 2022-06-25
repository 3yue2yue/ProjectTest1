package com.jsnx.jzzy.datamonitor.mapper;

import com.jsnx.jzzy.datamonitor.entity.WorkSaturation;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface WorkSaturationMapper {

    List<WorkSaturation> queryZyWorkSaturation();

    List<WorkSaturation> querySqWorkSaturation();
}
