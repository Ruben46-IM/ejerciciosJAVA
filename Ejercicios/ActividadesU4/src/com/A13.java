package com;

import java.util.Scanner;

public class A13 {

	public static void main(String[] args) {
		System.out.println("Dime un número y te diré su valor factorial");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		factorial(n1);
	}

	public static void factorial (int n1) {
		long operacion = 1;
		for (long i = n1; i > 0; i--) {
			operacion *=i;
		}
		System.out.println("El resultado es " + operacion);
	}
}
