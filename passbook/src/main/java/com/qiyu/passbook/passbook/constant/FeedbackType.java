package com.qiyu.passbook.passbook.constant;

/**
 * <h1>comments enum</h1>
 * Created by Qinyi.
 */

public enum FeedbackType {

    PASS("pass", "comments for coupon"),
    APP("app", "comments for app");

    private String code;

    private String desc;

    FeedbackType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}