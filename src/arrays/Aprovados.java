package arrays;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis). 
*/

public class Aprovados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int total = sc.nextInt();
		String[] nomes = new String[total];
		double[] nota1 = new double[total];
		double[] nota2 = new double[total];
		
		for(int i = 0; i < total; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();			
		}
		
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < nomes.length; i++) {
			if((nota1[i] + nota2[i]) / 2 >= 6 ) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}
}
