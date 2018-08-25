package com.qiyu.passbook.passbook.service;

import com.qiyu.passbook.passbook.vo.GainPassTemplateRequest;
import com.qiyu.passbook.passbook.vo.Response;

/**
 * <h1>gain counpon</h1>
 * Created by Qiyu.
 */
public interface IGainPassTemplateService {

    /**
     * @param request {@link GainPassTemplateRequest}
     * @return {@link Response}
     * */
    Response gainPassTemplate(GainPassTemplateRequest request) throws Exception;
}
