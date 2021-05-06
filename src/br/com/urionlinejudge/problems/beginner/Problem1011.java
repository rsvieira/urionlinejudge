package br.com.urionlinejudge.problems.beginner;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author rsvieira
 * email - devrsvieira@gmail.com
 * @date 05/05/2021 22:05:55
 */

public class Problem1011 {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Double raio = scanner.nextDouble();
			
			DecimalFormat dec = new DecimalFormat("#0.000");
			DecimalFormat dec2 = new DecimalFormat("#0.00000");
			dec.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
			dec2.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
					
			Double volume = (4/3.0) * Double.valueOf(dec2.format(Math.PI)) * Math.pow(raio, 3);
			
			System.out.println("VOLUME = " + dec.format(volume));
		}
	}
}