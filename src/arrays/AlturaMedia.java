package arrays;

import java.util.Locale;
import java.util.Scanner;

import arrays_entities.Person;

/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver
*/
public class AlturaMedia {
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);

	    Scanner sc = new Scanner(System.in);
	    int totalPerson;
	    String name;
	    int age;
	    double heigth;
	    double mediaHeigth;
	    double sumHeigth = 0;
	    double smallerSixteen = 0;

	    System.out.print("Quantas pessoas serao digitadas? ");
	    totalPerson = sc.nextInt();

	    Person[] vetorPerson = new Person[totalPerson];

	    for(int i=0; i < totalPerson; i++) {
	      sc.nextLine();
	      System.out.println("Dados da " + (i+1) + "° pessoa:");
	      System.out.print("Nome: ");
	      name = sc.nextLine();
	    
	      System.out.print("Idade: ");
	      age = sc.nextInt();
	      
	      System.out.print("Altura: ");
	      heigth = sc.nextDouble();

	      vetorPerson[i] = new Person(name, age, heigth);
	    }
	    
	    for (int i = 0; i < vetorPerson.length; i++) {
	    	sumHeigth += vetorPerson[i].getHeigth();
	    	
	    	if(vetorPerson[i].getAge() < 16) {
	    		smallerSixteen++;
	    	}
	    }
	    
	    System.out.println("");
	    
	    mediaHeigth = sumHeigth / vetorPerson.length;	    
	    System.out.printf("Altura media: %.1f\n", mediaHeigth);
	    
	    double percentSmallerSixteen = (smallerSixteen == 0 ? 0 : ((smallerSixteen / vetorPerson.length) * 100));
	    System.out.println("Pessoas com menos de 16 anos: " + percentSmallerSixteen + "%");
	    //System.out.println(smallerSixteen / vetorPerson.length * 100);
	    
	    //System.out.printf("\nPessoas com menos de 16 anos: %.1f\n", ());
	    
	    for (Person person : vetorPerson) {
	    	if(person.getAge() < 16) {
	    		System.out.println(person.getName());
	    	}
	    }

	  
	    sc.close();
	  }
}
