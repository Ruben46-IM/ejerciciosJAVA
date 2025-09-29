package com;
import java.util.Scanner;
public class Actividad10 {

	public static void main(String[] args) {
		System.out.println("Todas a las preguntas se deben responder con true o false ");
		Scanner sc = new Scanner(System.in);
		Boolean llover, tarea, biblioteca, salir;
		
		System.out.println("¿Está lloviendo? ");
		llover = sc.nextBoolean();
		
		
		System.out.println("¿Has terminado la tarea? ");
		tarea = sc.nextBoolean();
		
		
		System.out.println("¿Vas a la biblioteca? ");
		biblioteca = sc.nextBoolean();
		
		
		salir = (!llover && tarea) || (biblioteca);
		System.out.println("¿Podrá salir? " + salir);
		
	}

}
