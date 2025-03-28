package ch12_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    1차 배열을 기준으로
    1 ~ 45까지의 임의의 숫자를 대입

    목표는 1차 배열 내에 6개의 임의의 int값을 집어넣는 것
    근데, 중복이 있으면 안됨. -> 같이 수업

    그래서 복습을 한다고 가정하고 1 ~45까지의 숫자를
    여섯개짜리의 빈 배열에 집어넣는 것부터 시작

    lottonumbers에 1 ~45까지의 숫자 중 6개를 뽑아 대입하는 반복문 작성
        -> 1차 배열 하나가 완성됩니다.

        그 1차 배열이 10번 반복되게끔 반복문 작성
        -> 그럼 전체적으로 2중 for문이 됩니다.(혹시 while문으로 작성하고싶다면
        상관x)
 */
public class Array15LottoGame {
    public static void main(String[] args) {
        //객체 생성
        Random random = new Random();
        //생각할 점
        // Math.random()을 사용해서 1 ~45까지의 범위를 만들려면 어떡해야할까
        //1 ~ 45
        //(Math.random()*45) + 1; -> 6번 대입되겠습니다.
        //빈 배열 선언
        int[] lottoNumbers = new int[6];
        //게임 횟수
        int round = 5;      //얘를 이용하여 게임 횟수를 5번 반복하시오.
        int temp = 0;       //자주쓰는 변수명이므로 temporary의 축약어
        boolean duplicate;  //중복이 되었을 때 true로 바꿔서 조건문을 실행시킬 예정(재대입을 위해)

        for (int j =0; j < round; j++) {
            for (int i =0; j < lottoNumbers.length; i++){
                duplicate = true;
            }
        }

//        if (!duplicate){//duplicate가 false라면 !duplicate가 true이므로 중복이
//            lottoNumbers[i] = temp;
//        } else {
//            //대입이 아니라 다시 뽑아야 함.
//            i--;
//            //i = 3일때 예를 들어서 얘가 실행이 됐다면
//            //i = 2로 바뀌게 됩니다.
//        }
//        //여기까지 내려와서 for(int i)파트의 반복문이 끝이 나게 되면
//        //
    }


}