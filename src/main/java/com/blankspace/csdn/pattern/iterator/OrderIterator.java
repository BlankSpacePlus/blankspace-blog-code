package com.blankspace.csdn.pattern.iterator;

public class OrderIterator implements Iterator<OrderItem> {

    private Order order;

    private int index;

    public OrderIterator(Order order) {
        this.order = order;
    }

    @Override
    public boolean hasNext() {
        return this.index < order.getSize();
    }

    @Override
    public OrderItem getNext() {
        OrderItem item = order.getOrderItem(this.index);
        this.index++;
        return item;
    }

}
