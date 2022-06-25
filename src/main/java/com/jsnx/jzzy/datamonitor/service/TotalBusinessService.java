package com.jsnx.jzzy.datamonitor.service;

import com.jsnx.jzzy.datamonitor.entity.TotalBusiness;
import com.jsnx.jzzy.datamonitor.mapper.TotalBusinessMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-17 19:46
 */
@Service
public class TotalBusinessService {
    @Resource
    private TotalBusinessMapper totalBusinessMapper;

    public TotalBusiness queryTotalBusiness() {
        return totalBusinessMapper.queryTotalBusiness();
    }
}
