package com.qiyu.passbook.merchants.service;

import com.qiyu.passbook.merchants.service.IMerchantsServ;
import com.alibaba.fastjson.JSON;
import com.qiyu.passbook.merchants.valueObject.CreateMerchantsRequest;
import com.qiyu.passbook.merchants.valueObject.PassTemplate;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * <h1>merchants test</h1>
 * Created by Qiyu.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = MerchantsServTest.class,
        webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServTest {

    @Autowired
    private IMerchantsServ merchantsServ;

    /**
     * {"data":{"id":7},"errorCode":0,"errorMsg":""}
     * {"data":{"id":8},"errorCode":0,"errorMsg":""}
     * */
    @Test
    public void testCreateMerchantServ() {

        CreateMerchantsRequest request = new CreateMerchantsRequest();
        request.setName("qiyu");
        request.setLogoUrl("https://github.com/QiyuZ");
        request.setBusinessLicenseUrl("https://github.com/QiyuZ");
        request.setPhone("1234567890");
        request.setAddress("VA");

        System.out.println(JSON.toJSONString(merchantsServ.createMerchants(request)));
    }

}

