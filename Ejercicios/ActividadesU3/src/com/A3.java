package com;
import java.util.Scanner;
import java.util.Random;
public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		
		int numerosecreto = random.nextInt(100)+1;
		int intento=0;
		
		System.out.println("Adivina el numero entre 1 y 100 ");
		System.out.println("Introduce -1 para rendirte");
		
		while(true) {
			System.out.println("Escribe un número: ");
			intento = sc.nextInt();
			
			if(intento == -1) {
				System.out.println("no hombre no, el que no apuesta no gana");
				break;
			}
			
			if(intento == numerosecreto) {
				System.out.println("Eso es, has acertado");
				break;
			}else if(intento > numerosecreto) {
				System.out.println("Es menor");
			}else if(intento < numerosecreto) {
				System.out.println("Es mayor");
			}
			
			
			
			
			
		}
		
		
		
		

	}

}
