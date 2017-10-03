package testPrincipalParaObtenerKDeBinomio;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;
import main.BinomioDeNewton;

public class Testeadora {
	
	/*@Test
	public void testGrado5() { // Obtengo el 2do coeficiente de un polinomio de grado 5
		BinomioDeNewton b1 = new BinomioDeNewton(5);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		b1.obtener_k(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Binomio de grado 5 ->   Tiempo ejecución: " + diff + " ms");
	}*/
	/*@Test
	public void testGrado10() { // Obtengo el 2do coeficiente de un polinomio de grado 5
		BinomioDeNewton b2 = new BinomioDeNewton(10);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		b2.obtener_k(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Binomio de grado 10 ->   Tiempo ejecución: " + diff + " ms");
	}*/
	@Test
	public void testGrado20() { // Obtengo el 2do coeficiente de un polinomio de grado 5
		BinomioDeNewton b2 = new BinomioDeNewton(20);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		b2.obtener_k(8);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Binomio de grado 20 ->   Tiempo ejecución: " + diff + " ms");
	}
	/*@Test
	public void testGrado30() { // Obtengo el 2do coeficiente de un polinomio de grado 5
		BinomioDeNewton b2 = new BinomioDeNewton(30);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		b2.obtener_k(8);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Binomio de grado 30 ->   Tiempo ejecución: " + diff + " ms");
	}*/
	
	

}
