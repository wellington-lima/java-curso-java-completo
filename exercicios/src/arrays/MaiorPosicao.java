package arrays;

import java.util.Locale;
import java.util.Scanner;

/*
Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior n�mero do vetor (supor n�o haver empates). Mostrar tamb�m a posi��o do maior elemento,
considerando a primeira posi��o como 0 (zero). 
*/
public class MaiorPosicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar: ");
		int totalNumbers = sc.nextInt();
		int[] numbers = new int[totalNumbers]; 
		
		
		for(int i = 0; i < totalNumbers; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextInt();
		}
		
		int[] bigNumber = {numbers[0], 0};
		int index = 0;
		
		for(int number : numbers) {
			if(number > bigNumber[0]) {
				bigNumber[0] = number;
				bigNumber[1] = index;
			}
			index++;
		}
		
		System.out.printf("\nMAIOR VALOR: %d", bigNumber[0]);
		System.out.printf("\nPOSICAO DO MAIOR VALOR: %d", bigNumber[1]);
		
		sc.close();
	}
}
