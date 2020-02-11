package com.icbc.tech.framework.demo.multimodule.common.response;

import com.alibaba.fastjson.JSONObject;

/**
 * @author: ytbs
 * @create_time: 2019/10/18 16:41
 * @modify_by:
 * @modify_time:
 * @description:
 */
public class ResponseBean<T> {

    private String retCode;
    private String retMsg;
    private T result;

    public ResponseBean() {
    }

    public ResponseBean(String retCode, String retMsg) {
        this.retCode = retCode;
        this.retMsg = retMsg;
        this.result = (T) new JSONObject();
    }

    public ResponseBean(String retCode, String retMsg, T result) {
        this.retCode = retCode;
        this.retMsg = retMsg;
        this.result = result;
    }

    public ResponseBean(ErrorEnum e) {
        this.retCode = e.getErrorCode();
        this.retMsg = e.getErrorMsg();
        this.result = (T) new JSONObject();
    }

    public static ResponseBean succ(){
        return new ResponseBean("0", "请求成功");
    }

    public static ResponseBean succ(String retMsg){
        return new ResponseBean("0", "请求成功");
    }

    public static ResponseBean error(String retCode, String retMsg){
        return new ResponseBean(retCode, retMsg);
    }

    public static ResponseBean error(ErrorEnum e){
        return new ResponseBean(e);
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}
