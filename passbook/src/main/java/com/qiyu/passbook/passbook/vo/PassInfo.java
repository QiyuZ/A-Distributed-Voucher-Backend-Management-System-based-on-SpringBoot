package com.qiyu.passbook.passbook.vo;

import com.qiyu.passbook.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>coupon has been got by user</h1>
 * Created by Qiyu.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassInfo {

    /** coupon has been passed*/
    private Pass pass;

    /** template */
    private PassTemplate passTemplate;

    /** merchants */
    private Merchants merchants;
}
