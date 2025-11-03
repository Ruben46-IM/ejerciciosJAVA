package com;
import java.util.Scanner;
public class A9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura, etiqueta = 0, maxalt=0, arbolmasalto=0;
		
		do {
			System.out.println("Introduzca la altura del arbol: " + etiqueta);
			altura = sc.nextInt();
			if(altura > maxalt) {
				maxalt=altura;
				arbolmasalto = etiqueta;
			}
			etiqueta++;
		}while(altura != -1);
		
		System.out.println("El arbol masl alto es el " + arbolmasalto);
		System.out.println("Con la altura " + maxalt);
		
		
		
		
		
		
		
		
	}

}
