package ch09_classes;

public class Car {
    //필드
    String color;
    int speed;

    //에서드(행동)
    void drive() {
        System.out.println(color + "자동차가 주행중입니다.");
    }

    void brake() {
        System.out.println(color + "자동차가 멈췄습니다");
    }

    void display_info() {
        System.out.println("이 차의 색갈은 " + color + "색이고,");
        System.out.println("최고 속도는 " + speed + "km/h입니다.");
    }
}
/*
    carmain 클래스를 생성
    car의 인스턴스인 mycar라는 객체를 생성하시오
    color에 빨강 대입, speed에 160대입
    yourcar 객체 생성하시오.
    color에 노랑 대입, speeㅇ 180 대입
    mycar는 drive() 메서드 호출
    yourcar는 brake()메서드 호출
    mycar, yourcar에 각각 display()메서드 호출하시오
 */


