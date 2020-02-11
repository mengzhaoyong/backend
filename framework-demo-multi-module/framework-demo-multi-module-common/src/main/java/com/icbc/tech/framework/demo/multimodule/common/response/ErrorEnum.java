package com.icbc.tech.framework.demo.multimodule.common.response;

/**
 * @author: ytbs
 * @create_time: 2019/10/18 11:29
 * @modify_by:
 * @modify_time:
 * @description:
 */
public enum ErrorEnum {
    /**
     * 全局错误返回码
     *
     */
    E_101("101", "请求处理异常，请稍后再试");


    private String errorCode;
    private String errorMsg;


    ErrorEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
