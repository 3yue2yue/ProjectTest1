package com.jsnx.jzzy.datamonitor.entity;

public class CPSDone {
    /**
     * 碎片已完成
     */
    private Integer chipIdDone;

    /**
     * 碎片待处理
     */
    private Integer chipIdIsFetch;

    /**
     * 碎片处理中
     */
    private Integer chipIdIsProcess;

    /**
     * 问题件
     */
    private Integer problemChips;

    /**
     * 两录一校不一致
     */
    private Integer filedValueDisagree;

    public Integer getFiledValueDisagree() {
        return filedValueDisagree;
    }

    public void setFiledValueDisagree(Integer filedValueDisagree) {
        this.filedValueDisagree = filedValueDisagree;
    }


    /**
     * 碎片通过率
     */
    private String passingRate;

    public String getPassingRate() {
        return passingRate;
    }

    public void setPassingRate(String passingRate) {
        this.passingRate = passingRate;
    }

    public Integer getChipIdIsProcess() {
        return chipIdIsProcess;
    }

    public void setChipIdIsProcess(Integer chipIdIsProcess) {
        this.chipIdIsProcess = chipIdIsProcess;
    }

    public Integer getProblemChips() {
        return problemChips;
    }

    public void setProblemChips(Integer problemChips) {
        this.problemChips = problemChips;
    }

    public Integer getChipIdDone() {
        return chipIdDone;
    }

    public void setChipIdDone(Integer chipIdDone) {
        this.chipIdDone = chipIdDone;
    }

    public Integer getChipIdIsFetch() {
        return chipIdIsFetch;
    }

    public void setChipIdIsFetch(Integer chipIdIsFetch) {
        this.chipIdIsFetch = chipIdIsFetch;
    }
}
