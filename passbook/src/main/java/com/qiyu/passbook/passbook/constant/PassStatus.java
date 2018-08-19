package com.qiyu.passbook.passbook.constant;

/**
 * <h1>coupon staus</h1>
 * Created by Qiyu.
 */
public enum PassStatus {

    UNUSED(1, "free to use"),
    USED(2, "has been used"),
    ALL(3, "all got");

    private Integer code;

    private String desc;

    PassStatus(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
