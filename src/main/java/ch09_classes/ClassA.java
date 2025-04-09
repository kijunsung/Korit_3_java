package ch09_classes;
/*
    1. 클래스란?
        객체를 생성하기 위한 설계도 = 클/ 청사진.
        현실 세계의 개념을 프로그래밍으로 표현할 때,
        '특정 사물이나 개념의 특징(속성)'과 행동 (매서드)"으로 정의함.
        예를 들어,
        "자동차"라는 클래스를 만든다면 자동차의 속성(색상, 속도)과,
        행동(가속, 정지 등)을 코드로 표현할 수 있음.

    2. 객체(Object)란?
    클래스를 설계도로 가정했을 때, 실제 사용할 수 있는 자동차(인스턴스)는 객체라고 함.

    여기서 Object와 INstance라는 표현은 우리나라에서는 거의 동일합니다.

    객체와 인스턴스의 관계
        객체는 포괄적인 개념으로 클래스에서 생성된 모든 것을 객체라고 표현.
        인스턴스는 특정 객체가 어떤 클래스의 구현체인지 강조하는 표현

    바유로 이해하기
        클래스 : 설계도
        객체 : 설계도를 바탕으로 만들어진 모든 실물
        인스턴스 : 특정 설계도를 기반으로 만들어진 "해당 실물"

        예를 들어,
            1. "사람"이라는 클래스를 고려할 때
            2. "홍길동", "김철수" 는 이 '클래스'에서 생성된 객체임
            3. "홍길동"은 "사람" 클래스의 인스턴스임
 */
public class ClassA {

    // 이 자리에는 아예 main을 안 쓸겁니다.

    //핅드(속성) / 인스턴스 변수 / 멤버 변수
    int num;
    String name;
    double score;

    // 메서드 정의
    void callName() {       //publuc static void가 아니라 그냥 void네요.
        System.out.println(name + "을 부릅니다.");

    }
}
