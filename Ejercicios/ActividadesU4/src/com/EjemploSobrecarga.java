package com;

public class EjemploSobrecarga {

	public static void main(String[] args) {
		/*

		
		*/
		
	
		
		for(int i=0; i<5; i++) {
			mostrar("Viva el Málaga");
		}
		
		
	}
	
	public static void mostrar (String mensaje) {
		
		System.out.println(mensaje);
	
	}
	
	public static void mostrar (int numero) {
		System.out.println(numero);
	}
	
	public static void mostar (String texto, int veces) {
		
	}

}
