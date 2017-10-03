package main;

import main.BinomioDeNewton;

public class BinomioDeNewton {
	int grado;
	static int g = 0;
	double a;
	double b;
	static int[][] pascal;

	public int getGrado() {
		return grado;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		BinomioDeNewton.g = g;
	}
	
	public static void setPascal(int[][] pascal) {
		BinomioDeNewton.pascal = pascal;
	}
	
	public BinomioDeNewton(int grado) {
		this.grado = grado;
	}

	public long obtener_k(int nro_k) {
		return (factorial(grado) / (factorial(nro_k) * factorial(grado - nro_k)));

	}

	public long factorial(int numero) {
		long factorial = 1;
		while(numero>0){
			factorial = factorial * numero;
			numero--;
		}
		return factorial;
	}
	
	public int[] obtener_coef_binomiales() {
		if(this.getG() < grado){
			this.setG(grado);
			int pasc[][] = new int[grado+1][grado+1];
			
			for (int i = 0; i <= grado; i++){
				pasc[i][i] = 1;
				pasc[i][0] = 1;
			}
			for (int i = 2; i <= grado; i++) {
				for (int j = 1; j < i; j++) {
					pasc[i][j] = pasc[i - 1][j] + pasc[i - 1][j - 1];
				}
			}
			setPascal(pasc);
		}
		int[] coef = new int[grado + 1];
		for (int h = 0; h <= grado; h++) {
			coef[h] = pascal[grado][h];
		}
		return coef;
	}
}