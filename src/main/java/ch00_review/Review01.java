package ch00_review;

import java.util.Scanner;

public class Review01 {
    public static void main(String[] args) {
        System.out.println("안녕 자바야 하하");
        //변수: 데이터를 담는 바구니인데, 이름표를 붙혀줌
        //변수의 선언 방식
        // 자료명 변수명 = 데이터;
        // 자료형 : int, double, String, boolean
        //변수명 짓는 규칙 : 카멜케이스
        //카멜케이스 예시 myExample과 같은 방식으로 작성
        double height = 177;
        System.out.println(height);

        //이름, 나이, 생년월일을 적절한 자료형과 변수명으로
        //선언 및 초기화 한 다음
        //sout을 통해 다음과 같이 출력하시오
        /*
            실행 예
            제아름은 어쩌고이고, 나이는 ~살입니다
            생일은 20250329  입니다.
            10년 후에 저는 (~ +10)살이 됩니다. 하하 젠장)

         */
        String name = "기준성";
        int age = 25;
        int birthday = 20010522;
        System.out.println("제이름은 "+name+ "이고, 나이는 "+ age + " 입니다.");
        System.out.println("생일은 "+ birthday + "입니다" );
        System.out.println("10년 후에 저는 "+(age + 10)+"살이 됩니다. 하하 젠장");

        Scanner scanner = new Scanner(System.in);
        String name1 = "";
        int age1 = 0;
        int birthday1 = 0;

        System.out.print("이름 말하시오 >>> ");

        name1 = scanner.next();
        System.out.print("나이 말하쇼 >>> ");

        age1 = scanner.nextInt();
        System.out.print("생일 적으쇼 >>> ");

        birthday1 = scanner.nextInt();

        System.out.println("제이름은 "+name1+ "이고, 나이는 "+ age1  +"입니다.");
        System.out.println("생일은 "+ birthday1 + "입니다" );
        System.out.println("10년 후에 저는 "+(age1 + 10)+"살이 됩니다. 하하 젠장");


    }
}
