package com;
import java.util.Scanner;
public class Actividad12 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Dime una fecha y te diré si exite o no");
System.out.println("Dime un día: ");
int dia = sc.nextInt();
System.out.println("Dime un mes: ");
int mes = sc.nextInt();
System.out.println("Dime un año: ");
int año= sc.nextInt();

		
		
		
	switch (mes) {
	
	
	case 1, 3, 5, 7, 8, 10, 12:
	if (dia > 0 && dia < 31){
		System.out.println("Existe el dia del mes");
	}else {
		System.out.println("No existe el dia del mes");
	}
	break;
	
	case 2:
		if (dia > 0 && dia < 28){
			System.out.println("Existe el dia del mes");
		}else {
			System.out.println("No existe el dia del mes");
		}
		break;
		
	case 4, 6, 9, 11:
		if (dia > 0 && dia < 30){
			System.out.println("Existe el dia del mes");
		}else {
			System.out.println("No existe el dia del mes");
		}
	break;
	
	}
	
	if (mes > 0 && mes < 12) {
		System.out.println("Existe el mes");
	} else {
		System.out.println("No existe el mes");
	}
	}
}
	
	
	
	
	
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	


