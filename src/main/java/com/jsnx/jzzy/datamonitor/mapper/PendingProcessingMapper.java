package com.jsnx.jzzy.datamonitor.mapper;

import com.jsnx.jzzy.datamonitor.entity.PendingProcessing;
import org.apache.ibatis.annotations.Param;

public interface PendingProcessingMapper {

    PendingProcessing queryPendingProcessing(@Param("state") String state,@Param("createtime") String createtime);

    PendingProcessing querySqPendingProcessing(@Param("state") String state,@Param("createtime") String createtime);

}
