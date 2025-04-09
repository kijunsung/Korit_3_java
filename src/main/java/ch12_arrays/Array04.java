package ch12_arrays;

import java.util.Scanner;

public class Array04 {

    public void writeNames(String[] names) {
        Scanner scanner =new Scanner(System.in);
        for (int i =0; i < names.length; i++) {
            System.out.println((i + 1)+"번 째 학생");
            names[i] = scanner.nextLine();
        }

    }

    public void printNames(String[] names) {
        for (int i =0; i < names.length; i++) {
                System.out.println(names[i]+" ");
            }
        }

    public static void main(String[] args) {
        //입력값을 받기 위한 Scanner import
        Scanner scanner =new Scanner(System.in);
        //메소드 사용을 위한 객체 생성
        Array04 array04 = new Array04();
        //인덱스 넘버를 확정
        System.out.println("몇 명의 학생을 입력하시겠습니까? >>>");
        int indexNum = scanner.nextInt();
        scanner.nextLine(); //배리어 역할
        //비어있는 배열을 선언
        String[] names = new String[indexNum];

        array04.writeNames(names);
        array04.printNames(names);

    }
}
