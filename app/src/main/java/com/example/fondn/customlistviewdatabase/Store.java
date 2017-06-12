package com.example.fondn.customlistviewdatabase;

/**
 * Created by fondn on 6/13/2017.
 */

public class Store {
    private int no;
    private String name;

    public Store() {
    }

    public Store(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Store(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
