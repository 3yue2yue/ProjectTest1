package com.jsnx.jzzy.datamonitor.service;

import com.alibaba.fastjson.JSON;
import com.jsnx.jzzy.datamonitor.entity.PendingProcessing;
import com.jsnx.jzzy.datamonitor.entity.TradeInfo;
import com.jsnx.jzzy.datamonitor.mapper.PendingProcessingMapper;
import com.jsnx.jzzy.datamonitor.mapper.TradeInfoMapper;
import org.joda.time.DateTime;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-17 21:13
 */
@Service
public class TradeInfoService {
    @Resource
    private TradeInfoMapper tradeInfoMapper;

    @Resource
    private PendingProcessingMapper pendingProcessingMapper;

    public TradeInfo queryTradeInfo() {
        Date startTime = new DateTime(new Date()).millisOfDay().withMinimumValue().toDate();
        Date endTime = new DateTime(new Date()).millisOfDay().withMaximumValue().toDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        TradeInfo result = tradeInfoMapper.queryTradeInfo(sdf.format(startTime), sdf.format(endTime));
        TradeInfo result0 = tradeInfoMapper.querySq(sdf.format(startTime), sdf.format(endTime));
        result.setSqTotalNum(result.getSqTotalNum()+result0.getSqTotalNum());
        result.setSqCompletedNum(result.getSqCompletedNum()+result0.getSqTotalNum());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String createTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMinimumValue().toDate());

        PendingProcessing pendingZy = pendingProcessingMapper.queryPendingProcessing("2",createTime);
        PendingProcessing pendingSq = pendingProcessingMapper.querySqPendingProcessing("2",createTime);
        PendingProcessing processingZy = pendingProcessingMapper.queryPendingProcessing("4",createTime);
        PendingProcessing processingSq = pendingProcessingMapper.querySqPendingProcessing("4",createTime);
        //TradeInfo result = tradeInfoMapper.queryTradeInfo("20220207000000", sdf.format(endTime));
        if(result != null){
            if(result.getSqTotalNum() != 0){
                String sqRa = rate(result.getSqCompletedNum(),result.getSqTotalNum());
                result.setSqPassRate(sqRa);
                result.setSqPendingNum(pendingSq.getrNum());
                result.setSqProcessingNum(processingSq.getrNum());
            }else{
                result.setSqPassRate("0.0");
            }
            if(result.getZyTotalNum() != 0){
                String zyRa = rate(result.getZyCompletedNum(),result.getZyTotalNum());
                result.setZyPassRate(zyRa);
                result.setZyPendingNum(pendingZy.getrNum());
                result.setZyProcessingNum(processingZy.getrNum());
            }else{
                result.setZyPassRate("0.0");
            }
        }else{
            return null;
        }

        return result;
    }
    //计算百分比
    public String rate(Integer co, Integer to){
        Double res = new BigDecimal((double)co/to).multiply(new BigDecimal(100)).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        String resul = res.toString();
        if(resul.equals("100.0")){
            resul = "100";
        }
        return resul;
    }
}
