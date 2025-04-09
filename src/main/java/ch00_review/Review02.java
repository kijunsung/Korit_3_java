package ch00_review;

public class Review02 {
    public static void main(String[] args) {
        /*
            연산자
            1) 대입 연산자 =
            2) 복합 대입 연산자
                +=
                -=
                *=
                /=
         */

        double height = 0; //세로
        double width = 0;  //가로
        double area = 0;
        double area2 = 0;
        //1. 이상의 변수에 새로 30.3 / 가로 124.37인
        //사각형의 넓이를 구하시오
        //2. 동일한 가로 세로의 삼각형 넓이를 구하시오
        //실행 예
        //가로 124.37, 세로 30.3인 삼각형의 넓이는 ...이고
        //사각형의 넓이는 ...입니다.

        height = 30.3;
        width = 124.37;
        area = height * width;
        area2 = height * width * 0.5;
        System.out.println("가로 " + width + ", 세로"+ height+ "인 사각형의 넓이는" +area+"이고 ");;
        System.out.println("가로 " + width + ", 세로"+ height+ "인 삼각형의 넓이는" +area2+"이다 ");;

    }
}
