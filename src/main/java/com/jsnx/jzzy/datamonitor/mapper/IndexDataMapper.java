package com.jsnx.jzzy.datamonitor.mapper;

import com.jsnx.jzzy.datamonitor.entity.IndexData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndexDataMapper {

    IndexData queryIndexData(@Param("rout") String rout);

    void updateIndexData(@Param("refresh") Integer refresh,@Param("traffic") Integer traffic,@Param("overrun") Integer overrun,@Param("rout") String rout);

}
