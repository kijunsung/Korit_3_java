package ch08_methods;
/*
    method overloading
        매개변수와 형태가 다르면 동일한 매서드 명을 가지고 있다고 정의할 수 있다.

        즉, 매서드명은 똑같고, paramrter에 들어가는 자료형 및 변수형을 달리
        사용이 가능함.

        overloading의 장점 :
        동일한 기능을 매서드를 정의할 때 매서드명이 필요한데,
        예를 들어 string 자료형끼리 연결해주는 매서드와
        int끼리 합 연산을 하는 매서드를 나누었을 때,
        그리고 double끼리 합 연산을 하는 매서드를 나누었을 때,
        add,
        plus,
        connect등의 매서드를 정의했다면
        다음 연산자 +가 들어가는 매서드명은 또 뭘로 해야될까요/
 */
public class Overloading {
    //매서드 정의
    //call() 유형으로 작성
    public static void add() {
        System.out.println("add()");
    }
    //call2()유형으로 작성
    public static void add(String s) {
        System.out.println("add(String s)");
        System.out.println(s);
    }

    //call2()유형으로 작성 # 2
    public static void add(int a, int b) {
        System.out.println("add(int a, int b)");
        System.out.println("a + b = " + (a + b));
    }

    // call2() 유형으로 작성 # 3
    public static void add(int a, int b, int c) {
        System.out.println("add(int a, int b, int c)");
        System.out.println("a + b + c = " + (a + b + c));
    }

    public static void add(String s, int a) {
        System.out.println("add(String s, int a)");
        System.out.println(s + " / " + a);
    }

    // 매개변수 순서만 달라도 overloading에 해당함
    public static void add(int a, String s) {
        System.out.println("add(int a, String s)");
        System.out.println(a + " / " + s);
    }

    public static void main(String[] args) {
        //매서드 호출
        add();
        add("안녕하세요");
        add(1, 2);
        add(1, 2, 3);
        add("기준성", 25);
        add(712, "호");
    }
}












