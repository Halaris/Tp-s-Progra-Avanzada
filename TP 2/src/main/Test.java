package main;

public class Test {
	public static void main(String[] args) {
		BinomioDeNewton b1 = new BinomioDeNewton(30);
	int[] respuesta = b1.obtener_coef_binomiales();
	for(int i=0; i<respuesta.length;i++){
		System.out.println(respuesta[i]);
	}
	}

	
	

}
