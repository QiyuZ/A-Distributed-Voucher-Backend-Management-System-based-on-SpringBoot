package com.qiyu.passbook.merchants.service.impl;

import com.alibaba.fastjson.JSON;
import com.qiyu.passbook.merchants.constant.Constants;
import com.qiyu.passbook.merchants.constant.ErrorCode;
import com.qiyu.passbook.merchants.dao.MerchantsDao;
import com.qiyu.passbook.merchants.entity.Merchants;
import com.qiyu.passbook.merchants.service.IMerchantsServ;
import com.qiyu.passbook.merchants.valueObject.CreateMerchantsRequest;
import com.qiyu.passbook.merchants.valueObject.CreateMerchantsResponse;
import com.qiyu.passbook.merchants.valueObject.PassTemplate;
import com.qiyu.passbook.merchants.valueObject.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <h1>interface implement</h1>
 * Created by Qiyu.
 */
@Slf4j
@Service
public class MerchantsServImpl implements IMerchantsServ {

    /** Merchants interface */
    private final MerchantsDao merchantsDao;

    /** kafka client */
    //private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public MerchantsServImpl(MerchantsDao merchantsDao) {
        this.merchantsDao = merchantsDao;
    }

    @Override
    @Transactional
    public Response createMerchants(CreateMerchantsRequest request) {

        Response response = new Response();
        CreateMerchantsResponse merchantsResponse = new CreateMerchantsResponse();

        ErrorCode errorCode = request.validate(merchantsDao);
        if (errorCode != ErrorCode.SUCCESS) {
            merchantsResponse.setId(-1);
            response.setErrorCode(errorCode.getCode());
            response.setErrorMsg(errorCode.getDesc());
        } else {
            merchantsResponse.setId(merchantsDao.save(request.toMerchants()).getId());
        }

        response.setData(merchantsResponse);

        return response;
    }

    @Override
    public Response buildMerchantsInfoById(Integer id) {

        Response response = new Response();

        Merchants merchants = merchantsDao.findById(id);
        if (null == merchants) {
            response.setErrorCode(ErrorCode.MERCHANTS_NOT_EXIST.getCode());
            response.setErrorMsg(ErrorCode.MERCHANTS_NOT_EXIST.getDesc());
        }

        response.setData(merchants);

        return response;
    }

    @Override
    public Response dropPassTemplate(PassTemplate template) {

        Response response = new Response();
        ErrorCode errorCode = template.validate(merchantsDao);

        if (errorCode != ErrorCode.SUCCESS) {
            response.setErrorCode(errorCode.getCode());
            response.setErrorMsg(errorCode.getDesc());
        } else {

        }

        return response;
    }
}

