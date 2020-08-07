package com.farm.sale.api.enums;

/**
 * 常量的枚举定义接口
 * @author yangzhilong
 * @param <T>
 *
 */
public interface BaseConstant<T> {
    T getCode();
    String getDesc();
}