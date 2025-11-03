package com;
import java.util.Scanner;
public class A10 {

	public static void main(String[] args) {
		System.out.println("Dime un numero entre 1 y 10, y te mostraré su tabla de multiplicar");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 1 || num >10) {
			System.out.println("El numero no está entre 1 y 10");
		}else {
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + "=" + num * i);
		}
	}

}
}
