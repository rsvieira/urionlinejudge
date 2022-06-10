package br.com.urionlinejudge.problems.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author devrsvieira
 */
public class Problem1015 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double x1 = scanner.nextDouble();
        Double y1 = scanner.nextDouble();
        Double x2 = scanner.nextDouble();
        Double y2 = scanner.nextDouble();
        System.out.println(new DecimalFormat("#,####0.0000").format(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))));
    }
}
