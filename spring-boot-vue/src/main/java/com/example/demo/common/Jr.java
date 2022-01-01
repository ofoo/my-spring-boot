package com.example.demo.common;

import lombok.Data;

@Data
public class Jr {
    //状态
    private boolean status;
    //状态码
    private int code;
    //消息
    private String message;
    //数据
    private Object data;

    public Jr(boolean status, int code) {
        this.status = status;
        this.code = code;
    }

    public Jr(boolean status, int code, String message) {
        this(status, code);
        this.message = message;
    }

    public Jr(boolean status, int code, Object data) {
        this(status, code);
        this.data = data;
    }

    public Jr(boolean status, int code, String message, Object data) {
        this(status, code, message);
        this.data = data;
    }

    public static Jr yes() {
        return new Jr(true, 0);
    }

    public static Jr yes(int code, Object data) {
        return new Jr(true, code, data);
    }

    public static Jr yes(String message, Object data) {
        return new Jr(true, 0, message, data);
    }

    public static Jr yesm(String message) {
        return new Jr(true, 0, message);
    }

    public static Jr yesd(Object data) {
        return new Jr(true, 0, data);
    }

    public static Jr no() {
        return new Jr(false, -1);
    }

    public static Jr no(int code, String message) {
        return new Jr(false, code, message);
    }

    public static Jr no(String message, Object data) {
        return new Jr(false, -1, message, data);
    }

    public static Jr nom(String message) {
        return new Jr(false, -1, message);
    }

    public static Jr nod(Object data) {
        return new Jr(false, -1, data);
    }
}
