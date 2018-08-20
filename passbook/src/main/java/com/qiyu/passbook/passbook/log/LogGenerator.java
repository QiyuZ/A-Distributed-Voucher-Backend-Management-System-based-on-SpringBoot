package com.qiyu.passbook.passbook.log;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

/**
 * <h1>generate log</h1>
 * Created by Qiyu.
 */
@Slf4j
public class LogGenerator {

    /**
     * <h2>generate log</h2>
     * @param request {@link HttpServletRequest}
     * @param userId user id
     * @param action log object
     * @param info log info, null is allowed
     * */
    public static void genLog(HttpServletRequest request, Long userId, String action, Object info) {

        log.info(
                JSON.toJSONString(
                        new LogObject(action, userId, System.currentTimeMillis(), request.getRemoteAddr(), info)
                )
        );
    }
}