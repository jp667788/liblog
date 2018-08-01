package com.lijp.liblog.bean;

/**
 * controller消息结果实体
 *
 * Created by Li on 2018/7/29.
 */

public class ResultMsg<T> {

    /**
     * 错误码
     */
    private String  code;

    /**
     * 请求是否成功
     */
    private boolean success;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回对象实体
     */
    private T obj;

    /**
     * 空构造
     */
    public ResultMsg(){

    }

    /**
     * 错误信息构造
     *
     * @param errorMsg
     *          错误信息
     */
    public ResultMsg(String errorMsg) {
        this.msg = errorMsg;
        this.setSuccess(false);
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


    public void setErrorMsg(String errorMsg) {
        this.success = false;
        this.msg = errorMsg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
