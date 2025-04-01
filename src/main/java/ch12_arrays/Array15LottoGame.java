package ch12_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
    1차 배열을 기준으로
    1 ~ 45까지의 임의의 숫자를 뽑아 배열에 대입

    목표는 1차 배열 내에 6개의 임의의 int값을 집어넣는 것
    근데, 중복이 있으면 안됨. -> 저랑 같이 수업

    그래서 복습을 한다고 가정하고 1 ~ 45까지의 숫자를
    여섯개짜리의 빈 배열에 집어넣는 것부터 시작하겠습니다.

    lottoNumbers에 1 ~ 45까지의 숫자 중 6개를 뽑아 대입하는 반복문 작성
    -> 1차 배열 하나가 완성됩니다.

    그 1차 배열이 10번 반복되게끔 반복문 작성
    -> 그럼 전체적으로 2중 for문이 됩니다.(혹시 while문으로 작성하고싶다면
    그래도 됩니다)
 */
public class Array15LottoGame {
    public static void main(String[] args) {
        // 게임 횟수
        Scanner scanner = new Scanner(System.in);
        System.out.print("게임 횟수를 입력하세요 :");
        int round = scanner.nextInt();
        // 객체 생성
        Random random = new Random();
        // 생각해봐야할 점
//        Math.random()을 사용해서 1 ~ 45까지의 범위를 만들려면 어떡해야할까
        // 1 ~ 45
        // (Math.random()*45) + 1; -> 6번 대입되겠습니다.
        // 빈 배열 선언
        int[] lottoNumbers = new int[6];

        // 게임 횟수를 반복하기 위한 반복문 작성
        for (int j = 0 ; j < round ; j++ ) {
            // 배열에 난수를 대입하기 위한 for 문 작성
            for (int i = 0 ; i < lottoNumbers.length ; i++) {
                lottoNumbers[i] = (int)(Math.random()*45) + 1;
            }
//            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
        }


    }
}