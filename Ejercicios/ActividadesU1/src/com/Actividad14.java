package com;
import java.util.Scanner;
public class Actividad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Te voy a redondear cualquier número, dime uno: ");
		float numero = sc.nextFloat();
		System.out.println("El número redondeado es: " + Math.round(numero));
		

	}

}
