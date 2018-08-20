package com.qiyu.passbook.passbook.dao;

import com.qiyu.passbook.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <h1>Merchants Dao interface</h1>
 * Created by Qiyu.
 */
public interface MerchantsDao extends JpaRepository<Merchants, Integer> {

    Merchants findById(Integer id);

    Merchants findByName(String name);

    List<Merchants> findByIdIn(List<Integer> ids);
}
