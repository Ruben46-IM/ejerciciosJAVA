package com;
import java.util.Scanner;
public class Actividad8 {

	public static void main(String[] args) {
		System.out.println("Brother dime tu edad");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		
		boolean mayor;
		mayor = edad >= 18;
		System.out.println("Es mayor " + mayor);
		
		boolean menor;
		menor = edad < 18;
		System.out.println("Es menor " + menor);
	}

}
