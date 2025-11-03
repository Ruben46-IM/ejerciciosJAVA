package com;
import java.util.Scanner;
public class TablaDeMultiplicarWhile {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime un número y te pondré su tabla de multiplicar");
	int numero = sc.nextInt();
	int res, i = 0;
	while(i <= 10) {
		res = numero * i;
		System.out.println(numero + "x" + i + " = " + res);
		i = i+1;
	}
	

}
}