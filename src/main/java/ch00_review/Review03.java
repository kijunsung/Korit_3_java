package ch00_review;

import java.util.Scanner;

public class Review03 {
    public static void main(String[] args) {
        /*
            조건문
            if(조건식) {
                실행문
            }
            조건식 : true / false로 결정나는 식
            조건식이 true라면 {} 내의 실행문이 실행됨

            전체 형식 :
            if(조건문1) {
                실행문1
            } else if(조건식2) {
                실행문2
            } else if(조건식3) {
                실행문3
            } else if(조건식4) {
                실행문4
            }

            그리고, Neested if 문
            if(조건식1) {
                실행문 1-1
                if(조건식1-a) {
                    실행문1-a
                } else if(조건식2) {
                    실행문 1-a
                } else if(조건식3) {
                    실행문 1-a
                }
         */
        int age = 0;
        int height = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("나이 입력해보이소");
        age = scanner.nextInt();
        System.out.println("키도 입력해보쇼");
        height = scanner.nextInt();


        //조건문
        if (age >= 7) {
            System.out.println("규정 나이 7세 이상입니다.");   //실행문 1-1
            if (height >= 110) {
                System.out.println("롤러코스터 입장 기기");    //실행문1-a
            } else {
                System.out.println("키가 작군요 ㅋㅋ 다음에 오이소");      //실행문 1-b
            }
        } else {
            System.out.println("으차피 어린놈입니다.");
        }
    }

        //현재 age를 기준으로 중첩 if문이 작성되었는데, height를 기준으로 중첩 if문 작성하시오

//        if (height >= 110) {
//            System.out.println("규정 키 제한 이상입니다.");
//            if(age >=7) {
//                System.out.println("바로 입장가능합니다. 빨리 가이소");
//            } else {
//                System.out.println("어차피 어린놈이군요 시로로로로");
//            }
//        } else {
//            System.out.println("키가 작으신갑네 다음에 타이소");
//        }

//        다 한 분들은 논리연산자 써서 조건문 해보세요
//        if (age >= 7 && height >= 110) {
//            System.out.println("당신은 롤러코스터에 탈 자격이 있군요 빨리 오세요");
//        } else {        // 앞의 두 변수 중 하나라도 충족시키지 못하면 false임. 키가 잘못됐는지
//            // 나이가 잘못됐는지는 이런 방식으로는 알 수 없음
//            System.out.println("그 이유는 모르겠는데 나이가 어리거나 키가 작거나인가봅니다.");
//            System.out.println("롤러코스터 못탑니다.");
//        }

    }

