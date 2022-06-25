package com.jsnx.jzzy.datamonitor.service;

import com.jsnx.jzzy.datamonitor.entity.AveCpsProcessTime;
import com.jsnx.jzzy.datamonitor.entity.CpsProcessTime;
import com.jsnx.jzzy.datamonitor.mapper.CpsProcessTimeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

@Service
public class AveCpsProcessTimeService {
    @Resource
    CpsProcessTimeMapper cpsProcessTimeMapper;

    /**
     * 获取录入岗碎片平均处理时间，校验岗平均录入时间（当天）
     * @return
     */
    public AveCpsProcessTime getAveProcessTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String today = format.format(date);

        CpsProcessTime cpsProcessData = cpsProcessTimeMapper.aveCpsProcessTime(today);
        AveCpsProcessTime aveCpsProcessTime = new AveCpsProcessTime();
        if (cpsProcessData != null) {
            if (Objects.isNull(cpsProcessData.getChipCount()) || 0==cpsProcessData.getChipCount()){
                aveCpsProcessTime.setAveLoggingTime(0);
            } else {
                Integer aveLoggingTime = new BigDecimal(cpsProcessData.getProcessTime())
                        .divide(new BigDecimal(cpsProcessData.getChipCount()),BigDecimal.ROUND_HALF_UP)
                        .setScale(0).intValue();
                aveCpsProcessTime.setAveLoggingTime(aveLoggingTime);
                Integer aveVerifyTime = new BigDecimal(cpsProcessData.getProcessTimeVerify())
                        .divide(new BigDecimal(cpsProcessData.getChipCountVerify()),BigDecimal.ROUND_HALF_UP)
                        .setScale(0).intValue();
                aveCpsProcessTime.setAveVerifyTime(aveVerifyTime);
            }
        } else {
            aveCpsProcessTime.setAveLoggingTime(0);
            aveCpsProcessTime.setAveVerifyTime(0);
        }
        return aveCpsProcessTime;
    }

}
