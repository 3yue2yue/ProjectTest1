package com.jsnx.jzzy.datamonitor.entity;

public class BusinessStaticEntity {
    /**
     * 录入岗在线人数
     */
    private Integer onlinePersonNum;

    /**
     * 校验岗在线人数
     */
    private Integer onlineOfVerifyNum;

    /**
     * 录入岗暂停人数
     */
    private Integer tempClosedNum;

    /**
     * 校验岗暂停人数
     */
    private Integer tempClosedOfVerify;

    /**
     * 录入岗待处理碎片数
     */
    private Integer businessOfLoggingNum;

    /**
     * 校验岗待处理碎片数
     */
    private Integer businessOfVerifyNum;

    /**
     * 录入岗人均待处理碎片数
     */
    private Integer aveBusinessOfLogging;

    /**
     * 校验岗人均待处理碎片数
     */
    private Integer aveBusinessOfVerify;

    public Integer getBusinessOfLoggingNum() {
        return businessOfLoggingNum;
    }

    public void setBusinessOfLoggingNum(Integer businessOfLoggingNum) {
        this.businessOfLoggingNum = businessOfLoggingNum;
    }

    public Integer getBusinessOfVerifyNum() {
        return businessOfVerifyNum;
    }

    public void setBusinessOfVerifyNum(Integer businessOfVerifyNum) {
        this.businessOfVerifyNum = businessOfVerifyNum;
    }

    public Integer getAveBusinessOfLogging() {
        return aveBusinessOfLogging;
    }

    public void setAveBusinessOfLogging(Integer aveBusinessOfLogging) {
        this.aveBusinessOfLogging = aveBusinessOfLogging;
    }

    public Integer getAveBusinessOfVerify() {
        return aveBusinessOfVerify;
    }

    public void setAveBusinessOfVerify(Integer aveBusinessOfVerify) {
        this.aveBusinessOfVerify = aveBusinessOfVerify;
    }



    public Integer getOnlineOfVerifyNum() {
        return onlineOfVerifyNum;
    }

    public void setOnlineOfVerifyNum(Integer onlineOfVerifyNum) {
        this.onlineOfVerifyNum = onlineOfVerifyNum;
    }

    public Integer getTempClosedNum() {
        return tempClosedNum;
    }

    public void setTempClosedNum(Integer tempClosedNum) {
        this.tempClosedNum = tempClosedNum;
    }

    public Integer getTempClosedOfVerify() {
        return tempClosedOfVerify;
    }

    public void setTempClosedOfVerify(Integer tempClosedOfVerify) {
        this.tempClosedOfVerify = tempClosedOfVerify;
    }



    public Integer getOnlinePersonNum() {
        return onlinePersonNum;
    }

    public void setOnlinePersonNum(Integer onlinePersonNum) {
        this.onlinePersonNum = onlinePersonNum;
    }
}
