package com.revature.metallicgems.models;

public class Earring {
    private String id;
    private int quantity;
    private String style;
    private String metal;
    private String color;
    private String order_id;
    private String warehouse_id;

    public Earring() {

    }

    public Earring(String id, int quantity, String style, String metal, String color, String order_id, String warehouse_id) {
        this.id =  id;
        this.quantity = quantity;
        this.style = style;
        this.metal = metal;
        this.color = color;
        this.order_id = order_id;
        this.warehouse_id = warehouse_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMetal() {
        return metal;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(String warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    @Override
    public String toString() {
        return "Earring{" +
                "id='" + id + '\'' +
                ", quantity=" + quantity +
                ", style='" + style + '\'' +
                ", metal='" + metal + '\'' +
                ", color='" + color + '\'' +
                ", order_id='" + order_id + '\'' +
                ", warehouse_id='" + warehouse_id + '\'' +
                '}';
    }


}
