package com.jsnx.jzzy.datamonitor.entity;

public class IndexData {

    private Integer refresh;
    private Integer traffic;
    private Integer overrun;
    private String rout;

    public String getRout() {
        return rout;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }

    public Integer getRefresh() {
        return refresh;
    }

    public void setRefresh(Integer refresh) {
        this.refresh = refresh;
    }

    public Integer getTraffic() {
        return traffic;
    }

    public void setTraffic(Integer traffic) {
        this.traffic = traffic;
    }

    public Integer getOverrun() {
        return overrun;
    }

    public void setOverrun(Integer overrun) {
        this.overrun = overrun;
    }
}
