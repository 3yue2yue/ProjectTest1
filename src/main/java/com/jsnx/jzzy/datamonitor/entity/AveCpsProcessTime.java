package com.jsnx.jzzy.datamonitor.entity;

public class AveCpsProcessTime {
    /**
     *录入岗平均处理时间
     */
    private Integer aveLoggingTime;

    /**
     *校验岗平均处理时间
     */
    private Integer aveVerifyTime;

    public Integer getAveLoggingTime() {
        return aveLoggingTime;
    }

    public void setAveLoggingTime(Integer aveLoggingTime) {
        this.aveLoggingTime = aveLoggingTime;
    }

    public Integer getAveVerifyTime() {
        return aveVerifyTime;
    }

    public void setAveVerifyTime(Integer aveVerifyTime) {
        this.aveVerifyTime = aveVerifyTime;
    }
}
