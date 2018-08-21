package com.qiyu.passbook.passbook.service;

import com.qiyu.passbook.passbook.vo.Response;
import com.qiyu.passbook.passbook.vo.User;

/**
 * <h1>create user</h1>
 * Created by Qiyu.
 */
public interface IUserService {

    /**
     * <h2>create user</h2>
     * @param user {@link User}
     * @return {@link Response}
     * */
    Response createUser(User user) throws Exception;
}
