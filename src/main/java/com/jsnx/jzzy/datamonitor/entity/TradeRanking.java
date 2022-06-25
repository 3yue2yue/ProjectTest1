package com.jsnx.jzzy.datamonitor.entity;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 14:55
 */
public class TradeRanking {
    private String tradeCode;
    private Integer num;
    private Integer ranking;

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
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
