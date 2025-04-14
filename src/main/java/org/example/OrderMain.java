package org.example;

public class OrderMain {
    public static void main(String[] args) {

        Order order1 = new Order.Builder()
                .orderId(100)
                .productName("samsung GalaxyBook2 Pro")
                .consumer("홍길동")
                .price(1450000)
                .stock(2)
                .build();

        order1.showInfo();
    }



}