package com;
import java.util.Scanner;
public class Actividad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("Te puedo hacer una ecuación de segundo grado ");
System.out.println("dime la a: ");
int a = sc.nextInt();
System.out.println("dime la b: ");
int b = sc.nextInt();
System.out.println("dime la c: ");
int c = sc.nextInt();

double raiz = (Math.sqrt(b * b) - 4 * a *c);
if (b * b - (4 * a *c) < 0){
	System.out.println(" No hay solución");
}

double x1 = ((-b + raiz) / 2 *a);

double x2 = ((-b - raiz) / 2 *a);


System.out.println("Las soluciones son: " + x1 + " y " + x2);



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
