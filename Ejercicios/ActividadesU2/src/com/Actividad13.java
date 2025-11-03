package com;
import java.util.Scanner;
public class Actividad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Dime la hora y te la adelantaré 1 segundo");
	System.out.println("¿Segundos?");
	int segundo = sc.nextInt();
	System.out.println("¿Minutos?");
	int minuto = sc.nextInt();
	System.out.println("¿Horas?");
	int hora = sc.nextInt();
	
	
		if (hora >= 24 || minuto >= 60 || segundo >= 60) {
		System.err.println("La hora no existe");	
		}else {
			segundo++;
			if (segundo == 60) {
				minuto ++;
				segundo = 0;
				if (minuto == 60) {
					hora ++;
					segundo = 0;
					minuto = 0;
					if (hora == 24) {
						hora = 0;
						minuto = 0;
						segundo = 0;
					
					
				}
			}
			
			}
			
			
		} 

		
		if (hora < 10 && minuto < 10 && segundo < 10) {
			System.out.println("La hora es: 0" + hora + ":0" + minuto + ":0" + segundo);
		} else if (hora < 10 && minuto < 10) {
				System.out.println("La hora es: 0" + hora + ":0" + minuto + ":" + segundo);
			} else if (hora < 10) {
				System.out.println("La hora es: 0" + hora + ":" + minuto + ":" + segundo);
	}
		
		
		
		
		
		

	}

}

