package com.example.swagger.controller;

import com.example.swagger.bean.User;
import io.swagger.annotations.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.*;

@Api(value = "Sample-API", description = "测试")
@RestController
@RequestMapping("/jhon")
public class JhonController {

        static Map<String, User> users = Collections.synchronizedMap(new HashMap<String, User>());

//
        @ApiOperation(value = "获取用户列表",notes = "根据url的id来获取用户详细信息，返回List<User>类型用户信息的JSON")
        @RequestMapping(value = {""}, method=RequestMethod.GET)
        public List<User> getUserList() {
                List<User> r = new ArrayList<User>(users.values());
                Map<String, Object> ret=  new HashMap<>();
                ret.put("users", r);
                ret.put("timstamp", System.currentTimeMillis());
                ret.put("price", BigDecimal.ZERO);
                ret.put("date", new Date());
                ret.put("query_id", "xxxx-id");
                return r;
        }

        @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
        @ApiImplicitParams({
                @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User"),
                @ApiImplicitParam(name = "flag", value = "是否开启标志位", dataType = "xxx"),
                @ApiImplicitParam(name = "version", value = "版本号", required = true, dataType = "string")

        })
        @RequestMapping(value = "", method = RequestMethod.POST)
        public BigDecimal postUser(User user, @RequestParam(defaultValue = "false") boolean flag, String version) {
                users.put(user.getId(), user);
                return BigDecimal.ZERO;
        }

        @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
        //描述容器
        @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String")
        @RequestMapping(value = "/{id}", method = RequestMethod.GET)
        public User getUser(@PathVariable String id) {
                System.out.println(id);
                return users.get(id);
        }

        @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
        @ApiImplicitParams({
                @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType = "path"),
                @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
        })
        @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
        public String putUser(@PathVariable @ApiParam(name = "id",value = "idValue",hidden = true) String id, @RequestBody User user) {
                User u = users.get(id);
                u.setName(user.getName());
                u.setAge(user.getAge());
                users.put(id, u);
                return "success";
        }

        @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
        @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType = "path")
        @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
        public String deleteUser(@PathVariable String id) {
                users.remove(id);
                return "success";
        }

}
