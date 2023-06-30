package arrays;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha
 * */

public class MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int total = sc.nextInt();
		String[] nomes = new String[total];
		int[] idades = new int[total];
		int idadeMaisVelho = 0;
		String nomeMaisVelho = "";
		
		for(int i = 0; i < total; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			if(idades[i] > idadeMaisVelho ) {
				idadeMaisVelho = idades[i];
				nomeMaisVelho = nomes[i];
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelho);
		sc.close();
	}
	
}
