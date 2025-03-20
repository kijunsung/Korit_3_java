package org.example;
import java.util.Scanner;

public class BmiCalcMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double BMI = 0;

        System.out.print("키를 입력하세요 >>>");
        double height = scanner.nextInt();
        System.out.print("몸무게를 입력하세요 >>>");
        double weight = scanner.nextInt();

        height = height /100;
        BMI = weight  / (height*height);

        if(BMI < 18.5) {
            System.out.println("니 BMI지수는 이며"+ BMI  + "닌 저체중이요");
        } else if (BMI < 23) {
            System.out.println("니 BMI지수는 "+ BMI  + "닌 정상이요");
        } else if (BMI < 25) {
            System.out.println("닌 과체중이요");
        } else if (BMI >= 25 ) {
            System.out.println("닌 비만이요");
        }

    }
}