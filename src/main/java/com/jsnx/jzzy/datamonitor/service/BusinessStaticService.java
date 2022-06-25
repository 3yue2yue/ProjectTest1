package com.jsnx.jzzy.datamonitor.service;

import com.jsnx.jzzy.datamonitor.entity.BusinessStaticEntity;
import com.jsnx.jzzy.datamonitor.mapper.BusinessStaticMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class BusinessStaticService {
    @Resource
    BusinessStaticMapper businessStaticMapper;

    /**
     * 统计业务处理柜员状态
     *
     * @return
     */
    public BusinessStaticEntity queryBusinessStatus() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String today = format.format(date);
        Integer onlinePersonNum = businessStaticMapper.queryOnlinePerson();
        Integer onlineOfVerifyNum = businessStaticMapper.queryOnlineOfVerifyNum();
        Integer tempClosedNum = businessStaticMapper.queryTempClosedNum();
        Integer tempClosedOfVerify = businessStaticMapper.queryTempClosedOfVerify();
        Integer businessOfLoggingNum = businessStaticMapper.queryBusinessOfLogging(today);
        Integer businessOfVerifyNum = businessStaticMapper.queryBusinessOfVerify(today);

        BusinessStaticEntity businessStaticData = new BusinessStaticEntity();
        businessStaticData.setOnlinePersonNum(onlinePersonNum);
        businessStaticData.setOnlineOfVerifyNum(onlineOfVerifyNum);
        businessStaticData.setTempClosedNum(tempClosedNum);
        businessStaticData.setTempClosedOfVerify(tempClosedOfVerify);
        businessStaticData.setBusinessOfLoggingNum(businessOfLoggingNum);
        businessStaticData.setBusinessOfVerifyNum(businessOfVerifyNum);
        if (0 == onlinePersonNum) {
            businessStaticData.setAveBusinessOfLogging(0);
        } else {
            //录入岗待处理碎片数/录入岗在线人数(向上取整)
            businessStaticData.setAveBusinessOfLogging(
                    new BigDecimal(businessOfLoggingNum)
                            .divide(new BigDecimal(onlinePersonNum))
                            .setScale(0, BigDecimal.ROUND_UP).intValue());
        }
        if (0 == onlineOfVerifyNum) {
            businessStaticData.setAveBusinessOfVerify(0);
        } else {
            businessStaticData.setAveBusinessOfVerify(
                    new BigDecimal(businessOfVerifyNum)
                            .divide(new BigDecimal(onlineOfVerifyNum))
                            .setScale(0, BigDecimal.ROUND_UP).intValue()
            );
        }
        return businessStaticData;
    }
}
