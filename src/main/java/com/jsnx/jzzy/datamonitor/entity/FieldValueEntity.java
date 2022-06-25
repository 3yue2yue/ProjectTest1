package com.jsnx.jzzy.datamonitor.entity;

import java.util.Date;

public class FieldValueEntity {
    private String chipId;
    private Date fetchtTime;
    private String fieldValue;
    private String skillId;

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }

    public Date getFetchtTime() {
        return fetchtTime;
    }

    public void setFetchtTime(Date fetchtTime) {
        this.fetchtTime = fetchtTime;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }
}
