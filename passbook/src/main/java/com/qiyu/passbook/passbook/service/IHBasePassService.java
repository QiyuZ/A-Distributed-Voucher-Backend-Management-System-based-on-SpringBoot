package com.qiyu.passbook.passbook.service;

import com.qiyu.passbook.passbook.vo.PassTemplate;

/**
 * <h1>Pass Hbase service</h1>
 * Created by Qiyu.
 */
public interface IHBasePassService {

    /**
     * <h2>将 PassTemplate write into HBase</h2>
     * @param passTemplate {@link PassTemplate}
     * @return true/false
     * */
    boolean dropPassTemplateToHBase(PassTemplate passTemplate);
}
