package com.qiyu.passbook.passbook.service;

import com.qiyu.passbook.passbook.vo.Pass;
import com.qiyu.passbook.passbook.vo.Response;

/**
 * <h1>get info about user's coupon</h1>
 * Created by Qiyu.
 */
public interface IUserPassService {

    /**
     * <h2>coupon that can be used now</h2>
     * @param userId  id
     * @return {@link Response}
     * */
    Response getUserPassInfo(Long userId) throws Exception;

    /**
     * <h2>coupon has been used already</h2>
     * @param userId id
     * @return {@link Response}
     * */
    Response getUserUsedPassInfo(Long userId) throws Exception;

    /**
     * <h2>all the coupon</h2>
     * @param userId id
     * @return {@link Response}
     * */
    Response getUserAllPassInfo(Long userId) throws Exception;

    /**
     * <h2>user uses coupon (action)</h2>
     * @param pass {@link Pass}
     * @return {@link Response}
     * */
    Response userUsePass(Pass pass);
}
