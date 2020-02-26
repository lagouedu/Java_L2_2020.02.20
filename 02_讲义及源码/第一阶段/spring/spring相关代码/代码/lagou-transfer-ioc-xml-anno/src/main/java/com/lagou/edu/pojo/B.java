package com.lagou.edu.pojo;

/**
 * @author 应癫
 */
public class B {

    private int id;
    private String xingming;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    @Override
    public String toString() {
        return "B{" +
                "id=" + id +
                ", xingming='" + xingming + '\'' +
                '}';
    }
}
