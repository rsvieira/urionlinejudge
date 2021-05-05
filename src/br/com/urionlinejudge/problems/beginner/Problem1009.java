package br.com.urionlinejudge.problems.beginner;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author rsvieira
 * email - devrsvieira@gmail.com
 * @date 04/05/2021 22:13:11
 */

public class Problem1009 {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String nome;
			Double salario;
			Double vendas;
			
			nome = scanner.next();
			salario = scanner.nextDouble();
			vendas = scanner.nextDouble();
			
			Double total = salario + (vendas * 0.15);
					
			DecimalFormat dec = new DecimalFormat("#0.00");
			dec.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
			
			System.out.println("TOTAL = R$ " + dec.format(total));
		}
	}
}