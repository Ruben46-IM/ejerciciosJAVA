package com;
import java.util.Scanner;
public class Actividad11 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Dime tú nota ");
int nota = sc.nextInt();

if (nota >= 0 && nota <= 4) {
	System.out.println("Brother me daría vergüenza, insuficiente");
}

if (nota >= 5 && nota <= 6) {
	System.out.println("Bueno, no está mal, suficiente");

}
		
if (nota >= 7 && nota <= 8) {
	System.out.println("Ahora tú me entiendes, notable");

}		
		
if (nota >= 9 && nota <= 10) {
	System.out.println("Eres un máquina y un cerebrito, sobresaliente");

}


}
	
	
	
}