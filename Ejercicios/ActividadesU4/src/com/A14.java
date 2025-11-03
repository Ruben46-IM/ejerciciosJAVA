package com;

import java.util.Scanner;

public class A14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número y te haré su serie de fibonacci");
		int n = sc.nextInt();
		int resultado = Fibonacci(n);
		System.out.println(resultado);
	}
	public static int Fibonacci (int n) {
		if (n == 0) {
			return 1;
		}else if (n == 1) {
			return 1;
		} else {
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	}
	
	
}
