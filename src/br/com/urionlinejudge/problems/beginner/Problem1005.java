package br.com.urionlinejudge.problems.beginner;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author rsvieira
 * email - devrsvieira@gmail.com
 * @date 03/05/2021 13:55:47
 */

public class Problem1005 {
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			Double A;
			Double B;
			Double pesoA = 3.5;
			Double pesoB = 7.5;
  
			DecimalFormat dec = new DecimalFormat("#0.00000");
			dec.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
			
			A = scanner.nextDouble();
			B = scanner.nextDouble();
			
			System.out.println("MEDIA = " + dec.format(((A*pesoA) + (B*pesoB))/(pesoA+pesoB)));
		}
	}
}