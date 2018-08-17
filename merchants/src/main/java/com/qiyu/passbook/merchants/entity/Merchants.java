package com.qiyu.passbook.merchants.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <h1>merchants model</h1>
 * Column name should be same as what in merchants.sql.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Table(name = "merchants")
public class Merchants {

    @Id //key
    @GeneratedValue //generate by self
    @Column(name = "id", nullable = false)
    private Integer id;


    @Basic //@transient is the opposite one which means not belongs to this table
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Basic
    @Column(name = "logo_url", nullable = false)
    private String logoUrl;

    @Basic
    @Column(name = "business_license_url", nullable = false)
    private String businessLicenseUrl;

    @Basic
    @Column(name = "phone", nullable = false)
    private String phone;

    @Basic
    @Column(name = "address", nullable = false)
    private String address;

    @Basic
    @Column(name = "is_audit", nullable = false)
    private Boolean isAudit = false;

}
