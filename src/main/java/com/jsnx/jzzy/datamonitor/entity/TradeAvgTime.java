package com.jsnx.jzzy.datamonitor.entity;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 22:42
 */
public class TradeAvgTime {
    private Integer zyAllTimeAvg;
    private Integer zyProcessTimeAvg;
    private Integer zyWaitTimeAvg;
    private Integer sqAllTimeAvg;
    private Integer sqProcessTimeAvg;
    private Integer sqWaitTimeAvg;

    public Integer getZyAllTimeAvg() {
        return zyAllTimeAvg;
    }

    public void setZyAllTimeAvg(Integer zyAllTimeAvg) {
        this.zyAllTimeAvg = zyAllTimeAvg;
    }

    public Integer getZyProcessTimeAvg() {
        return zyProcessTimeAvg;
    }

    public void setZyProcessTimeAvg(Integer zyProcessTimeAvg) {
        this.zyProcessTimeAvg = zyProcessTimeAvg;
    }

    public Integer getZyWaitTimeAvg() {
        return zyWaitTimeAvg;
    }

    public void setZyWaitTimeAvg(Integer zyWaitTimeAvg) {
        this.zyWaitTimeAvg = zyWaitTimeAvg;
    }

    public Integer getSqAllTimeAvg() {
        return sqAllTimeAvg;
    }

    public void setSqAllTimeAvg(Integer sqAllTimeAvg) {
        this.sqAllTimeAvg = sqAllTimeAvg;
    }

    public Integer getSqProcessTimeAvg() {
        return sqProcessTimeAvg;
    }

    public void setSqProcessTimeAvg(Integer sqProcessTimeAvg) {
        this.sqProcessTimeAvg = sqProcessTimeAvg;
    }

    public Integer getSqWaitTimeAvg() {
        return sqWaitTimeAvg;
    }

    public void setSqWaitTimeAvg(Integer sqWaitTimeAvg) {
        this.sqWaitTimeAvg = sqWaitTimeAvg;
    }
}
