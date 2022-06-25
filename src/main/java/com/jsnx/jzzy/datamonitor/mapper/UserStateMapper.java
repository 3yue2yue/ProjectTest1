package com.jsnx.jzzy.datamonitor.mapper;

import com.jsnx.jzzy.datamonitor.entity.UserStateInfo;

import java.util.List;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-17 21:50
 */
public interface UserStateMapper {
    List<UserStateInfo> queryUserState();
}
