package com;

import java.util.Scanner;

public class A6 {
	char vocal = 'a';
	char consonante = 'P';
	
	public static void main(String[] args) {
		
		System.out.println(letraVocal('e'));
		System.out.println(letraVocal('h'));
		
	}

	
	

	public static boolean letraVocal (char caracter) {
		
	if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ) {
		return true;
	}
		
		return false;
	}
	
	
}
