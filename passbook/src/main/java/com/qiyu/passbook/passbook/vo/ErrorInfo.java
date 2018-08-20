package com.qiyu.passbook.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>error</h1>
 * Created by Qiyu.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorInfo<T> {

    public static final Integer ERROR = -1;

    /** specific error code*/
    private Integer code;

    /** details */
    private String message;

    /** request for url */
    private String url;

    /** request for data */
    private T data;
}
