package ch03_operator;
/*
   ex) 한 단어 : Example01
       복수 단어 : MyExample01
   이상에서 확인 할 수 있는 것은 클래스 작성법이 변수 작성법과 유사하기는 하지만,
   첫 시작이 대문자냐 아니냐의 차이가 있습니다.
   첫 문자가 대문자이면서 두 번째 단어의 첫 문자를 대문자로 작성한느 것을 -> 파스칼 케이스
   첫 문자가 소문자이면서 두 번째 단어의 첫 문자를 대문자로 작성한느 것을 -> 카멜 케이스
    */
public class Operator01 {
    public static void main(String[] args) {
        int j = 10;
//        System.out.println(j);          // 변수명++ : 코드를 실행시킨 후에 j에 1을 더함
//        System.out.println(j++);        // 윗줄의 결과 11이 출력됨
//        System.out.println(j);          //
//        System.out.println(++j);
//        System.out.println(j--);
//        System.out.println(j);          //윗줄의 결과 11이 출력됨
//        System.out.println(--j);        // 결과값 10
 /* + : 더하기
    - : 빼기
    * : 곱하기
    / : 나누기

  */
        System.out.println("10 / 2의 나머지 : " + (10%2));
        System.out.println("10 / 3의 나머지 : " + (10%3));
        System.out.println("10 / 4의 나머지 : " + (10%4));

        System.out.println(10/2);
        System.out.println(10.0/3.0);
        System.out.println(10.0/4.0);

        int age = 10;

        System.out.println("제 나이는 " + age );
    }
}