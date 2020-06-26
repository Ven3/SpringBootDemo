package com.nefu.entity;
/**
 * 统一返回实体类
 * @author Ven3
 *
 */
public class R {

    /**
     * 正常
     */
    public static final String SUCCESS = "200";

    /**
     * 存在错误
     */
    public static final String ERROR = "300"; 

    /**
     * 正常返回, 但是存在错误
     */
    public static final String NOTICE = "400";

    /**
     * 请求成功时的msg
     */
    public static final String SUCCESS_MSG = "请求成功";
    /**
     * 请求失败时的msg
     */
    public static final String FAILED_MSG = "请求失败";


    /**
     * 状态码
     */
    private String code;

    /**
     * 信息
     */
    private String msg;

    /**
     * 数据
     */
    private Object data;

    public R(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public R(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public R() {
        this.code = SUCCESS;
        this.msg = "成功";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
