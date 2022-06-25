package com.jsnx.jzzy.datamonitor.entity;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-17 20:58
 */
public class TradeInfo {
    private Integer zyPendingNum;
    private Integer zyProcessingNum;
    private Integer zyCompletedNum;
    private Integer zyTotalNum;
    private String zyPassRate;
    private Integer sqPendingNum;
    private Integer sqProcessingNum;
    private Integer sqCompletedNum;
    private Integer sqTotalNum;
    private String sqPassRate;

    public Integer getZyPendingNum() {
        return zyPendingNum;
    }

    public void setZyPendingNum(Integer zyPendingNum) {
        this.zyPendingNum = zyPendingNum;
    }

    public Integer getZyProcessingNum() {
        return zyProcessingNum;
    }

    public void setZyProcessingNum(Integer zyProcessingNum) {
        this.zyProcessingNum = zyProcessingNum;
    }

    public Integer getZyCompletedNum() {
        return zyCompletedNum;
    }

    public void setZyCompletedNum(Integer zyCompletedNum) {
        this.zyCompletedNum = zyCompletedNum;
    }

    public Integer getZyTotalNum() {
        return zyTotalNum;
    }

    public void setZyTotalNum(Integer zyTotalNum) {
        this.zyTotalNum = zyTotalNum;
    }

    public Integer getSqPendingNum() {
        return sqPendingNum;
    }

    public void setSqPendingNum(Integer sqPendingNum) {
        this.sqPendingNum = sqPendingNum;
    }

    public Integer getSqProcessingNum() {
        return sqProcessingNum;
    }

    public void setSqProcessingNum(Integer sqProcessingNum) {
        this.sqProcessingNum = sqProcessingNum;
    }

    public Integer getSqCompletedNum() {
        return sqCompletedNum;
    }

    public void setSqCompletedNum(Integer sqCompletedNum) {
        this.sqCompletedNum = sqCompletedNum;
    }

    public Integer getSqTotalNum() {
        return sqTotalNum;
    }

    public void setSqTotalNum(Integer sqTotalNum) {
        this.sqTotalNum = sqTotalNum;
    }

    public String getZyPassRate() {
        return zyPassRate;
    }

    public void setZyPassRate(String zyPassRate) {
        this.zyPassRate = zyPassRate;
    }

    public String getSqPassRate() {
        return sqPassRate;
    }

    public void setSqPassRate(String sqPassRate) {
        this.sqPassRate = sqPassRate;
    }
}
