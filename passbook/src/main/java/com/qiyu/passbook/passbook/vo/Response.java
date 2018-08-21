package com.qiyu.passbook.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>Controller response</h1>
 * Created by Qinyi.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    private Integer errorCode = 0;

    private String errorMsg = "";

    /** return object */
    private Object data;

    /**
     * <h2>back the data</h2>
     * */
    public Response(Object data) {
        this.data = data;
    }

    /**
     * <h2>empty response</h2>
     * */
    public static Response success() {
        return new Response();
    }

    /**
     * <h2>error response</h2>
     * */
    public static Response failure(String errorMsg) {
        return new Response(-1, errorMsg, null);
    }
}
