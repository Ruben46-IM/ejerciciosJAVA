package com;
import java.util.Scanner;
public class A11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Te haré todas las tablas desde el 1 hasta el 10");
		int num1, num2, result = 0;
		
		num1=1;
		num2=1;
		
		while(num2 <= 10) {
			result = num1 * num2;
		}
		System.out.println(num1 + "x" + num2 + " = " + result);
		
		if(num1 < 10) {
			num1++;
		}else {
			num1=1;
			num2++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
