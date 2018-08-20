package com.qiyu.passbook.passbook.vo;

import com.google.common.base.Enums;
import com.qiyu.passbook.passbook.constant.FeedbackType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>user feedback</h1>
 * Created by Qiyu.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {

    private Long userId;

    /** feedback type */
    private String type;

    /** PassTemplate RowKey, if that's app's comment, no this string */
    private String templateId;

    /** info */
    private String comment;

    public boolean validate() {

        FeedbackType feedbackType = Enums.getIfPresent(
                FeedbackType.class, this.type.toUpperCase()
        ).orNull();

        return !(null == feedbackType || null == comment || comment.length() > 1000);
    }
}
