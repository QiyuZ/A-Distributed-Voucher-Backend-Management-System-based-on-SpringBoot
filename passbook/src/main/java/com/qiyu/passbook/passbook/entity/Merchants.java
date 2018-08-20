package com.qiyu.passbook.passbook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <h1>merchants models</h1>
 * Created by Qiyu.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "merchants")
public class Merchants {

    /** id */
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Integer id;

    /** merchants name */
    @Basic
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    /** merchants logo */
    @Basic
    @Column(name = "logo_url", nullable = false)
    private String logoUrl;

    /** merchants business_license */
    @Basic
    @Column(name = "business_license_url", nullable = false)
    private String businessLicenseUrl;

    /** business_license phone */
    @Basic
    @Column(name = "phone", nullable = false)
    private String phone;

    /** business_license address */
    @Basic
    @Column(name = "address", nullable = false)
    private String address;

    /** verified or not*/
    @Basic
    @Column(name = "is_audit", nullable = false)
    private Boolean isAudit;
}
