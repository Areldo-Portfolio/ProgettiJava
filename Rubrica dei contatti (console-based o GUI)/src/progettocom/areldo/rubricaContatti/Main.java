package progettocom.areldo.rubricaContatti;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Contatti> rubrica = new ArrayList<Contatti>();


	

		int opzioni = Utilita.opzioni(scanner);
		while (opzioni != 3) {
			switch (opzioni) {
			case 0: {
			    Utilita.stampaRubrica(rubrica);
			    opzioni = Utilita.opzioni(scanner);
			}

				break;
			case 1: {
				Contatti c = new Contatti(scanner);
			    rubrica.add(c);
			    opzioni = Utilita.opzioni(scanner);
			}

				break;
			case 2: {
			    Utilita.stampaRubrica(rubrica);
			    System.out.print("Inserisci il numero del contatto da rimuovere: ");
			    int indice = scanner.nextInt();
			    scanner.nextLine();

			    if (indice >= 0 && indice < rubrica.size()) {
			        rubrica.remove(indice);
			        System.out.println("Contatto rimosso.");
			    } else {
			        System.out.println("Indice non valido.");
			    }
			    opzioni = Utilita.opzioni(scanner);
			    break;
			}

			default:
				throw new IllegalArgumentException("Il valore inserito non è valido" + opzioni);
			}

		}

	}
}
