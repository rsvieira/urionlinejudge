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

public class Problem1008 {
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			int funcionario;
			int horasTrabalhadas;
			Double valorHora;
			
			funcionario = scanner.nextInt();
			horasTrabalhadas = scanner.nextInt();
			valorHora = scanner.nextDouble();
			
			Double salario = (horasTrabalhadas * valorHora);
					
			DecimalFormat dec = new DecimalFormat("#0.00");
			dec.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
			
			System.out.println("NUMBER = " + funcionario);
			System.out.println("SALARY = U$ " + dec.format(salario));
		}
	}
}