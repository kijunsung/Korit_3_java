package ch12_arrays;

import java.util.Arrays;
import java.util.Random;

public class Array16LottoAnswer {
    public static void main(String[] args) {

        Random random = new Random();

        int[] lottoNumbers = new int[6];

        int round = 5;

        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = (int)(Math.random()*45) +1;
        }
        Arrays.sort(lottoNumbers);
        System.out.println(Arrays.toString(lottoNumbers));
    }
}
