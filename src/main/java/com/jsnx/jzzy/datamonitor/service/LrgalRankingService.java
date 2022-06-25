package com.jsnx.jzzy.datamonitor.service;

import com.alibaba.fastjson.JSON;
import com.jsnx.jzzy.datamonitor.entity.LrgalRanking;
import com.jsnx.jzzy.datamonitor.entity.TradeRanking;
import com.jsnx.jzzy.datamonitor.mapper.LrgalRankingMapper;
import com.jsnx.jzzy.datamonitor.mapper.TradeRankingMapper;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 17:04
 */
@Service
public class LrgalRankingService {
    @Resource
    private LrgalRankingMapper lrgalRankingMapper;

    public List<LrgalRanking> queryAuthLraglRanking(Integer num) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String startTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMinimumValue().toDate());
        String endTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMaximumValue().toDate());
        List<LrgalRanking> result = lrgalRankingMapper.queryLrgalRanking("0", startTime, endTime, num);
        if(result != null){
            for(int i = 0 ; i < result.size() ; i ++){
                if(result.get(i).getSqTotal() != 0){
                    String sqRa = prate(result.get(i).getSqComplete(),result.get(i).getSqTotal());
                    result.get(i).setPassRate(sqRa);
                }else{
                    result.get(i).setPassRate("0.0%");
                }
            }
        }else {
            return null;
        }
        return result;
    }

    public List<LrgalRanking> queryWorkLraglRanking(Integer num) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String startTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMinimumValue().toDate());
        String endTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMaximumValue().toDate());
        List<LrgalRanking> result = lrgalRankingMapper.queryWorkRanking("1", startTime, endTime, num);
        if(result != null){
            for(int i = 0 ; i < result.size() ; i ++){
                if(result.get(i).getZyTotal() != 0){
                    String ZyRa = prate(result.get(i).getZyComplete(),result.get(i).getZyTotal());
                    result.get(i).setPassRate(ZyRa);
                }else{
                    result.get(i).setPassRate("0.0%");
                }
            }
        }else{
            return null;
        }
        return result;
    }

    //计算百分比
    public String prate(Integer co, Integer to){
        Double res = new BigDecimal((double)co/to).multiply(new BigDecimal(100)).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        String resul = res.toString()+"%";
        if(resul.equals("100.0%")){
            resul = "100%";
        }
        return resul;
    }

}
