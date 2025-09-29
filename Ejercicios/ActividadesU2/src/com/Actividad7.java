package com;
import java.util.Scanner;
public class Actividad7 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Dime tres números y te los ordenaré de mayor a menor, dime el primero: ");
int numero1 = sc.nextInt();
System.out.println("Dime el segundo: ");
int numero2 = sc.nextInt();
System.out.println("Dime el tercero: ");
int numero3 = sc.nextInt();

if (numero1 > numero2 && numero2 < numero3 && numero1 > numero3) {
System.out.println("Ordenado queda así: " + numero1 + " "  + numero3 + " " + numero2 );

}	

if (numero1 < numero2 && numero2 < numero3 && numero1 < numero3) {
	System.out.println("Ordenado queda así: " + numero3 + " "  + numero2 + " " + numero1 );

}	

if (numero1 < numero2 && numero2 > numero3 && numero1 > numero3) {
	System.out.println("Ordenado queda así: " + numero2 + " "  + numero1 + " " + numero3 );

}		
	
if (numero1 > numero2 && numero2 > numero3 && numero1 > numero3) {
	System.out.println("Ordenado queda así: " + numero1 + " "  + numero2 + " " + numero3 );

}


if (numero1 < numero2 && numero2 > numero3 && numero1 < numero3) {
	System.out.println("Ordenado queda así: " + numero2 + " "  + numero3 + " " + numero1 );
	

}

if (numero1 > numero2 && numero2 < numero3 && numero1 < numero3) {
	System.out.println("Ordenado queda así: " + numero3 + " "  + numero1 + " " + numero2 );


}







}
}
