package br.com.urionlinejudge.problems.beginner;

import java.util.Scanner;

/**
 * @author rsvieira
 * email - devrsvieira@gmail.com
 * @date 03/05/2021 12:02:35
 */

public class Problem1004 {
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			int a;
			int b;

			a = scanner.nextInt();
			b = scanner.nextInt();
			
			System.out.println("PROD = " + (a*b));
		}
	}
}
