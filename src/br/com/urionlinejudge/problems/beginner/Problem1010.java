package br.com.urionlinejudge.problems.beginner;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author rsvieira
 * email - devrsvieira@gmail.com
 * @date 04/05/2021 23:13:22
 */

public class Problem1010 {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int codPeca1;
			int quantidade1;
			Double valorUnitario1;
			
			int codPeca2;
			int quantidade2;
			Double valorUnitario2;
			
			String linha1 = scanner.nextLine();
			
			String[] values1 = linha1.split(" ");
			
			codPeca1 = Integer.parseInt(values1[0]);
			quantidade1 = Integer.parseInt(values1[1]);
			valorUnitario1 = Double.parseDouble(values1[2]);
			
			String linha2 = scanner.nextLine();
			
			String[] values2 = linha2.split(" ");
			
			codPeca2 = Integer.parseInt(values2[0]);
			quantidade2 = Integer.parseInt(values2[1]);
			valorUnitario2 = Double.parseDouble(values2[2]);
			
			Double total = (quantidade1 * valorUnitario1) + (quantidade2 * valorUnitario2);
					
			DecimalFormat dec = new DecimalFormat("#0.00");
			dec.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
			
			System.out.println("VALOR A PAGAR: R$ " + dec.format(total));
		}
	}
}