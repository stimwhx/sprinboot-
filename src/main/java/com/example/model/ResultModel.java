package com.example.model;

import java.util.Map;

public class ResultModel {
    private int errcode;
    private String errmsg;
    private Map<String,Object> data;
    public ResultModel(){}
    public ResultModel(int errcode,String errmsg,Map<String,Object> data){
        this.errcode=errcode;
        this.errmsg=errmsg;
        this.data=data;
    }
    public int getErrcode() {
        return errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }


}
