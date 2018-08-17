package com.qiyu.passbook.merchants.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>response object</h1>
 * Created by Qiyu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    private Integer errorCode = 0;

    private String errorMsg = "";

    private Object data;

    /**
     * <h2>response data</h2>
     *
     * */
    public Response(Object data) {
        this.data = data;
    }
}