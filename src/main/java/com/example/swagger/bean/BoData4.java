
package com.example.swagger.bean;


import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class BoData4<T> implements Serializable {

    private static final long serialVersionUID = 6659079142768874748L;

    public static String STATUS = "status";
    public static String ERROR_CODE = "error_code";
    public static String ERROR = "error";
    public static String DATA = "data";

    public BoData4() {
        setStatus(true);
        setError("");
    }

    @ApiModelProperty(value = "返回状态，true是成功，0是失败")
    private boolean status;
    @ApiModelProperty(value = "返回数据，返回对象一般是返回成功的结果对象，返回失败为空")
    private T data; // 返回的数据
    @ApiModelProperty(value = "返回错误信息")
    private String error;
    @ApiModelProperty(value = "返回错误代码")
    private int errorCode = 0;
    
    public boolean isStatus() {
        return status;
    }
    
    public BoData4 setStatus(boolean status) {
        this.status = status;
        if (status) {
            this.error = "";
        }
        return this;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }
    
    public BoData4 setError(String error) {
        this.error = error;
        this.status = error == null || error.equals("");
        return this;
    }
    
    public int getErrorCode() {
        return errorCode;
    }
    
    public BoData4 setErrorCode(int errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    
    @Override
    public String toString() {
        return "BoData [status=" + status + ", data=" + data + "," + " error=" + error + ", errorCode=" + errorCode + "]";
    }
    
    @Override
    public boolean equals(Object o) {
        return false;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
}
