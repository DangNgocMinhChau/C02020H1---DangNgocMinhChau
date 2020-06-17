package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private String code;
    private String Date;

    public Product() {
    }

    public Product(int id, String name, String code, String Date) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.Date = Date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }
}
