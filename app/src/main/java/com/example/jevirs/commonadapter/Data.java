package com.example.jevirs.commonadapter;

public class Data {
    private String title;
    private String detail;
    private String time;
    private int res;

    public Data(String title, String time, String detail,int res) {
        this.title = title;
        this.time = time;
        this.detail = detail;
        this.res = res;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
