package com.jsnx.jzzy.datamonitor.service;

import com.jsnx.jzzy.datamonitor.entity.CPSDone;
import com.jsnx.jzzy.datamonitor.mapper.CpsDoneMapper;
import com.jsnx.jzzy.datamonitor.mapper.TotalCpsAmountMapper;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CpsDoneService {
    @Resource
    private CpsDoneMapper cpsDoneMapper;
    @Resource
    private TotalCpsAmountMapper totalCpsAmountMapper;
    @Autowired
    FiledValueDisagreeService filedValueDisagreeService;

    /**
     * 存放cps查询的基本数据
     * 待处理，处理中，已完成，问题件，通过率
     * @return
     */
    public CPSDone getCpsDoneAmount(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmSS");
        Date date = new Date();
        String startTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMinimumValue().toDate());
        String endTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMaximumValue().toDate());
        //碎片已完成数
        int chipIdDone = cpsDoneMapper.queryChipIdDone(startTime,endTime);
        //碎片待处理
        int chipIdIsFetch = cpsDoneMapper.queryChipIdIsFetch(startTime,endTime);
        //碎片处理中
        int queryChipIdIsProcess = cpsDoneMapper.queryChipIdIsProcess(startTime,endTime);
        //问题件
        int problemChips = cpsDoneMapper.problemChips(startTime,endTime);
        CPSDone cpsDone = new CPSDone();
        cpsDone.setChipIdDone(chipIdDone);
        cpsDone.setChipIdIsFetch(chipIdIsFetch);
        cpsDone.setChipIdIsProcess(queryChipIdIsProcess);
        cpsDone.setProblemChips(problemChips);

        cpsDone.setFiledValueDisagree(filedValueDisagreeService.getFieldValueDisagree());
        cpsDone.setPassingRate(filedValueDisagreeService.passingRate(startTime,endTime));
        return cpsDone;
    }

    /**
     * 获取碎片任务累积量（已完成）
     * @return
     */
    public Integer queryTotalCps(){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String today = format.format(date);
        return totalCpsAmountMapper.queryTotalCps();
    }


}
