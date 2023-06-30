package arrays;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares
 */

public class NumerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int totalNumbers;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		totalNumbers = sc.nextInt();
		int[] numbers = new int[totalNumbers];
		int totalEven = 0;
				
		for (int i = 0; i < totalNumbers; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES:");
		
		for (int number: numbers) {
			if(number % 2 == 0) {
				totalEven++;
				System.out.print(number + " ");
			}
		}
		
		System.out.printf("\nQUANTIDADE DE PARES = %d\n", totalEven);
		
		
		sc.close();
	}
	
	
}
