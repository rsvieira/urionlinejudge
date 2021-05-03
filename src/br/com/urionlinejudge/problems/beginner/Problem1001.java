package br.com.urionlinejudge.problems.beginner;

import java.util.Scanner;

/**
 * @author rsvieira
 * email - devrsvieira@gmail.com
 * @date 02/05/2021 23:55:47
 */

public class Problem1001 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int A;
			int B;
			int X;
			
			A = scanner.nextInt();
			B = scanner.nextInt();
			X = A + B;
			System.out.println("X = " + X);
		}
	}
}
