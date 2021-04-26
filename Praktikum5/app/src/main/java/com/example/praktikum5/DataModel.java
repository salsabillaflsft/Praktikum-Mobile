package com.example.praktikum5;

public class DataModel {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    private String name;
    private String detail;

    public DataModel (String name, String detail){
        this.name=name;
        this.detail=detail;
    }

}
