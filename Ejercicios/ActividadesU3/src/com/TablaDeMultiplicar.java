package com;
import java.util.Scanner;
public class TablaDeMultiplicar {

	public static void main(String[] args) {
		System.out.println("Dime un numero y te mostraré su tabla de multiplicar");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(numero + "x" + i + "=" + numero * i);
			
		}

	}

}
