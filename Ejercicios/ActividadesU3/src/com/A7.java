package com;

public class A7 {

	public static void main(String[] args) {
		
		long n = 1;

        for(int i=1; i<=20; i+=2){
            n *= i;
        }

        System.out.println("El producto es " + n);
    }


	}