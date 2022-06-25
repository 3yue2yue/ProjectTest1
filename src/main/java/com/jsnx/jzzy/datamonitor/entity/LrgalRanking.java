package com.jsnx.jzzy.datamonitor.entity;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 17:01
 */
public class LrgalRanking {
    private String lrgal;
    private String lrgalName;
    private Integer num;
    private Integer ranking;
    private String passRate;
    private Integer sqComplete;
    private Integer sqTotal;
    private Integer zyComplete;
    private Integer zyTotal;

    public Integer getZyComplete() {
        return zyComplete;
    }

    public void setZyComplete(Integer zyComplete) {
        this.zyComplete = zyComplete;
    }

    public Integer getZyTotal() {
        return zyTotal;
    }

    public void setZyTotal(Integer zyTotal) {
        this.zyTotal = zyTotal;
    }

    public Integer getSqComplete() {
        return sqComplete;
    }

    public void setSqComplete(Integer sqComplete) {
        this.sqComplete = sqComplete;
    }

    public Integer getSqTotal() {
        return sqTotal;
    }

    public void setSqTotal(Integer sqTotal) {
        this.sqTotal = sqTotal;
    }


    public String getPassRate() {
        return passRate;
    }

    public void setPassRate(String passRate) {
        this.passRate = passRate;
    }

    public String getLrgal() {
        return lrgal;
    }

    public void setLrgal(String lrgal) {
        this.lrgal = lrgal;
    }

    public String getLrgalName() {
        return lrgalName;
    }

    public void setLrgalName(String lrgalName) {
        this.lrgalName = lrgalName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
}
