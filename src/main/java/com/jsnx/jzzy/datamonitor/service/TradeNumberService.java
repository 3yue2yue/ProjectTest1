package com.jsnx.jzzy.datamonitor.service;

import com.google.common.collect.Lists;
import com.jsnx.jzzy.datamonitor.entity.CenterWorkTime;
import com.jsnx.jzzy.datamonitor.entity.TradeNumber;
import com.jsnx.jzzy.datamonitor.mapper.CenterWorkTimeMapper;
import com.jsnx.jzzy.datamonitor.mapper.TradeNumberMapper;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 10:38
 */
@Service
public class TradeNumberService {
    @Resource
    private TradeNumberMapper tradeNumberMapper;
    @Resource
    private CenterWorkTimeMapper centerWorkTimeMapper;

    public List<TradeNumber> queryAuthTradeNumber() throws ParseException {

        CenterWorkTime centerWorkTime = centerWorkTimeMapper.queryCenterWorkTime("2");
        SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH");
        Date startTime = new DateTime(sdf.parse(centerWorkTime.getOpenTime())).minuteOfHour().withMinimumValue().toDate();
        Date endTime = new DateTime(sdf.parse(centerWorkTime.getEndTime())).plusHours(1).minuteOfHour().withMinimumValue().toDate();
        List<TradeNumber> result = Lists.newArrayList();
        SimpleDateFormat dateSdf = new SimpleDateFormat("yyyyMMdd");
        String date = dateSdf.format(new Date());
        while (startTime.compareTo(endTime) <= 0 && startTime.compareTo(new Date()) <= 0) {
            Date _startTime = new DateTime(startTime).minusHours(1).toDate();
            String startTimeStr = sdf.format(_startTime);
            String endTimeStr = sdf.format(startTime);
            TradeNumber tradeNumber = new TradeNumber();
            tradeNumber.setTime(sdf2.format(startTime));
            Integer num = tradeNumberMapper.queryTradeNumber("0", date + startTimeStr + "00", date + endTimeStr + "00");
            tradeNumber.setNumber(num);

            result.add(tradeNumber);
            startTime = new DateTime(startTime).plusHours(1).toDate();
        }

        return result;
    }

    public List<TradeNumber> queryWorkTradeNumber() throws ParseException {
        CenterWorkTime centerWorkTime = centerWorkTimeMapper.queryCenterWorkTime("1");
        SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH");
        Date startTime = new DateTime(sdf.parse(centerWorkTime.getOpenTime())).minuteOfHour().withMinimumValue().toDate();
        Date endTime = new DateTime(sdf.parse(centerWorkTime.getEndTime())).plusHours(1).minuteOfHour().withMinimumValue().toDate();
        List<TradeNumber> result = Lists.newArrayList();
        SimpleDateFormat dateSdf = new SimpleDateFormat("yyyyMMdd");
        String date = dateSdf.format(new Date());
        while (startTime.compareTo(endTime) <= 0 && startTime.compareTo(new Date()) <= 0) {
            Date _startTime = new DateTime(startTime).minusHours(1).toDate();
            String startTimeStr = sdf.format(_startTime);
            String endTimeStr = sdf.format(startTime);

            TradeNumber tradeNumber = new TradeNumber();
            tradeNumber.setTime(sdf2.format(startTime));
            Integer num = tradeNumberMapper.queryTradeNumber("1", date + startTimeStr + "00", date + endTimeStr + "00");
            tradeNumber.setNumber(num);

            result.add(tradeNumber);
            startTime = new DateTime(startTime).plusHours(1).toDate();
        }

        return result;
    }
}
