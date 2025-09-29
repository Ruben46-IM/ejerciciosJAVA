package com;
import java.util.Scanner;
public class Actividad6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca su primera nota: ");
	int nota = sc.nextInt();
	System.out.println("Introduzca su segunda nota: ");
	int nota2 = sc.nextInt();
	double nota3 = (nota + nota2) /2.0;
	System.out.println("Su media es: " + nota3);
	
	
	
	
	}

}
