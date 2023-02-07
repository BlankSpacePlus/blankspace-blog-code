package com.blankspace.csdn.pattern.iterator;

public class Order implements Iterable<OrderItem> {

    private OrderItem[] orderItems;

    private int capacity;

    private int size;

    public Order() {
        this.capacity = 8;
        this.orderItems = new OrderItem[this.capacity];
        this.size = 0;
    }

    public Order(int size) {
        this.orderItems = new OrderItem[size];
        this.capacity = size;
        this.size = 0;
    }

    public Order(OrderItem[] orderItems) {
        this.orderItems = orderItems;
        this.capacity = this.orderItems.length;
        this.size = this.orderItems.length;
    }

    public OrderItem getOrderItem(int index) {
        if (index < this.size) {
            return this.orderItems[index];
        }
        return null;
    }

    public void addOrderItem(OrderItem newOrderItem) {
        if (this.capacity <= this.size) {
            int newCapacity = 2 * this.capacity + 1;
            OrderItem[] newOrderItems = new OrderItem[newCapacity];
            System.arraycopy(this.orderItems, 0, newOrderItems, 0, this.capacity);
            this.capacity = newCapacity;
            this.orderItems = newOrderItems;
        }
        this.orderItems[this.size++] = newOrderItem;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public Iterator<OrderItem> getIterator() {
        return new OrderIterator(this);
    }

}
