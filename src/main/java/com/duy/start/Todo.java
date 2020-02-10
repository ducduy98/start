package com.duy.start;


public class Todo {
    String title;
    String detail;

    public Todo(String title, String detail) {
        this.title = title;
        this.detail = detail;
    }

    public Todo() {
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
}
