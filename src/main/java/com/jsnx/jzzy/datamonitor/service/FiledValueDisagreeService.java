package com.jsnx.jzzy.datamonitor.service;

import com.jsnx.jzzy.datamonitor.entity.FieldValueDisagree;
import com.jsnx.jzzy.datamonitor.entity.FieldValueEntity;
import com.jsnx.jzzy.datamonitor.mapper.CpsDoneMapper;
import com.jsnx.jzzy.datamonitor.mapper.FieldValueDisagreeMapper;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class FiledValueDisagreeService {

    @Resource
    private FieldValueDisagreeMapper fieldValueDisagreeMapper;

    @Resource
    private CpsDoneMapper cpsDoneMapper;

    /**
     * 查询两录一校不一致个数，将校验岗结果与该碎片的录入结果比对，若比较结果都不一样
     * 两录一校个数加一
     */
    public Integer getFieldValueDisagree() {
        int disagreeCount = 0;
        String chipId = "";
        String fieldValueOfCps = "";
        String skillType = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmSS");
        Date date = new Date();
        String startTime = simpleDateFormat.format(
                new DateTime(date).millisOfDay().withMinimumValue().toDate());
        String endTime = simpleDateFormat.format(
                new DateTime(date).millisOfDay().withMaximumValue().toDate());
        //查询所有已经进入校验岗的碎片
        List<FieldValueDisagree> fieldValues = fieldValueDisagreeMapper.filedValueDisagree(startTime, endTime);
        for (int i = 0; i < fieldValues.size(); i++) {
            String fieldValueVerify = "";
            chipId = fieldValues.get(i).getChipId();
            //该碎片号下得所有数据
            List<FieldValueEntity> list = fieldValueDisagreeMapper.getFieldValue(chipId, startTime, endTime);
            for (int j = 0; j < list.size(); j++) {
                fieldValueOfCps = list.get(j).getFieldValue();
                skillType = list.get(j).getSkillId();
                if (fieldValueOfCps != null && "4001".equals(skillType)) {
                    //校验记录
                    fieldValueVerify = list.get(j).getFieldValue();
                }
            }
            //录入的记录
            List<FieldValueEntity> fieldValueLogging = fieldValueDisagreeMapper.getFieldValueLogging(chipId, startTime, endTime);
            for (int a = 0; a < fieldValueLogging.size(); a++) {
                if (fieldValueVerify.equals(fieldValueLogging.get(a).getFieldValue())) {
                    break;
                } else if (a < fieldValueLogging.size() - 1
                        && !fieldValueVerify.equals(fieldValueLogging.get(a).getFieldValue())) {
                    continue;
                } else {
                    disagreeCount++;
                }
            }
            continue;
        }
        return disagreeCount;
    }

    /**
     * 计算通过率 （碎片数-两录一校不一致-问题件）/碎片数
     *
     * @return
     */
    public String passingRate(String startTime, String endTime) {
        //碎片总任务量
        int totalCps = cpsDoneMapper.queryChipIdDone(startTime, endTime);
//                + cpsDoneMapper.queryChipIdIsFetch(startTime, endTime)
//                + cpsDoneMapper.queryChipIdIsProcess(startTime, endTime);
        //碎片通过量
        int totalPassCps = totalCps
                - this.getFieldValueDisagree()
                - cpsDoneMapper.problemChips(startTime, endTime);

        String resul = "";
        if (totalCps != 0){
            Double res = new BigDecimal(
                    (double) totalPassCps / totalCps)
                    .multiply(new BigDecimal(100))
                    .setScale(2, BigDecimal.ROUND_HALF_UP)
                    .doubleValue();
             resul = res.toString();
        } else {
            //碎片总任务量为0，通过率为100%
             resul = "100";
        }

        if (resul.equals("100.0")) {
            resul = "100";
        }
        return resul;
    }
}
