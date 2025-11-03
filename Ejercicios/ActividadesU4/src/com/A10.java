package com;
import java.util.Scanner;
public class A10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime dos numeros y te diré si son amigos \nDime el primero:");
			int n1 = sc.nextInt();
		System.out.println("Dime el segundo:");
			int n2 = sc.nextInt();
			amigo(n1,n2);
	}
	
	public static void amigo (int n1, int n2) {
		int total1 = 0;
		for(int i = 1; i < n1; i++) {
			if(n1 % i ==0) {
				total1 += i;
			}	
		}
		int total2 = 0;
		for(int j = 1; j < n2;j++) {
			if(n2 % j ==0) {
				total2 += j;
		}
	}
	if(total1 == n2 && total2 == n1) {
		System.out.println("Son amigos");
	}else {
		System.out.println("No son amigos");
	}
	
	
}
}
