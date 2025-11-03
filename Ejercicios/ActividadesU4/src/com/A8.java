package com;

public class A8 {

	public static void main(String[] args) {
		System.out.println("Dime un número y te diré cuantos divisores tiene");
		System.out.println("Tiene: " + Divisores(14) + " divisores primos");
	}

	
	
	
	
	public static int Divisores (int n) {
		int contador = 0;
		
		for(int i= 2; i<n; i++) {
			if (n % i == 0) {
				contador++;
			}
		}
		return contador;
		
		
		
	}
}
