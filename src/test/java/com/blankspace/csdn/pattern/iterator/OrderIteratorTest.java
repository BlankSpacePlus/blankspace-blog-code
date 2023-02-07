package com.blankspace.csdn.pattern.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderIteratorTest {

    private final String orderJsonPattern = "OrderItem{orderItemId=1, productName='咖啡'}\n"
            + "OrderItem{orderItemId=2, productName='方便面'}\n"
            + "OrderItem{orderItemId=3, productName='面包'}\n"
            + "OrderItem{orderItemId=4, productName='橙汁'}\n"
            + "OrderItem{orderItemId=5, productName='巧克力'}\n"
            + "OrderItem{orderItemId=6, productName='火腿肠'}\n"
            + "OrderItem{orderItemId=7, productName='矿泉水'}\n"
            + "OrderItem{orderItemId=8, productName='薯片'}\n"
            + "OrderItem{orderItemId=9, productName='饼干'}\n"
            + "OrderItem{orderItemId=10, productName='爆米花'}\n";

    @Test
    public void iteratorTest1() {
        Order order = new Order();
        order.addOrderItem(new OrderItem(1, "咖啡"));
        order.addOrderItem(new OrderItem(2, "方便面"));
        order.addOrderItem(new OrderItem(3, "面包"));
        order.addOrderItem(new OrderItem(4, "橙汁"));
        order.addOrderItem(new OrderItem(5, "巧克力"));
        order.addOrderItem(new OrderItem(6, "火腿肠"));
        order.addOrderItem(new OrderItem(7, "矿泉水"));
        order.addOrderItem(new OrderItem(8, "薯片"));
        order.addOrderItem(new OrderItem(9, "饼干"));
        order.addOrderItem(new OrderItem(10, "爆米花"));
        Iterator<OrderItem> iterator = order.getIterator();
        StringBuilder result = new StringBuilder();
        while (iterator.hasNext()) {
            result.append(iterator.getNext()).append('\n');
        }
        Assertions.assertEquals(orderJsonPattern, result.toString());
    }

    @Test
    public void iteratorTest2() {
        OrderItem[] orderItems = new OrderItem[] {
                new OrderItem(1, "咖啡"),
                new OrderItem(2, "方便面"),
                new OrderItem(3, "面包"),
                new OrderItem(4, "橙汁"),
                new OrderItem(5, "巧克力"),
                new OrderItem(6, "火腿肠"),
                new OrderItem(7, "矿泉水"),
                new OrderItem(8, "薯片"),
                new OrderItem(9, "饼干"),
                new OrderItem(10, "爆米花")
        };
        Order order = new Order(orderItems);
        Iterator<OrderItem> iterator = order.getIterator();
        StringBuilder result = new StringBuilder();
        while (iterator.hasNext()) {
            result.append(iterator.getNext()).append('\n');
        }
        Assertions.assertEquals(orderJsonPattern, result.toString());
    }

    @Test
    public void iteratorTest3() {
        Order order = new Order(1);
        order.addOrderItem(new OrderItem(1, "咖啡"));
        order.addOrderItem(new OrderItem(2, "方便面"));
        order.addOrderItem(new OrderItem(3, "面包"));
        order.addOrderItem(new OrderItem(4, "橙汁"));
        order.addOrderItem(new OrderItem(5, "巧克力"));
        order.addOrderItem(new OrderItem(6, "火腿肠"));
        order.addOrderItem(new OrderItem(7, "矿泉水"));
        order.addOrderItem(new OrderItem(8, "薯片"));
        order.addOrderItem(new OrderItem(9, "饼干"));
        order.addOrderItem(new OrderItem(10, "爆米花"));
        Iterator<OrderItem> iterator = order.getIterator();
        StringBuilder result = new StringBuilder();
        while (iterator.hasNext()) {
            result.append(iterator.getNext()).append('\n');
        }
        Assertions.assertEquals(orderJsonPattern, result.toString());
    }

}
