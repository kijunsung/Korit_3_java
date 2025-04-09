package ch09_classes;

import java.util.Scanner;

public class Carmain {
    public static void main(String[] args) {
        //객체 생성
        //클래스명 객체명 = new클래스명();
        Car mycar = new Car();
        Car yourcar = new Car();

        //mycar / yourcar에 각각 값 대입
        //

        mycar.color = ("발강");
        mycar.speed = 180;

        yourcar.color = ("노랑");
        yourcar.speed = 170;

        mycar.drive();
        yourcar.drive();
        mycar.display_info();
        yourcar.display_info();










    }

}
