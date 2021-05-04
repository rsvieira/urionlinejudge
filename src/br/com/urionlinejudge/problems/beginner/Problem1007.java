package br.com.urionlinejudge.problems.beginner;

import java.util.Scanner;

/**
 * @author rsvieira
 * email - devrsvieira@gmail.com
 * @date 03/05/2021 21:26:56
 */

public class Problem1007 {
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			int A;
			int B;
			int C;
			int D;
			
			A = scanner.nextInt();
			B = scanner.nextInt();
			C = scanner.nextInt();
			D = scanner.nextInt();
			
			System.out.println("DIFERENCA = " + (A * B - C * D));
		}
	}
}