package com.qiyu.passbook.passbook.service;

import com.qiyu.passbook.passbook.vo.Feedback;
import com.qiyu.passbook.passbook.vo.Response;

/**
 * <h1>two comments function</h1>
 * Created by Qiyu.
 */
public interface IFeedbackService {

    /**
     * <h2>make feedback</h2>
     * @param feedback {@link Feedback}
     * @return {@link Response}
     * */
    Response createFeedback(Feedback feedback);

    /**
     * <h2>get user's feedback</h2>
     * @param userId user id
     * @return {@link Response}
     * */
    Response getFeedback(Long userId);
}
