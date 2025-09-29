package com;
import java.util.Scanner;
public class Actividad4 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su año de nacimiento: ");
		int anno = sc.nextInt();
		System.out.println("Introduzca el año actual: ");
		int annoActual = sc.nextInt();
		int edadUsuario = annoActual - anno;
		System.out.println("Usted tiene " + edadUsuario + "años");

	}

}
