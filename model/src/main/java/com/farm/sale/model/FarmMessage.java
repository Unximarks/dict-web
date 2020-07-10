package com.farm.sale.model;

import java.util.Date;
import java.io.Serializable;

/**
 * (FarmMessage)实体类
 *
 * @author mazq
 * @since 2020-07-10 16:19:18
 */
public class FarmMessage implements Serializable {
    private static final long serialVersionUID = -53648309212363314L;
    /**
    * id值
    */
    private Integer id;
    /**
    * 名称
    */
    private String name;
    /**
    * 介绍
    */
    private String phone;
    
    private String email;
    
    private String message;
    
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}