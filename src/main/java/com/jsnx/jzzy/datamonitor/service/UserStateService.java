package com.jsnx.jzzy.datamonitor.service;

import com.jsnx.jzzy.datamonitor.entity.UserStateInfo;
import com.jsnx.jzzy.datamonitor.mapper.UserStateMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 09:01
 */
@Service
public class UserStateService {
    @Resource
    private UserStateMapper userStateMapper;

    public List<UserStateInfo> queryUserStateList(){
        return userStateMapper.queryUserState();
    }
}
