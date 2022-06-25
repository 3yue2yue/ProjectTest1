package com.jsnx.jzzy.datamonitor.service;

import com.alibaba.fastjson.JSON;
import com.jsnx.jzzy.datamonitor.entity.IndexData;
import com.jsnx.jzzy.datamonitor.mapper.IndexDataMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class IndexDataService {

    @Resource
    private IndexDataMapper indexDataMapper;

    public List<IndexData> queryIndexData(){
        IndexData indexData0 = indexDataMapper.queryIndexData("大屏");
        IndexData indexData1 = indexDataMapper.queryIndexData("作业交易");
        IndexData indexData2 = indexDataMapper.queryIndexData("授权交易");
        List<IndexData> list = new ArrayList<>();
        list.add(indexData0);
        list.add(indexData1);
        list.add(indexData2);
        return list;
    }

    public List<IndexData> queryOneIndexData(Integer refresh,Integer traffic,Integer overrun,String rout){

        indexDataMapper.updateIndexData(refresh,traffic,overrun,rout);
        List<IndexData> list = queryIndexData();
        return list;
    }


}
