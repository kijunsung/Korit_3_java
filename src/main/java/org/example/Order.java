package org.example;


public class Order {
    private int orderId;
    private String productName;
    private String consumer;
    private int price;
    private int stock;


    private Order(Builder builder) {

        this.orderId = builder.orderId;
        this.productName = builder.productName;
        this.consumer = builder.consumer;
        this.price = builder.price;
        this.stock = builder.stock;
    }

    public void showInfo() {
        System.out.println("주문 번호: "+ orderId +  "\n상품명: " + productName+"" +
                "\n구매자: "+ consumer+ "\n가격: "+ price+ "\n수량: "+stock);
    }

    public static class Builder {
        private int orderId;
        private String productName;
        private String consumer;
        private int price;
        private int stock;

        public Builder orderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder consumer(String consumer) {
            this.consumer = consumer;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Builder stock(int stock) {
            this.stock = stock;
            return this;
        }

        public Order build() {
            return new Order(this);
        }

        }
    }

