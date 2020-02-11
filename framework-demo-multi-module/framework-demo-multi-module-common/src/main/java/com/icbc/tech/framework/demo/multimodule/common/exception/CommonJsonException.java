package com.icbc.tech.framework.demo.multimodule.common.exception;

import com.alibaba.fastjson.JSONObject;
import com.icbc.tech.framework.demo.multimodule.common.response.ErrorEnum;
import com.icbc.tech.framework.demo.multimodule.common.response.ResponseBean;

/**
 * @author: ytbs
 * @create_time: 2019/10/21 11:04
 * @modify_by:
 * @modify_time:
 * @description:
 */
public class CommonJsonException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private ResponseBean responseBean;

    /**
     * 调用时可以在任何代码处直接throws这个Exception,
     * 都会统一被拦截,并封装好json返回给前台
     *
     * @param errorEnum 以错误的ErrorEnum做参数
     */
    public CommonJsonException(ErrorEnum errorEnum) {
        this.responseBean = ResponseBean.error(errorEnum);
    }

    public CommonJsonException(ResponseBean responseBean) {
        this.responseBean = responseBean;
    }

    public CommonJsonException(String retCode, String retMsg) {
        responseBean = new ResponseBean();
        responseBean.setRetCode(retCode);
        responseBean.setRetMsg(retMsg);
        responseBean.setResult(new JSONObject());
    }


    public ResponseBean getResponseBean() {
        return responseBean;
    }

}
