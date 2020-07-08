package com.farm.sale.model;

import lombok.Data;

import java.io.Serializable;

/**
 * (FarmGood)实体类
 *
 * @author mazq
 * @since 2020-07-08 16:07:26
 */
@Data
public class FarmGood implements Serializable {

    private static final long serialVersionUID = -53853176941533677L;
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
    private String introduce;

}