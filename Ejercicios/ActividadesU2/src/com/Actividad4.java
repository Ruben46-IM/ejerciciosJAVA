package com;
import java.util.Scanner;
public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mete dos número y te diré cual es mayor, dime el primero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Ahora el segundo: ");
		int numero2 =sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("El numero " + numero1 + " es mayor ");
		
		} else if (numero1 == numero2) {
		
		System.out.println("Son iguales, CIEGO ");
		
		} else {
			
		System.out.println("El numero " + numero2 + " es mayor ");
			
			
		
		
		}	
		
		}
		
	
}



