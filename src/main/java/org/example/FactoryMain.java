package org.example;

import ch17_static.singleton.Factory;
import ch17_static.singleton.SmartPhone;

public class FactoryMain {
    public static void main(String[] args) {
        ch17_static.singleton.Factory factory1 = new ch17_static.singleton.Factory("1공장");
        ch17_static.singleton.Factory factory2 = new ch17_static.singleton.Factory("2공장");
        ch17_static.singleton.Factory factory3 = new ch17_static.singleton.Factory("3공장");
        ch17_static.singleton.Factory factory4 = new Factory("4공장");

        SmartPhone smartPhone1 = factory1.produceSmartPhone();

        System.out.println(smartPhone1);
        SmartPhone smartPhone2 = factory1.produceSmartPhone();
        System.out.println(smartPhone2);
        SmartPhone smartPhone3 = factory3.produceSmartPhone();
        System.out.println(smartPhone3);
        SmartPhone smartPhone4 = factory4.produceSmartPhone();
        System.out.println(smartPhone4);


    }
}