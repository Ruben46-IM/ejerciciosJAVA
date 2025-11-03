package com;
import java.util.Scanner;
public class A8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime un número y te diré su valor factorial");
		long n = sc.nextInt();
		long op = 1;
		for (long i = n; i > 0; i--) {
			op *=i;
		}
		
		System.out.println("El resultado es " + op);
		
	}

}
