package com;
import java.util.Scanner;
public class Actividad11 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Cuantas peras has vendido el primer semestre");
	int peras1 = sc.nextInt();
	System.out.println("Cuantas manzanas has vendido el primer semestre");
	int manzanas1 = sc.nextInt();
	System.out.println("Cuantas peras has vendido el segundo semestre");
	int peras2 = sc.nextInt();
	System.out.println("Cuantas manzanas has vendido el segundo semestre");
	int manzanas2 = sc.nextInt();
	
	final double peraskg€ = 1.95;
	final double manzanaskg€ = 2.35;
	
	System.out.println("Has ganado en peras " + (peras1 + peras2) * (peraskg€));
	
	System.out.println("Has ganado en manzanas " + (manzanas1 + manzanas2) * (manzanaskg€));
	
	
	final double total = ((peras1 + peras2) * (peraskg€)) + ((manzanas1 + manzanas2) * (manzanaskg€));
	System.out.println("En total: " + total);
	



	}

}
