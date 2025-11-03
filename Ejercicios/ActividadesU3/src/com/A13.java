package com;
import java.util.Scanner;
public class A13 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		System.out.println("Dime 6 notas y te diré la cantidad de \nalumnos aprobados, condicionados y suspensos");
		
		int notas = 0, aprobados = 0, condicionados = 0, suspensos = 0;
		
		
	
		for ( int n = 0; n<6; n++) {
			System.out.println("Dime otra ");
			notas = sc.nextInt();
			
			if (notas >= 5) {
				aprobados++;
				
			}else if (notas == 4) {
				condicionados++;
			}else {
				suspensos++;
			}
			
		}
		
		
		System.out.println("Aprobados: " + aprobados);
		System.out.println("Suspensos: " + suspensos);
		System.out.println("Condicionados: " + condicionados);
		
		
		
		
		
		
		
		

	}

}
