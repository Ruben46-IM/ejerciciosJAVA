package com;
import java.util.Scanner;
public class A5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un valor minimo y máximo y te diré si tú número está dentro de ese rango");
		System.out.println("Dime el mínimo");
		int min = sc.nextInt();
		System.out.println("Dime el máximo");
		int max = sc.nextInt();
		int num = sc.nextInt();
		
		while(min > num || max < num) {
			System.out.println("No está dentro del rango");
			num = sc.nextInt();
		}
		
		System.out.println("Está dentro del rango");
		
		
		
		
		
		
		
		
	}

}
