package br.com.urionlinejudge.problems.beginner;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author rsvieira
 * email - devrsvieira@gmail.com
 * @date 03/05/2021 19:06:14
 */

public class Problem1006 {
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			Double A;
			Double B;
			Double C;
			Double pesoA = 2.0;
			Double pesoB = 3.0;
			Double pesoC = 5.0;
  
			DecimalFormat dec = new DecimalFormat("#0.0");
			dec.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
			
			A = scanner.nextDouble();
			B = scanner.nextDouble();
			C = scanner.nextDouble();
			
			System.out.println("MEDIA = " + dec.format(((A*pesoA) + (B*pesoB) + (C*pesoC))/(pesoA+pesoB+pesoC)));
		}
	}
}