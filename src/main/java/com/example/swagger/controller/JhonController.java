package com.example.swagger.controller;

import com.example.swagger.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Api(value = "jhon", description = "测试")
@RestController
@RequestMapping("/jhon")
public class JhonController {

        static Map<String, User> users = Collections.synchronizedMap(new HashMap<String, User>());


        @ApiOperation(value = "获取用户列表", notes = "获取所有的用户node信息",httpMethod ="GET",code = 200)
        @ApiResponses(value = {
                @ApiResponse(code = 200, message = "Successful — 请求已完成"),
                @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
                @ApiResponse(code = 401, message = "未授权客户机访问数据"),
                @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
                @ApiResponse(code = 500, message = "服务器不能完成请求")}
        )
        @RequestMapping(value = {""}, method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
        public List<User> getUserList() {
                List<User> r = new ArrayList<User>(users.values());
                return r;
        }
}
