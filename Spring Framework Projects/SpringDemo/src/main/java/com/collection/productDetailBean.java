package com.collection;


import java.util.Properties;

public class productDetailBean {

    private String pr_name;
    private String  pr_id;
    private int qty;
    private double price;

    private Properties pros;

    public String getPr_name() {
        return pr_name;
    }

    public void setPr_name(String pr_name) {
        this.pr_name = pr_name;
    }

    public String getPr_id() {
        return pr_id;
    }

    public void setPr_id(String pr_id) {
        this.pr_id = pr_id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

    @Override
    public String toString() {
        return "productDetailBean{" +
                "pr_name='" + pr_name + '\'' +
                ", pr_id='" + pr_id + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}