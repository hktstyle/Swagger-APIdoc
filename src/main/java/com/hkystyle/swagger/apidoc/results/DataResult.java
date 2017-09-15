
package com.hkystyle.swagger.apidoc.results;

/**
 * Created by hukaiyang on 2017/9/15.
 */
public class DataResult<T> extends BaseResult {
    /**
     * 返回数据
     */
    private T data;

    /**
     * 获取 返回数据
     */
    public T getData() {
        return this.data;
    }

    /**
     * 设置 返回数据
     */
    public void setData(T data) {
        this.data = data;
    }
}
