
package com.hkystyle.swagger.apidoc.results;

import java.io.Serializable;

/**
 * 返回基类
 * Created by hukaiyang on 2017/9/15.
 */
public class BaseResult implements Serializable {
    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误描述
     */
    private String errorMessage;

    /**
     * 服务器时间
     */
    private String serverTime;

    /**
     * 获取 错误码
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * 设置 错误码
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 获取 错误描述
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * 设置 错误描述
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * 获取 服务器时间
     */
    public String getServerTime() {
        return this.serverTime;
    }

    /**
     * 设置 服务器时间
     */
    public void setServerTime(String serverTime) {
        this.serverTime = serverTime;
    }
}
