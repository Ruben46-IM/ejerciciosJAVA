package com;
import java.util.Scanner;
public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué quieres calcular el area o el volumen de un cilindro?");
		
		double r, h;
		int opción;
		System.out.println("Dime el radio");
		r = sc.nextDouble();
		System.out.println("Dime la altura");
		h = sc.nextDouble();
		System.out.println("Que prefieres Area o Volumen?");
		opción = sc.nextInt();
		
		calculoC (r, h, opción);
		
	}
		
		
		public static double calculoC (double r, double h, int opción) {
	
			switch (opción) {
			case 1:
				double Area = 2 * Math.PI * r * (h + r);
				System.out.println("El area es: " + Area);
				break;
			case 2:
				double Volumen = Math.PI * (r * r) * h;
				System.out.println("El volumen es: " + Volumen);
				break;
			default:
				System.out.println("No se ha selecconado la opción correcta");
			}
			return opción;
			
		
			
	
		}

	}


