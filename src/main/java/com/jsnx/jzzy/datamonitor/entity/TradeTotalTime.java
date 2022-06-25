package com.jsnx.jzzy.datamonitor.entity;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 22:42
 */
public class TradeTotalTime {
    private Integer zyAllTime;
    private Integer zyProcessTime;
    private Integer zyWaitTime;
    private Integer zyNum;
    private Integer sqAllTime;
    private Integer sqProcessTime;
    private Integer sqWaitTime;
    private Integer sqNum;

    public Integer getZyAllTime() {
        return zyAllTime;
    }

    public void setZyAllTime(Integer zyAllTime) {
        this.zyAllTime = zyAllTime;
    }

    public Integer getZyProcessTime() {
        return zyProcessTime;
    }

    public void setZyProcessTime(Integer zyProcessTime) {
        this.zyProcessTime = zyProcessTime;
    }

    public Integer getZyWaitTime() {
        return zyWaitTime;
    }

    public void setZyWaitTime(Integer zyWaitTime) {
        this.zyWaitTime = zyWaitTime;
    }

    public Integer getZyNum() {
        return zyNum;
    }

    public void setZyNum(Integer zyNum) {
        this.zyNum = zyNum;
    }

    public Integer getSqAllTime() {
        return sqAllTime;
    }

    public void setSqAllTime(Integer sqAllTime) {
        this.sqAllTime = sqAllTime;
    }

    public Integer getSqProcessTime() {
        return sqProcessTime;
    }

    public void setSqProcessTime(Integer sqProcessTime) {
        this.sqProcessTime = sqProcessTime;
    }

    public Integer getSqWaitTime() {
        return sqWaitTime;
    }

    public void setSqWaitTime(Integer sqWaitTime) {
        this.sqWaitTime = sqWaitTime;
    }

    public Integer getSqNum() {
        return sqNum;
    }

    public void setSqNum(Integer sqNum) {
        this.sqNum = sqNum;
    }
}
