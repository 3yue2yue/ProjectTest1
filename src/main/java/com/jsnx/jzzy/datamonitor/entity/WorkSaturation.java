package com.jsnx.jzzy.datamonitor.entity;

public class WorkSaturation {


    private String roleName;
    private Integer lineNum;
    private Integer stopNum;
    private Integer rNum;
    private Integer Average;

    public Integer getAverage() {
        return Average;
    }

    public void setAverage(Integer average) {
        Average = average;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    public Integer getStopNum() {
        return stopNum;
    }

    public void setStopNum(Integer stopNum) {
        this.stopNum = stopNum;
    }

    public Integer getrNum() {
        return rNum;
    }

    public void setrNum(Integer rNum) {
        this.rNum = rNum;
    }




}
