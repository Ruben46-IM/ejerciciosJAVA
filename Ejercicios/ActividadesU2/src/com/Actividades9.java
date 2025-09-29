package com;
import java.util.Scanner;
public class Actividades9 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("dime un número y te diré cuantas cifras tiene (solo entre 0 y 99.999)");
int numero = sc.nextInt();

if (numero < 0 || numero > 99999 ) {
	
	System.out.println("No socio, te has pasado");
} else {
	
	if (numero > 0 && numero < 9) {
		
		System.out.println("tiene 1 cifra");
	}
	
if (numero > 10 && numero < 99) {
		
		System.out.println("tiene 2 cifra");
		
}
		
if (numero > 100 && numero < 999) {
	
	System.out.println("tiene 3 cifra");

}

if (numero > 1000 && numero < 9999) {
	
	System.out.println("tiene 4 cifra");

}
if (numero > 10000 && numero < 99999) {
	
	System.out.println("tiene 5 cifra");
}












}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
