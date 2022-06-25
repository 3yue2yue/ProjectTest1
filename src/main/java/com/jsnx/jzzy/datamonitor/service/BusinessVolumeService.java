package com.jsnx.jzzy.datamonitor.service;

import com.jsnx.jzzy.datamonitor.entity.BusinessVolume;
import com.jsnx.jzzy.datamonitor.mapper.BusinessVolumeMapper;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BusinessVolumeService {

    @Resource
    private BusinessVolumeMapper businessVolumeMapper;

    public List<BusinessVolume> queryBusinessZyVolume(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String startTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMinimumValue().toDate());
        String endTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMaximumValue().toDate());
        List<BusinessVolume> result = businessVolumeMapper.queryBusinessZyVolume(startTime,endTime);
        if(result == null){
            return null;
        }
        return result;
    }

    public List<BusinessVolume> queryBusinessSqVolume(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String startTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMinimumValue().toDate());
        String endTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMaximumValue().toDate());
        List<BusinessVolume> result = businessVolumeMapper.queryBusinessSqVolume(startTime,endTime);
        if(result == null){
            return null;
        }
        return result;
    }
}
