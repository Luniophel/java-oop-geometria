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

		boolean valid = false;
		for (int i = 0; i < 5; i++) {
			// Se il valore inserito è minore di zero, ripeti il ciclo

			do {// Se inserisco valori negativi, il ciclo si ripete per l'iterazione in corso
				// Chiedo i valori all'utente e li raccolgo nell'array
				System.out.println("Quanto misura la base del rettangolo numero " + (i + 1) + "?");
				bRettangolo[i] = scan.nextInt();
				System.out.println("Quanto misura l'altezza del rettangolo numero " + (i + 1) + "?");
				hRettangolo[i] = scan.nextInt();
				if (bRettangolo[i] > 0 && hRettangolo[i] > 0) {
					valid = true;
				} else {
					valid = false;
					System.out.println("\nERRORE: " + "Non puoi inserire numeri negativi!\n");
				}
			} while (valid == false);
		}

		// Recap dei valori scelti dall'utente
		System.out.println("\nRiepilogando:");
		for (int i = 0; i < 5; i++) {
			System.out.println("Il rettangolo numero " + (i + 1) + " ha i seguenti valori: ");
			System.out.println("b = " + bRettangolo[i] + "; " + "h = " + hRettangolo[i] + ";");
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
		System.out.println("\nL'area maggiore è uguale a: " + aMaggiore);
		scan.close();
	}

}
