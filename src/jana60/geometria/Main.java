package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Istanza
		Rettangolo rettangolo1 = new Rettangolo();

		// Chiedo i valori all'utente
		System.out.print("Inserisci la base del rettangolo: ");
		rettangolo1.base = scan.nextInt();
		System.out.print("Inserisci l'altezza del rettangolo: ");
		rettangolo1.altezza = scan.nextInt();

		// Stampo Perimetro
		System.out.println("Ecco i risultati:\n");
		rettangolo1.stampaRisultati();

	}

}
