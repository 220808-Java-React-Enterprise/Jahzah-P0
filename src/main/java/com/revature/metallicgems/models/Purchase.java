package com.revature.metallicgems.models;

public class Purchase {
    String id;
    String user_id;
    String date;
    String total;
    String order_id;
    String e_id;

    public Purchase() {
    }

    public Purchase(String id, String user_id, String date, String total, String order_id, String e_id) {
        this.id = id;
        this.user_id = user_id;
        this.date = date;
        this.total = total;
        this.order_id = order_id;
        this.e_id = e_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getE_id() {
        return e_id;
    }

    public void setE_id(String e_id) {
        this.e_id = e_id;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id='" + id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", date='" + date + '\'' +
                ", total='" + total + '\'' +
                ", order_id='" + order_id + '\'' +
                ", e_id='" + e_id + '\'' +
                '}';
    }
}
