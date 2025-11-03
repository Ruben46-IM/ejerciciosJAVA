package com;

public class A5 {

	public static void main(String[] args) {
		System.out.println("El mayor es: " + NumMayor(1,8,3));
		
	}

	public static int NumMayor(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		}else if (b >= a && b > c) {
			return b;
		}else {
			return c;
		}
		
		
		
		
	}
	
	
	
	
	
	
}
