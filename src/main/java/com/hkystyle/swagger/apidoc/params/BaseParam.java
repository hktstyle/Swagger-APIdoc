/**
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.hkystyle.swagger.apidoc.params;

import java.io.Serializable;

/**
 * 入参基类
 * Created by hukaiyang on 2017/9/15.
 */
public class BaseParam implements Serializable {

    /**
     * 搜索关键字
     */
    private String searchKey;

    /**
     * 获取 搜索关键字
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * 设置 搜索关键字
     */
    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }
}
