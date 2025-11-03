package com;
import java.util.Scanner;
public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" dime un número entre 1 y 9999 y te diré si es capicua");
		System.out.println("¿Numero? ");
		int numero = sc.nextInt();
		int unidades = numero % 10;
		int decenas = numero / 10;
		int centenas = numero / 100;
		int millares = numero / 1000;
		
		if (numero < 10) {
			System.out.println("No es capicua");
		}else if (numero < 100) {
			if (unidades == decenas) {
				System.out.println("Es capicua");
			}else {
				System.out.println("No es capicua");
			}
		}else if (numero < 1000) {
			if (unidades == centenas) {
				System.out.println("Es capicua");
			}else {
				System.out.println("No es capicua");
			}
		}else if (numero < 10000) {
			if (unidades == millares) {
				System.out.println("Es capicua");
			}else {
				System.out.println("No es capicua");
			}
		}
		
		
		
	
		
	}

}
