package main;

public class Polinomio {

	private int grado;
	private double[] coeficientes;

	public Polinomio(int grado, double[] coeficientes) {
		this.grado = grado;
		this.coeficientes = new double[coeficientes.length];
		for (int i = 0; i < coeficientes.length; i++) {
			this.coeficientes[i] = coeficientes[i];
		}
	}

	public Polinomio(int grado, int[] coeficientes) {
		this.grado = grado;
		this.coeficientes = new double[coeficientes.length];
		for (int i = 0; i < coeficientes.length; i++) {
			this.coeficientes[i] = (double) coeficientes[i];
		}
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public double[] getCoeficientes() {
		return coeficientes;
	}

	public void setCoeficientes(double[] coeficientes) {
		this.coeficientes = coeficientes;
	}

	public double evaluarMSucesivas(double x) {
		double total = coeficientes[coeficientes.length - 1]; // Aca ya tengo cargado el valor del termino
																// independiente. //
		int gradoActual = grado;

		for (int i = 0; i < grado; i++) {
			double acumDeGrado = x;
			for (int j = 0; j < gradoActual - 1; j++) {
				// total*=x;
				acumDeGrado *= x;
			}
			total += coeficientes[i] * acumDeGrado;

			gradoActual--;
		}

		return total;
	}

	public double evaluarRecursiva(double x) {
		double total = coeficientes[coeficientes.length - 1]; // Aca ya tengo cargado el valor del termino
																// independiente. //
		int a = 0;

		for (int i = grado; i > 0; i--) {
			total += potencia(x, i) * coeficientes[a];
			a++;
		}

		return total;
	}

	private double potencia(double x, int n) // n es la potencia y x es la base. //
	{
		if (n == 0) {
			return 1;
		}

		return x * potencia(x, n - 1);
	}

	public double evaluarRecursivaImportandoExponentes(double x) {
		double total = coeficientes[coeficientes.length - 1]; // Aca ya tengo cargado el valor del termino
																// independiente. //
		int a = 0;

		for (int i = grado; i > 0; i--) {
			if (i % 2 == 0) {
				total += coeficientes[a] * potenciaImportandoExponente(x * x, i / 2);
			} else {
				total += coeficientes[a] * x * potenciaImportandoExponente(x, i - 1);
			}
			a++;
		}

		return total;
	}

	private double potenciaImportandoExponente(double x, int n) {
		if (n == 0) {
			return 1;
		}

		double acum = x;
		for (int i = 0; i < n - 1; i++) {
			acum *= x;
		}

		return acum;
	}

	public double evaluarProgDinamica(double x) {
		double total = 0;
		int a = grado;
		double acum = 1;

		for (int i = 0; i < grado + 1; i++) {
			total += coeficientes[a] * acum;
			a--;
			acum *= x;
		}

		return total;
	}

	public double evaluarPow(double x) {
		double total = coeficientes[coeficientes.length - 1]; // Aca ya tengo cargado el valor del termino
																// independiente. //
		int a = 0;

		for (int i = grado; i > 0; i--) {
			total += Math.pow(x, i) * coeficientes[a];
			a++;
		}

		return total;
	}

	public double evaluarHorner(double x) {

		double[] aux = new double[coeficientes.length];
		aux[0] = coeficientes[0];
		for (int i = 1; i <= grado; i++) {
			aux[i] = coeficientes[i] + aux[i - 1] * x;
		}
		return aux[grado];

	}
}
