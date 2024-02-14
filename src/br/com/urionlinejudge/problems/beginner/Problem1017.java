package br.com.urionlinejudge.problems.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author devrsvieira
 * @email devrsvieira@gmail.com
 * @date 10/06/22
 */

public class Problem1017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double horas = (double) scanner.nextInt();
        Double distancia = (double) scanner.nextInt();
        System.out.println(new DecimalFormat("#,###0.000").format(Double.valueOf((horas * distancia) / 12)));
    }
}