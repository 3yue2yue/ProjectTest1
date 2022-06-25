package com.jsnx.jzzy.datamonitor.mapper;

import com.jsnx.jzzy.datamonitor.entity.BusinessVolume;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BusinessVolumeMapper {

    List<BusinessVolume> queryBusinessSqVolume(@Param("startTime") String startTime, @Param("endTime") String endTime);

    List<BusinessVolume> queryBusinessZyVolume(@Param("startTime") String startTime, @Param("endTime") String endTime);
}
