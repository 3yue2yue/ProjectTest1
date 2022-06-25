package com.jsnx.jzzy.datamonitor.controller;

import com.jsnx.jzzy.datamonitor.entity.UserStateInfo;
import com.jsnx.jzzy.datamonitor.service.UserStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-18 09:07
 */
@RestController
@CrossOrigin
@RequestMapping("data/monitor/userState")
public class UserStateInfoController {
    @Autowired
    private UserStateService userStateService;

    @RequestMapping("queryUserStateList")
    public List<UserStateInfo> queryUserStateList(){
        return userStateService.queryUserStateList();
    }

}
