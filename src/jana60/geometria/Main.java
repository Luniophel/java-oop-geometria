package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Istanza
		Rettangolo mioRettangolo = new Rettangolo();

// ___VERSIONE BASE___
//		// Chiedo i valori all'utente
//		System.out.print("Inserisci la base del rettangolo: ");
//		mioRettangolo.base = scan.nextInt();
//		System.out.print("Inserisci l'altezza del rettangolo: ");
//		mioRettangolo.altezza = scan.nextInt();
//
//		// Stampo Perimetro
//		System.out.println("Ecco i risultati:\n");
//		mioRettangolo.stampaRisultati();
//______________________________________________________________________//

//___VERSIONE BONUS___

		int[] bRettangolo = new int[5];
		int[] hRettangolo = new int[5];

		for (int i = 0; i < 5; i++) {
			// Chiedo i valori all'utente e li raccolgo nell'array
			System.out.println("Quanto misura la base del rettangolo numero " + (i + 1) + "?");
			bRettangolo[i] = scan.nextInt();
			System.out.println("Quanto misura l'altezza del rettangolo numero " + (i + 1) + "?");
			hRettangolo[i] = scan.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("\nIl rettangolo numero " + (i + 1) + " ha i seguenti valori: \n" + "b = "
					+ bRettangolo[i] + "; " + "h = " + hRettangolo[i] + ";");
		}

		scan.close();
	}

}
