package com;
import java.util.Scanner;
public class A12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Dime dos numeros y los sumo, resto, multiplico y divido \nDime el primero:");
	int n1 = sc.nextInt();
	System.out.println("Dime el segundo:");
	int n2 = sc.nextInt();
	System.out.println("Que quieres hacer \n1 sumar \n2 restar \n3 multiplicar \n4 Dividir");
	int respuesta = 0;
	calculo(n1,n2,respuesta);
	
	}

	public static double calculo (int n1, int n2, int operacion) {
	Scanner sc = new Scanner(System.in);
	int respuesta = sc.nextInt();
	if (respuesta == 1) {
		int suma = n1 + n2;
		System.out.println(suma);
	}else if (respuesta == 2) {
		int resta = n1 - n2;
		System.out.println(resta);
	}else if (respuesta == 3) {
		int mult = n1 * n2;
		System.out.println(mult);
	}else if (respuesta == 4) {
		double div = n1 / n2;
		System.out.println(div);
	} else {
		System.out.println("Esa opción no está");
	}
	return respuesta;
		
		
		
}
	
}

