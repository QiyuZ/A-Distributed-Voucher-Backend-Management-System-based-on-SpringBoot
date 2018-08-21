package com.qiyu.passbook.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>request info when user asks for coupon</h1>
 * Created by Qiyu.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GainPassTemplateRequest {

    /** user id */
    private Long userId;

    /** PassTemplate object */
    private PassTemplate passTemplate;
}
