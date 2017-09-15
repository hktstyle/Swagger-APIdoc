
package com.hkystyle.swagger.apidoc.models;

import java.io.Serializable;

/**
 * 用户信息
 * Created by hukaiyang on 2017/9/15.
 */
public class UserInfo implements Serializable {
    /**
     * 用户 Id
     */
    private String userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String gender;

    /**
     * 获取 用户 Id
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * 设置 用户 Id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取 用户名称
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * 设置 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取 年龄
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * 设置 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取 性别
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * 设置 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}
