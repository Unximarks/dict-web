package com.farm.sale.api.uitl;

import java.io.Serializable;
import java.text.MessageFormat;


import com.farm.sale.api.enums.BaseConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 全局的返回对象，只有有返回值的Rest接口必须使用这个返回对象。
 * 注意：  如果data是没有任何数据的，请使用java.lang.Void类来做为泛型参数。
 * 说明： 可以自己使用builder模式的方法自定义构建，也可以使用类中提供的静态方法，也可以在new()后使用类中成员方法
 * 其中BaseConstant类的定义在 https://www.cnblogs.com/yangzhilong/p/4335673.html
 * @author mazq
 * @date
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GlobalResponse<T> implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 8753813726294333866L;
    /**
     * 是否请求成功
     */
    private Boolean success;
    /**
     * 错误码
     */
    private Integer code =20000;
    /**
     * 错误描述，可选值有：普通字符串、带{0}类似的待格式化字符串
     */
    private String message;
    /**
     * 业务数据， 如没有该值，泛型请试用java.lang.Void
     */
    private T data;

    /**
     *  成员方法begin---------------------------
     */

    /**
     * 设置带格式化信息的错误信息
     * 使用MessageFormat进行格式化
     * @param code
     * @param msg
     * @param formatArguments
     * @return
     */
    public GlobalResponse<T> setError(Integer code, String msg, Object... formatArguments) {
        success = Boolean.FALSE;
        code = code;
        if(formatArguments.length > 0) {
            message = MessageFormat.format(msg, formatArguments);
        } else {
            message = msg;
        }
        return this;
    }

    /**
     * 设置带格式化信息的错误信息
     * @param responseCode
     * @param formatArguments
     * @return
     */
    public GlobalResponse<T> setError(BaseConstant<Integer> responseCode, Object... formatArguments) {
        setError(responseCode.getCode(), responseCode.getDesc(), formatArguments);
        return this;
    }

    /**
     * 设置错误信息
     * @param code
     * @param msg
     * @return
     */
    public GlobalResponse<T> setError(String code, String msg) {
        setError(code, msg);
        return this;
    }

    /**
     * 设置错误信息
     * @param responseCode
     * @return
     */
    public GlobalResponse<T> setError(BaseConstant<String> responseCode) {
        setError(responseCode.getCode(), responseCode.getDesc());
        return this;
    }

    /**
     *  成员方法end---------------------------
     */

    /**
     * 静态方法begin--------------------------
     */

    public static <T> GlobalResponse<T> success() {
        return new GlobalResponse<T>(true, 20000, null, null);
    }

    public static <T> GlobalResponse<T> success(T data) {
        return new GlobalResponse<T>(true, 20000, "错误", data);
    }

    /**
     * 无任何错误信息的静态fail
     * @param <T>
     * @return
     */
    public static <T> GlobalResponse<T> fail() {
        return new GlobalResponse<T>(false, null, null, null);
    }

    /**
     * 带简单错误信息的静态fail
     * @param <T>
     * @param responseCode
     * @return
     */
    public static <T> GlobalResponse<T> fail(BaseConstant<Integer> responseCode) {
        return new GlobalResponse<T>(false, responseCode.getCode(), responseCode.getDesc(), null);
    }

    /**
     * 带格式化错误信息的静态fail
     * @param <T>
     * @param responseCode
     * @param formatArguments
     * @return
     */
    public static <T> GlobalResponse<T> fail(BaseConstant<Integer> responseCode, Object... formatArguments) {
        return new GlobalResponse<T>().setError(responseCode, formatArguments);
    }

    /**
     * 带简单信息的fail
     * @param <T>
     * @param errorCode
     * @param errorMsg
     * @return
     */
    public static <T> GlobalResponse<T> fail(Integer errorCode, String errorMsg) {
        return new GlobalResponse<T>(false, errorCode, errorMsg, null);
    }

    /**
     * 带格式化错误信息的fail
     * @param <T>
     * @param errorCode
     * @param errorMsg
     * @param formatArguments
     * @return
     */
    public static <T> GlobalResponse<T> fail(Integer errorCode, String errorMsg, Object... formatArguments) {
        return new GlobalResponse<T>().setError(errorCode, errorMsg, formatArguments);
    }

    /**
     * 返回数据的fail
     * @param <T>
     * @param responseCode
     * @param data
     * @return
     */
    public static <T> GlobalResponse<T> fail(BaseConstant<Integer> responseCode,T data) {
        return new GlobalResponse<T>(false, responseCode.getCode(), responseCode.getDesc(), data);
    }

    /**
     * 全自定义的build
     * @param <T>
     * @param success
     * @param code
     * @param message
     * @param data
     * @return
     */
    public static <T> GlobalResponse<T> build(Boolean success, Integer code, String message, T data) {
        return new GlobalResponse<T>(success, code, message, data);
    }
    /**
     * 静态方法end---------------------------------
     */
}