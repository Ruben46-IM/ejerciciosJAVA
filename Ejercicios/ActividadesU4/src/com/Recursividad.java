package com;
import java.util.Scanner;
public class Recursividad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		factorial(n);
		System.out.println(factorial (n));
	
	}
	
	public static int factorial (long n) {
		if (n == 0) {
			return 1;
	} else {
			return (int) (n * factorial (n - 1));
	}
	
}
}