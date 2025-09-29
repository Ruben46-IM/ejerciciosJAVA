package com;
import java.util.Scanner;
public class Actividad13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Te voy a calcular la media de cualquier asignatura, tan solo dame las notas ");
	System.out.println("Primera nota: ");
	double nota1 = sc.nextDouble();
	System.out.println("Segunda nota: ");
	double nota2 = sc.nextDouble();
	System.out.println("Tercera nota: ");
	double nota3 = sc.nextDouble();
	
	double media = (nota1 + nota2 + nota3) /3;
	System.out.println("Tu nota del boletín de calificaciones: " + Math.round(media));
	System.out.println("Tu nota del expediente académico es: " + media);

		

	}

}
