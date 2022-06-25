package com.jsnx.jzzy.datamonitor.service;

import com.alibaba.fastjson.JSON;
import com.jsnx.jzzy.datamonitor.entity.AreaWork;
import com.jsnx.jzzy.datamonitor.mapper.AreaWorkMapper;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.awt.geom.Area;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AreaWorkService {

    @Resource
    private AreaWorkMapper areaWorkMapper;

    public List<AreaWork> queryAreaWork(){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String startTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMinimumValue().toDate());
        String endTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMaximumValue().toDate());
        List<AreaWork> result = areaWorkMapper.queryAreaWork(startTime,endTime);
        if(result == null){
            return null;
        }
        return result;
    }


}
