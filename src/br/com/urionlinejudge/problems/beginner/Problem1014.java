package br.com.urionlinejudge.problems.beginner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @author devrsvieira
 * @date 09/06/2022
 * @email devrsvieira@gmail.com
 */
public class Problem1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal distancia = BigDecimal.valueOf(scanner.nextInt());
        BigDecimal litros = BigDecimal.valueOf(scanner.nextDouble());
        System.out.println(distancia.divide(litros, 3,RoundingMode.UP) + " km/l");
    }
}
