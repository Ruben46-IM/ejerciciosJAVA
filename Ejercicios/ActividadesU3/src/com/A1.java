package com;
import java.util.Scanner;
public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número y te diré si es par, si es positivo y su cuadrado");
		long numero = sc.nextLong();

		do {
			
			if(numero %2 == 0) {
				System.out.println("Es par");
			}else {
				System.out.println("Es impar");	
			}
				if(numero >= 0) {
					System.out.println("Es positivo");
				}else {
					System.out.println("Es negativo");
				
				}
			
				long numeroU = numero * numero;
				System.out.println("El resultado es: " + numeroU);
				numeroU = sc.nextLong();
		}while(numero!= 0);
		
		}
	
	}


