package com.jsnx.jzzy.datamonitor.entity;

import java.util.HashMap;
import java.util.Map;

public class ServiceResponse {
    public static final String MESSAGE_SUCCESS = "success";
    public static final String MESSAGE_ERROR = "error";
    private Map messages = new HashMap();
    private Object result;

    public Map getMessages() {
        return messages;
    }

    public void setMessages(Map messages) {
        this.messages = messages;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public void setMessage(Object messageName, Object content) {
        this.getMessages().put(messageName, content);
    }
}
