package br.com.urionlinejudge.problems.beginner;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author rsvieira
 * email - devrsvieira@gmail.com
 * @date 03/05/2021 11:06:38
 */

public class Problem1003 {
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			Double n = 3.14159;
			Double raio;
			Double A;
			
			raio = scanner.nextDouble();
			A = n * (raio * raio);

			DecimalFormat dec = new DecimalFormat("#0.0000");
			dec.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));

			System.out.println("A=" + dec.format(A));
		}
	}
}
