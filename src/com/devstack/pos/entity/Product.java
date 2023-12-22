package com.devstack.pos.entity;

public class Product {

    private int code;
    private int description;

    public Product(int anInt, String string) {
    }

    public Product(int code, int description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", description=" + description +
                '}';
    }
}
