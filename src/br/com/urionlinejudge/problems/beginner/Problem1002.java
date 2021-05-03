package br.com.urionlinejudge.problems.beginner;

import java.util.Scanner;

/**
 * @author rsvieira
 * email - devrsvieira@gmail.com
 * @date 03/05/2021 11:38:25
 */

public class Problem1002 {
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			int A; 
			int B;
			
			A = scanner.nextInt();
			B = scanner.nextInt();

			System.out.println("SOMA = " + (A + B));
		}
	}
}
