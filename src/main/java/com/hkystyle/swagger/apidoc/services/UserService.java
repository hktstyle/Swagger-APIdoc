
package com.hkystyle.swagger.apidoc.services;

import com.hkystyle.swagger.apidoc.models.UserInfo;
import org.springframework.stereotype.Service;

/**
 * Created by hukaiyang on 2017/9/15.
 */

@Service
public class UserService {

    /**
     * 获取用户信息
     * @param userId 用户 Id
     */
    public UserInfo getUserInfo(final String userId) {
        final UserInfo userInfo = new UserInfo();
        userInfo.setUserId("999");
        userInfo.setUserName("hky");
        userInfo.setAge(22);
        userInfo.setGender("男");
        return userInfo;
    }
}
