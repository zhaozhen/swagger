package com.example.swagger.controller;

import com.example.swagger.bean.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@Api(value = "Bodata-API", description = "测试bodata返回值")
@RestController
@RequestMapping("/bodata")
public class BodataController {
    @ApiOperation(value = "返回bodata类型的数据",notes = "测试bodata，返回List的User类型用户信息的bodata")
    @RequestMapping(value = {"/getBodataListUser"}, method= RequestMethod.GET)
    public BoData getUserList() {
        BoData b=new BoData();
        Base ba=new Base();
        ba.setBaseId(1111);
        List<User> users = new ArrayList<User>();

        User u=new User();
        u.setAge(12);
        u.setName("liming");
        u.setBase(ba);

        User u1=new User();
        u1.setAge(18);
        u1.setName("小红");
        u1.setBase(ba);

        users.add(u);
        users.add(u1);

        b.setErrorCode(100);
        b.setError("没有错误");
        b.setData(users);
        return b;
    }


    @ApiOperation(value = "返回bodata类型的数据",notes = "测试bodata，返回User类型用户信息的bodata")
    @RequestMapping(value = {"/getBodataUser"}, method= RequestMethod.GET)
    public BoData getUser() {
        BoData b=new BoData();
        Base ba=new Base();
        ba.setBaseId(1111);

        User u=new User();
        u.setAge(12);
        u.setName("liming");
        u.setBase(ba);

        b.setErrorCode(100);
        b.setError("没有错误");
        b.setData(u);

        return b;
    }

    @ApiOperation(value = "返回bodata2类型的数据",notes = "测试bodata，返回List的User类型用户信息的bodata2")
    @RequestMapping(value = {"/getBodata2ListUser"}, method= RequestMethod.GET)
    public BoData2 getUserListBodata2() {
        BoData2 b=new BoData2();
        Base ba=new Base();
        ba.setBaseId(1111);
        List<User> users = new ArrayList<User>();

        User u=new User();
        u.setAge(12);
        u.setName("liming");
        u.setBase(ba);

        User u1=new User();
        u1.setAge(18);
        u1.setName("小红");
        u1.setBase(ba);

        users.add(u);
        users.add(u1);

        b.setErrorCode(100);
        b.setError("没有错误");
        b.setData(users);
        return b;
    }

    @ApiOperation(value = "返回bodata类型的数据",notes = "测试bodata，返回User类型用户信息的bodata")
    @RequestMapping(value = {"/getBodata3User"}, method= RequestMethod.GET)
    public BoData3 getBodata3User() {
        BoData3 b=new BoData3();
        Base ba=new Base();
        ba.setBaseId(1111);

        User u=new User();
        u.setAge(12);
        u.setName("liming");
        u.setBase(ba);

        b.setErrorCode(100);
        b.setError("没有错误");
        b.setData(u);

        return b;
    }

    @ApiOperation(value = "返回bodata类型的数据",notes = "测试bodata4，返回User类型用户信息的bodata4")
    @RequestMapping(value = {"/getBodata4User"}, method= RequestMethod.GET)
    public BoData4<User> getBodata4User() {
        BoData4 b=new BoData4();
        Base ba=new Base();
        ba.setBaseId(1111);

        User u=new User();
        u.setAge(12);
        u.setName("liming");
        u.setBase(ba);

        b.setErrorCode(100);
        b.setError("没有错误");
        b.setData(u);
        return b;
    }

    @ApiOperation(value = "返回bodata4的数据",notes = "测试bodata4，返回List的User类型用户信息的bodata")
    @RequestMapping(value = {"/getBodata4ListUser"}, method= RequestMethod.GET)
    public BoData4<List<User>> getBodata4UserList() {
        BoData4<List<User>> b=new BoData4<List<User>>();
        Base ba=new Base();
        ba.setBaseId(1111);
        List<User> users = new ArrayList<User>();

        User u=new User();
        u.setAge(12);
        u.setName("liming");
        u.setBase(ba);

        User u1=new User();
        u1.setAge(18);
        u1.setName("小红");
        u1.setBase(ba);

        users.add(u);
        users.add(u1);

        b.setErrorCode(100);
        b.setError("没有错误");
        b.setData(users);
        return b;
    }

}
