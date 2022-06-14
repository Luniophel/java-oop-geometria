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
		boolean valid = false; // Validator dei valori digitati dall'utente

		String unit; // Unità di misura
		String validUnits[] = { "km", "hm", "dam", "m", "dm", "cm", "mm" }; // Unità accettate

		do { // Se l'utente inserisce unità non accettate, ripeti il ciclo
				// Chiedo all'utente di specificare un'unità di misura
			System.out.println("Dichiara un'unità di misura:");
			unit = scan.nextLine();
			for (int i = 0; i < validUnits.length; i++) {
				if (unit.equalsIgnoreCase(validUnits[i])) {
					valid = true;
				}
			}
			if (valid == false) {
				System.out.println("Hai inserito un'unità non presente nel sistema. Prova con 'cm'.");
			}
		} while (valid == false);

		// Chiedo i valori dei rettangoli all'utente e costruisco gli array che li
		// contengono
		for (int i = 0; i < 5; i++) {
			// Se inserisco valori negativi, il ciclo si ripete per l'iterazione in corso
			do {
				// Chiedo i valori all'utente e li raccolgo nell'array
				System.out.println("Dichiara i dati del " + (i + 1) + "° rettangolo in " + unit + ":");
				System.out.print("Base = ");
				bRettangolo[i] = scan.nextInt();
				System.out.print("Altezza = ");
				hRettangolo[i] = scan.nextInt();
				System.out.println("______");

				// Controllo che i valori siano entrambi maggiori di zero
				if (bRettangolo[i] > 0 && hRettangolo[i] > 0) {
					valid = true;
				} else {
					valid = false;
					System.out.println("\nERRORE: Hai inserito valori non validi!\n");
				}
			} while (valid == false); // Diventa true quando i valori sono maggiori di 0
		}

		// Recap dei valori scelti dall'utente
		System.out.println("\nRiepilogando:");
		for (int i = 0; i < bRettangolo.length && i < hRettangolo.length; i++) {
			System.out.println("Rettangolo numero " + (i + 1) + ": ");
			System.out.println("b = " + bRettangolo[i] + unit + "; " + "h = " + hRettangolo[i] + unit + ";");
		}

		// Calcolo l'Area dei rettangoli
		int[] aRettangolo = new int[5];
		int aMaggiore = 0;

		for (int i = 0; i < 5; i++) {
			mioRettangolo.base = bRettangolo[i];
			mioRettangolo.altezza = hRettangolo[i];
			aRettangolo[i] = mioRettangolo.calcolaArea();
			// Tengo da parte l'area maggiore
			if (i > 0 && aRettangolo[i] > aRettangolo[i - 1]) {
				aMaggiore = aRettangolo[i];
			}
		}

		// Stampo l'Area del rettangolo più grande
		System.out
				.println("\nTra tutti i rettangoli, quello con l'area maggiore misura " + aMaggiore + unit + "\u00B2");
		scan.close();
	}

}
