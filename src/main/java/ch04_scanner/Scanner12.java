package ch04_scanner;

import java.util.Scanner;

public class Scanner12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요>>>");


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // 2중for내에 별의갯수
            }
            System.out.println();


        }

    }
}
