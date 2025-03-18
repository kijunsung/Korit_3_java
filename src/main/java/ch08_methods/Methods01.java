package ch08_methods;

import java.util.Scanner;

public class Methods01 {
    /*
    여기에 매서드를 정의할겁니다. 즉 이번수업 이후부턴 main을 치지 않는 class가
    생길 수 있습니다
     */


    //1. [x | x] [입력값 / 출력값]
    public static void call() {
        System.out.println("[x | x]");
        System.out.println("오늘은 별찍기와 method에 대해 학습중입니다.");
    }

    // 2. [o | x]
    public static void call2(String strExample) {   //정의 단계에서() 내에
        //있으면
        System.out.println("[o | x]");
        System.out.println("오늘의 스케줄 : " + strExample);
    }

    // 3. [x | o]
    public static String call3() {  //return의 자료형이 String임을 명시
        System.out.println("[x | o]");

        String result = "";

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < i+1; j++) {
                result += "*";
            }
        }

        return "안녕하세요";     //call1,2와 달리 return명령어가 있음.
    }

    public static String call4(int year, int month, int data, String day) {
        String result = "";

        result = year + "년 " + month+ "월 " + data + "일" + day + "요일입니다.";

        return result;

        //main에서 sout(call4(2025, 3, 17, "월")); 입력하시고 실행해보세요.
    }

    public static int writeMyage(int age) {
        int num = age;
        return num;
    }

    public static void writeMyage2(int age) {
        System.out.println(age); //sout찍으면 가공이 안됨
    }

    /*
        함수형 프로그래밍(functional programing) :
            aotjem1dml return값이 매서드2의 argument가 되고, 매서드2의 return값이
            매서드3의 argument가 되는 방식으로,

            첫 번쟤 매서드로부터 마지막 매서드까지의 흐름을 통해
            프로그램이 이어지는 방식을 의미함.

            간단 예시
     */
    public static String introduce (String name, int age) {
        return "제 이름은" + name+ "이고 나이는"+ age+ "살입니다.\n내년에 "+ (age + 1) + "살 입니다.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myName = "";
        int myAge = 0;

        System.out.println("이름을 입력하세요 >>>");
        myName = scanner.nextLine();
        System.out.println("나이를 입력하세요");
        myAge = scanner.nextInt();
        //이상의 코드는 scanner의 매서드인 .nextLine(), .nextInt()를 사용하여 그 결과 값을 각각
        //myName, myAge 변수에 저장한 부분입니다.

        System.out.println(introduce(myName, myAge));
        //그리고 이상의 코드는 81 - 86번 라인까지의 결과값들을 새로운 매서드인 introduce()의 name, age
        //매개변수에 각각 myName 및 myAge를 argument로 집어넣어서
        //introduce()매서드 내에서 데이터를 재가공하는 결과를 거치게됩니다.



        //md 파일에 작성한 3번 호출 방식을 사용할겁니다.
//        call();
//        call2("점심 고민");//호출 단계에서()내에 있는것은 argument
//        call3();
//        System.out.println(call3());//현재는 좀 불편해 보인다.
//        //왜 main단계에서 꼭 sout을 써야만 하는가.
//        //그냥 method 내부에 sout 써두면 main단께에서 편하게 호출 가능한데...
//        System.out.println((call4(2025, 3, 17, "월")));

        writeMyage(25);
        writeMyage2(25);
        // 70번 라인 및 71번 라인의 실향결과 38이 한번만 나옴 -> 70번 라인이 안찍힘.
        System.out.println(writeMyage(20)); //여전히 불편한 지점입니다.

        int nextAge = writeMyage(25) + 1;
        System.out.println(nextAge);

//        int nextAge2 = writeMyage2(25) + 1;
//        System.out.println(writeMyage2());
    }
}
