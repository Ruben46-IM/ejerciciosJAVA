package com;
import java.util.Scanner;
public class A2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int edad, alumno, mediaedad, mayoredad, sumaedad;

alumno=0;
mayoredad=0; 
mediaedad=0;
sumaedad=0;

do {
	System.out.println("Dime la edad del alumno");
	edad = sc.nextInt();
	if(edad>=0){
		alumno++;
		sumaedad = sumaedad + edad;
		mediaedad = sumaedad / alumno;
	}
	
	if(edad>18) {
		mayoredad++;
		
	}
	
	
}while(edad>=0);
		
	System.out.println("La suma de edades es:" + sumaedad);	
	System.out.println("La media de edades es:" + mediaedad);	
	System.out.println("La total de alumnos es:" + alumno);	
	System.out.println("Los alumnos de mayor edad:" + mayoredad);	
		
		

	}

}
