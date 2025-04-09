package ch08_methods;

import java.util.Scanner;

/*
    별찍기 관련한거 매서드로 구현할 생각입니다.
 */
public class Method02 {
    //call4 유형이 될 예정
    public static String getStar(int rows, int select) {    //row와 rowOfStars는 서로 다른 개념
        //사용할 지역 변수 선언
        String result = "";

        //select에 따라서 서로 다른 결과값이 나오도록 조건문을 작성할 계획입니다.(1. 이면 왼쪽으로 치우친 증가하는 별)
        if (select ==1) {
            for (int i =0; i < rows + 1; i++) {
                //별 찍히는 부분
                for(int j =0; j < i; j++) {
                    result += "*";
                }
                //개행
                result += "\n";
            }
        } else if (select == 2) {
            for (int i = 0; i < rows; i++) {
                //공백 찍히는 구문
                for (int j = 0; j < rows -( i + 1 ); j++) {
                    result += " ";
                }
                //별이 찍히는 for문
                for (int k = 0; k < i + 1; k++) {
                    result +="*";
                }
                result += "\n";
            }
        } else if (select ==3) {
            for (int i = 0; i < rows; i++) {
                for (int j = rows; j-i > 0; j--) {
                    result += "*";
                }
                //개행
                result += "\n";

            }

        } else if (select ==4) {
            // 오른쪽으로 감소하는 별찍기
            /*
             *****
              ****
               ***
                **
                 *
             */
            //개행을 책임지는 for문
            //
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < i; j++) {
                    result += " ";
                }
                for (int j = rows; j-i > 0; j--) {
                    result += "*";
                }
                //개행
                result += "\n";
            }

        }else {
            result = "잘못 입력하셨습니다. 프로그램 종료합니다";
        }
        return  result;
    }




    public static void main(String[] args) {
        //select4에 해당하는 for문 작성해보고 되면 컨c컨v 하면 빠르다




        // Scanner를 import
        Scanner scanner = new Scanner(System.in);
        //사용할 변수 목록 선언 및 초기화
        int rowOfStars = 0;
        int choice = 0;
        String starResult = "";

        System.out.println("몇 줄짜리 별을 생성할까요? >>>");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.println("메뉴를 선택하세요 >>>");
        choice = scanner.nextInt();

        starResult = getStar(rowOfStars, choice);
        System.out.println(starResult);

    }



}
