package com;
import java.util.Scanner;
public class Actividad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mete el radio mi socio: ");
		float radio = sc.nextFloat();
		float longitud = 2.00F * 3.14F * radio; 
		System.out.println("La longitud es esta brother: " + longitud);
		float area = 3.14F * radio * radio;
		System.out.println("El radio es este, pan rallao: " + area);
	
	}

}
