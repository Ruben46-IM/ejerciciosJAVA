package com;

public class Ejemplo {

	public static void main(String[] args) {
	int[] numeros = new int[5];
	numeros[0]= 0;
	numeros[1]= 1;
	numeros[2]= 3;
	numeros[3]= 4;
	numeros[4]= 10;
	
	System.out.println("El tamaño de la tabla es: " + numeros.length);	
	
	for(int i = 0; i < numeros.length; i++) {
		System.out.println(numeros[i]);
	}
	
	
	}

}
