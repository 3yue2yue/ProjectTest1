package com.jsnx.jzzy.datamonitor.mapper;

import org.apache.ibatis.annotations.Param;

public interface BusinessStaticMapper {
    /**
     * 查询录入岗在线人数
     * @return
     */
    Integer queryOnlinePerson();

    /**
     * 查询校验岗在线人数
     * @return
     */
    Integer queryOnlineOfVerifyNum();


    /**
     * 录入暂停人数
     * @return
     */
    Integer queryTempClosedNum();

    /**
     * 校验暂停人数
     * @return
     */
    Integer queryTempClosedOfVerify();

    /**
     * 录入岗待处理碎片数
     * @return
     */
    Integer queryBusinessOfLogging(@Param("today") String today);

    /**
     * 校验岗待处理碎片数
     * @return
     */
    Integer queryBusinessOfVerify(@Param("today") String today);
}
