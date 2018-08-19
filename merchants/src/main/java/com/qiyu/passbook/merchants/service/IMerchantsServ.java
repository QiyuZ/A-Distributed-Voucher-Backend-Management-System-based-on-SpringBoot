package com.qiyu.passbook.merchants.service;

import com.qiyu.passbook.merchants.valueObject.CreateMerchantsRequest;
import com.qiyu.passbook.merchants.valueObject.PassTemplate;
import com.qiyu.passbook.merchants.valueObject.Response;
import org.springframework.stereotype.Service;

/**
 * <h1>Interface define</h1>
 *
 */
public interface IMerchantsServ {

    /**
     * <h2>build merchant request</h2>
     *
     * */
    Response createMerchants(CreateMerchantsRequest request);

    /**
     * <h2>build merchant id/h2>
     * */
    Response buildMerchantsInfoById(Integer id);

    /**
     * <h2>build template info id/h2>
     * */
    Response dropPassTemplate(PassTemplate template);
}