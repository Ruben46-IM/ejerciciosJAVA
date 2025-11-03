package com;
import java.util.Scanner;
public class A14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número: ");
		int n = sc.nextInt();
		
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.println("* ");
			}
			System.out.println("");
		}
		sc.close();
		
		
		
		
		
	}

}
