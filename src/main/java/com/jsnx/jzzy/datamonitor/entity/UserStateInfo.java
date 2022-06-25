package com.jsnx.jzzy.datamonitor.entity;

/**
 * 描述：
 *
 * @author hulei
 * @create 2022-01-17 21:49
 */
public class UserStateInfo {
    private String roleNo;
    private String roleName;
    private Integer onlineNum;
    private Integer allNum;

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getOnlineNum() {
        return onlineNum;
    }

    public void setOnlineNum(Integer onlineNum) {
        this.onlineNum = onlineNum;
    }

    public Integer getAllNum() {
        return allNum;
    }

    public void setAllNum(Integer allNum) {
        this.allNum = allNum;
    }
}
