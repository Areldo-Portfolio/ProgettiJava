package progettocom.areldo.rubricaContatti;

import java.util.ArrayList;
import java.util.Scanner;

public class Utilita {

		public static int opzioni(Scanner scanner) {
		    System.out.println("Scegli una delle seguenti opzioni:");
		    System.out.println("0 - Visualizza rubrica");
		    System.out.println("1 - Aggiungi un contatto");
		    System.out.println("2 - Rimuovi un contatto");
		    System.out.println("3 - Esci");

		    int opzione = scanner.nextInt();
		    scanner.nextLine();

		    return opzione;
		}

	
	public static void stampaRubrica(ArrayList<Contatti> rubrica) {
	    if (rubrica.isEmpty()) {
	        System.out.println("Rubrica vuota.");
	        return;
	    }

	    int numero = 0;
	    for (Contatti c : rubrica) {
	        System.out.println(numero + " - " + c);
	        numero++;
	    }
	}


}