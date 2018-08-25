package com.qiyu.passbook.passbook.service;

import com.qiyu.passbook.passbook.vo.Response;

/**
 * <h1>return inventory info: every users should see the different amount depending on whether they have used or not</h1>
 * Created by Qiyu.
 */
public interface IInventoryService {

    /**
     * <h2>inventory info</h2>
     * @param userId  id
     * @return {@link Response}
     * */
    Response getInventoryInfo(Long userId) throws Exception;
}
