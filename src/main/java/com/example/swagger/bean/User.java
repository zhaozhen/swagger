package com.example.swagger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

//ApiModel的value 不要轻易设置，它在pramaType中有用到，description在v2／apt-docs中可以看到
@ApiModel(description = "我是描述",discriminator = "I am discriminator",value = "用户")
public class User {

    //在http://localhost:8080/v2/api-docs,value会被翻译成desctription，方便理解
    @ApiModelProperty(value = "姓名-------",name = "I am name",notes = "notes")
    private String name;
    //在swagger-ui.html#页面中如果返回User，ModelModel Schema选项卡可见
    @ApiModelProperty(value = "id",dataType = "String")
    private String id;
    @ApiModelProperty(value = "年龄----",name = "name",notes = "notes")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
