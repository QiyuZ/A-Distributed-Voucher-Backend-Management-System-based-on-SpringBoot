package com.qiyu.passbook.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <h2>user has got the coupon</h2>
 * Created by Qiyu.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pass {

    private Long userId;

    /**  RowKey of pass in HBase */
    private String rowKey;

    /** RowKey of passtemplate in HBase */
    private String templateId;

    /** if not, -1 */
    private String token;

    private Date assignedDate;

    /** date has been used */
    private Date conDate;
}
