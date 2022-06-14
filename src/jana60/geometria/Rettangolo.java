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

	// Metodo per Area
	int calcolaArea() {
		int area = base * altezza;
		return area;
	}

	// Stampa risultati
	void stampaRisultati() {
		System.out.println("P = " + calcolaPerimetro() + ";\n" + "A = " + calcolaArea() + ";");
	}
}
