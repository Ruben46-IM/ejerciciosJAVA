package com;

public class A7 {

	public static void main(String[] args) {
		System.out.println(Esprimo(7));
	}

	public static boolean Esprimo (int n) {
		
	for(int i = n-1; i>1; i--) {
		if (n % i == 0) {
			return false;
		}
	}
		return true;
		

	}
	
	
	
	
}
