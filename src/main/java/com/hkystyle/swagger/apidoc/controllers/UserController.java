
package com.hkystyle.swagger.apidoc.controllers;


import com.hkystyle.swagger.apidoc.models.UserInfo;
import com.hkystyle.swagger.apidoc.params.DataParam;
import com.hkystyle.swagger.apidoc.results.DataResult;
import com.hkystyle.swagger.apidoc.services.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hukaiyang on 2017/9/15.
 */

@Api(description = "用户相关接口")
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserInfo", method = RequestMethod.POST)
    @ApiOperation(value = "获取用户信息", notes = "获取用户信息", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public DataResult<UserInfo> getUserInfo(@ApiParam @RequestBody DataParam<String> param) {
        final UserInfo userInfo = userService.getUserInfo(param.getParam());
        final DataResult<UserInfo> result = new DataResult<UserInfo>();
        result.setData(userInfo);
        return result;
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    @ApiOperation(value = "获取用户信息", notes = "获取用户信息", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponses({
            @ApiResponse(code = 404, message = "页面丢了~"),
            @ApiResponse(code = 400, message = "出了点小问题~")
    })
    public DataResult<UserInfo> getUser(@ApiParam @RequestParam("id") String param) {
        final UserInfo userInfo = userService.getUserInfo(param);
        final DataResult<UserInfo> result = new DataResult<UserInfo>();
        result.setData(userInfo);
        return result;
    }
}
