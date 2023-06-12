package arrays;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int total = sc.nextInt();
		double[] alturas = new double[total];
		char[] generos = new char[total];
		int totalMulheres = 0;
		int totalHomens = 0;
		double somaAlturaMulheres = 0;
		double mediaAlturaMulheres = 0;
		
		for(int i = 0; i < total; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			alturas[i] = sc.nextDouble();
			
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			generos[i] = sc.next().charAt(0);
		}
		
		//Menor e maior altura
		double menorAltura = alturas[0];
		double maiorAltura = alturas[0];
		
		for(double altura: alturas) {
			if(altura < menorAltura) {
				menorAltura = altura;
			}
			
			if(altura > maiorAltura) {
				maiorAltura = altura;
			}
		}

		
		for(int i = 0; i < alturas.length; i++) {
			if(generos[i] == 'F') {
				somaAlturaMulheres += alturas[i];
				totalMulheres++;
			} else {
				totalHomens++;
			}
		}
		
		mediaAlturaMulheres = somaAlturaMulheres / totalMulheres;
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
		System.out.printf("Numero homens = %d\n", totalHomens);
		
		sc.close();
	}
}
