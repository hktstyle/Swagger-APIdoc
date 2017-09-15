
package com.hkystyle.swagger.apidoc.params;

/**
 * Created by hukaiyang on 2017/9/15.
 */
public class DataParam<T> extends BaseParam {
    /**
     * 请求参数
     */
    private T param;

    /**
     * 获取 请求参数
     */
    public T getParam() {
        return this.param;
    }

    /**
     * 设置 请求参数
     */
    public void setParam(T param) {
        this.param = param;
    }
}
