package jana60.geometria;

public class Rettangolo {

	// Attributi
	int base;
	int altezza;

	// Metodi
	// Metodo per Perimetro
	int calcolaPerimetro() {
		int perimetro = 2 * (base + altezza);
		return perimetro;
	}

	void stampaPerimetro() {
		System.out.println("Il perimetro del rettangolo è: " + calcolaPerimetro());

	}
	// Metodo per Area
}
