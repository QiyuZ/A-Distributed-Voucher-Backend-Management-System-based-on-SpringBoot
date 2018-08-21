package com.qiyu.passbook.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <h1>Response of Coupon's Inventory</h1>
 * Created by Qiyu.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryResponse {

    /** user id */
    private Long userId;

    /** PassTemplate */
    private List<PassTemplateInfo> passTemplateInfos;
}
