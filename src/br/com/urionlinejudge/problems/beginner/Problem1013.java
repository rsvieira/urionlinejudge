package br.com.urionlinejudge.problems.beginner;

import java.util.Scanner;

/**
 * @author rsvieira
 * email - devrsvieira@gmail.com
 * @date 09/06/2022
 */
public class Problem1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorNumero = 0;
        for (int i = 0; i < 3; i++) {
            int n = scanner.nextInt();
            if(maiorNumero < n) maiorNumero = n;
        }
        System.out.println(maiorNumero + " eh o maior");
    }
}
