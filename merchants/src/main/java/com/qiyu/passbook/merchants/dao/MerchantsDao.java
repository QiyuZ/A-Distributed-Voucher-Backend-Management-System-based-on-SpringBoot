package com.qiyu.passbook.merchants.dao;

import com.qiyu.passbook.merchants.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <h1>Merchants Dao interface</h1>
 *
 */
public interface MerchantsDao extends JpaRepository<Merchants, Integer> {

    /**
     * <h2> id </h2>
     * @param id  id
     * @return {@link Merchants}
     * */
    Merchants findById(Integer id);

    /**
     * name
     * */
    Merchants findByName(String name);
}
