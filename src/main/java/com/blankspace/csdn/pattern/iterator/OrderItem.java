package com.blankspace.csdn.pattern.iterator;

public class OrderItem {

    private int orderItemId;

    private String productName;

    public OrderItem(int orderItemId, String productName) {
        this.orderItemId = orderItemId;
        this.productName = productName;
    }

    public int getOrderItemId() {
        return this.orderItemId;
    }

    public String getProductName() {
        return this.productName;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId=" + orderItemId +
                ", productName='" + productName + '\'' +
                '}';
    }

}
