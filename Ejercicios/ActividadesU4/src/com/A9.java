package com;
import java.util.Scanner;
public class A9 {

	public static void main(String[] args) {
		System.out.println("Dime un número y te diré cuantos divisores tiene");
		System.out.println(DivisoresPrimos (543255986));
	}

	
	public static int DivisoresPrimos (int n) {
		for(int i = 2; i<n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		return n;	
	}
	
}

