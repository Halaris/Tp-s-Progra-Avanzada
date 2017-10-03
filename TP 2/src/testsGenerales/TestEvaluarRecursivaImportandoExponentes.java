package testsGenerales;

import org.junit.Assert;
import org.junit.Test;

import main.Polinomio;

public class TestEvaluarRecursivaImportandoExponentes {
	
	
	@Test
	public void testQueMetodoEvaluarRecursividadImportandoExponenteDevuelva21()
	{
		double[] coeficientes={3,3,3};
		Polinomio p=new Polinomio(2,coeficientes);
		Assert.assertEquals(21, p.evaluarRecursivaImportandoExponentes(2),0.0001);
	}
	
	@Test
	public void testQueMetodoEvaluarRecursividadImportandoExponenteDevuelva332()
	{
		double[] coeficientes={3,2,2,4,5};
		Polinomio p=new Polinomio(4,coeficientes);
		Assert.assertEquals(332, p.evaluarRecursivaImportandoExponentes(3),0.0001);
	}

}
