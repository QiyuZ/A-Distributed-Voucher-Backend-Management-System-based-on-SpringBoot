package com.qiyu.passbook.passbook.vo;

import com.qiyu.passbook.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <h1>coupon details</h1>
 * Created by Qiyu.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplateInfo extends PassTemplate {

    /** coupon template */
    private PassTemplate passTemplate;

    /** coupon for merchants */
    private Merchants merchants;
}
