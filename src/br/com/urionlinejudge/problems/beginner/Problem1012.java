package br.com.urionlinejudge.problems.beginner;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author rsvieira
 * email - devrsvieira@gmail.com
 * @date 06/05/2021 19:33:40
 */

public class Problem1012 {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			String linha1 = scanner.nextLine();
			
			String[] values1 = linha1.split(" ");
			
			Double A = Double.parseDouble(values1[0]);
			Double B = Double.parseDouble(values1[1]);
			Double C = Double.parseDouble(values1[2]);
			
			DecimalFormat dec = new DecimalFormat("#0.000");
			DecimalFormat dec2 = new DecimalFormat("#0.00000");
			dec.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
			dec2.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
					
			Double triangulo = A * C / 2.0;
			Double circulo = Double.valueOf(dec2.format(Math.PI)) * Math.pow(C, 2);
			Double trapezio = (C * (A + B)) / 2.0;
			Double quadrado = Math.pow(B, 2);
			Double retangulo = A * B;
			
			System.out.println("TRIANGULO : " + dec.format(triangulo));
			System.out.println("CIRCULO : " + dec.format(circulo));
			System.out.println("TRAPEZIO : " + dec.format(trapezio));
			System.out.println("QUADRADO : " + dec.format(quadrado));
			System.out.println("RETANGULO : " + dec.format(retangulo));
			
		}
	}
}