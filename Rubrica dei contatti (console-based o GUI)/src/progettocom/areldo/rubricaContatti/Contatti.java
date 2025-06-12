package progettocom.areldo.rubricaContatti;

import java.util.ArrayList;
import java.util.Scanner;

public class Contatti{

	String nome;
	int numero;

	public Contatti(Scanner scanner) {
		System.out.println("scrivi il nome della persona");
		this.nome=scanner.nextLine();
		
		System.out.println("scrivi il numero della persona");
		this.numero=scanner.nextInt();
		scanner.nextLine();

	}
	
	@Override
	public String toString() {
	    return "Nome: " + nome + ", Numero: " + numero;
	}

	


}
