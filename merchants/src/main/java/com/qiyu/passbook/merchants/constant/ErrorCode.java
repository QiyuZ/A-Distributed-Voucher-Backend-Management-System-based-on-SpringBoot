package com.qiyu.passbook.merchants.constant;

//<h2>error code define</h2>

public enum ErrorCode {

    SUCCESS(0, ""),
    DUPLICATE_NAME(1, "duplicate"),
    EMPTY_LOGO(2, "no such logo"),
    EMPTY_BUSINESS_LICENSE(3, "no such license"),
    ERROR_PHONE(4, "no such phone"),
    EMPTY_ADDRESS(5, "no such address"),
    MERCHANTS_NOT_EXIST(6, "no such merchant");

    /** error code */
    private Integer code;

    /** error info */
    private String desc;

    ErrorCode(Integer code, String desc) {
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
