package com.jsnx.jzzy.datamonitor.service;

import com.alibaba.fastjson.JSON;
import com.jsnx.jzzy.datamonitor.entity.WorkSaturation;
import com.jsnx.jzzy.datamonitor.mapper.WorkSaturationMapper;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkSaturationService {

    @Resource
    private WorkSaturationMapper workSaturationMapper;

    public List<WorkSaturation> queryZyWorkSaturation(){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
//        Date date = new Date();
//        String startTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMinimumValue().toDate());
//        String endTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMaximumValue().toDate());
        List<WorkSaturation> result = workSaturationMapper.queryZyWorkSaturation();//0-在线
//        List<WorkSaturation> result1 = zhuan(result);
//        List<WorkSaturation> result2 = ling(result1);
//        List<WorkSaturation> result0 = zong(result2);
//        List<WorkSaturation> result4 = shan(result0);
//        List<WorkSaturation> result3 = rate(result4);
        result = rate(result);
        return result;
    }

    /*public List<WorkSaturation> zhuan(List<WorkSaturation>  result){
        for(int i = 0 ; i < result.size() ; i ++){
            if(result.get(i).getName().equals("CAP")){
                result.remove(i);
            }
            switch (result.get(i).getName()){
                case "CAP":result.get(i).setcName("中心授权岗");break;
                case "CR":result.get(i).setcName("全单录入二岗");break;
                case "CE":result.get(i).setcName("全单录入一岗");break;
                case "CER":result.get(i).setcName("全单补录岗");break;
                case "VA":result.get(i).setcName("验印审核岗");break;
                case "CAR":result.get(i).setcName("校验岗");break;
                case "HM":result.get(i).setcName("行名行号录入岗");break;
            }
        }
        return result;
    }*/

    /*public List<WorkSaturation> zong(List<WorkSaturation>  result){
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        for(int i = 0 ; i < result.size() ; i ++ ) {
            if (result.get(i).getName().equals("CE")) {
                a = result.get(i).getNum();
                c = result.get(i).getRnum();
                e = result.get(i).getZnum();
            } else if (result.get(i).getName().equals("CR")) {
                b = result.get(i).getNum();
                d = result.get(i).getRnum();
                f = result.get(i).getZnum();
            }
        }
        int bb = 0;
        int cc = 0;
        int dd = 0;
        int aa = 0;
        int ee = 0;
        int ff = 0;
        for(int j = 0 ; j < result.size() ; j ++ ) {
            if (result.get(j).getName().equals("CER")) {
                bb = result.get(j).getNum();
                dd = result.get(j).getRnum();
                ee = result.get(j).getZnum();
            } else if (result.get(j).getName().equals("CAR")) {
                cc = result.get(j).getNum();
                aa = result.get(j).getRnum();
                ff = result.get(j).getZnum();;
            }
        }
        WorkSaturation g = new WorkSaturation();
        g.setcName("全单录入岗");
        g.setNum(a+b);
        g.setRnum(c+d);
        g.setZnum(e+f);
        result.add(g);
        WorkSaturation gg = new WorkSaturation();
        gg.setcName("校验岗");
        gg.setNum(bb+cc);
        gg.setRnum(aa+dd);
        gg.setZnum(ee+ff);
        result.add(gg);
        return result;
    }*/

    /*public List<WorkSaturation> shan(List<WorkSaturation>  result){
        for(int i = 0 ; i < result.size() ; i ++ ) {
            if(result.get(i).getName() != null){
                if (result.get(i).getName().equals("CE")) {
                    result.remove(i);
                    i--;
                } else if (result.get(i).getName().equals("CR")) {
                    result.remove(i);
                    i--;
                } else if (result.get(i).getName().equals("CER")) {
                    result.remove(i);
                    i--;
                } else if (result.get(i).getName().equals("CAR")) {
                    result.remove(i);
                    i--;
                }
            }


        }
        return result;
    }*/

   /* public List<WorkSaturation> ling(List<WorkSaturation> result){
        for(int i = 0 ; i < result.size() ; i ++ ){
            if(result.get(i).getRnum() == null){
                result.get(i).setRnum(0);
            }
            if(result.get(i).getNum() == null){
                result.get(i).setNum(0);
            }
            if(result.get(i).getZnum() == null){
                result.get(i).setZnum(0);
            }
        }
        return result;
    }*/

    public List<WorkSaturation> querySqWorkSaturation(){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
//        Date date = new Date();
//        String startTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMinimumValue().toDate());
//        String endTime = simpleDateFormat.format(new DateTime(date).millisOfDay().withMaximumValue().toDate());
        List<WorkSaturation> result = workSaturationMapper.querySqWorkSaturation();//0-在线
//        result = zhuan1(result);
//        result = ling(result);
        result = rate(result);
        return result;
    }

    public List<WorkSaturation> rate(List<WorkSaturation> result){
        for(int i = 0 ; i < result.size() ; i ++){
            if(result.get(i).getLineNum() != 0){
                result.get(i).setAverage(prate(result.get(i).getrNum(),result.get(i).getLineNum()));
            }else if(result.get(i).getLineNum() == 0 && result.get(i).getrNum() != 0){
                result.get(i).setAverage(result.get(i).getrNum());
            }else{
                result.get(i).setAverage(0);
            }
        }
        return result;
    }

    //计算人均
    public Integer prate(Integer co, Integer to){
        Integer res = (int)Math.ceil((double)co/to);
        return res;
    }
    /*public List<WorkSaturation> zhuan1(List<WorkSaturation>  result){
        for(int i = 0 ; i < result.size() ; i ++){
            switch (result.get(i).getName()){
                case "MSQ":result.get(i).setcName("中级授权岗");break;
                case "HSQ":result.get(i).setcName("高级授权岗");break;
                case "PSQ":result.get(i).setcName("初级授权岗");break;
            }
        }
        return result;
    }*/
}
