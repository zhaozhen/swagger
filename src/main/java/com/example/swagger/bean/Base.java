package com.example.swagger.bean;

import io.swagger.annotations.ApiModelProperty;

public class Base {
    @ApiModelProperty(value = "用户的年龄，比如：20")
    private int baseId;

    public int getBaseId() {
        return baseId;
    }

    public void setBaseId(int baseId) {
        this.baseId = baseId;
    }
}
