package com.qiyu.passbook.passbook.log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>log object</h1>
 * Created by Qiyu.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogObject {

    /** log action for user */
    private String action;

    /** user id */
    private Long userId;

    /** time */
    private Long timestamp;

    /** client ip address */
    private String remoteIp;

    /** info details */
    private Object info = null;
}

