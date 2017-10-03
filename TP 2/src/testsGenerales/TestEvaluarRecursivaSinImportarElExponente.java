package testsGenerales;

import org.junit.Assert;
import org.junit.Test;

import main.Polinomio;

public class TestEvaluarRecursivaSinImportarElExponente {
	

	@Test
	public void testQueMetodoEvaluarRecursividadComunDevuelva21()
	{
		double[] coeficientes={3,3,3};
		Polinomio p=new Polinomio(2,coeficientes);
		Assert.assertEquals(21, p.evaluarRecursiva(2),0.0001);
	}
	
	
	@Test
	public void testQueMetodoEvaluarRecursividadComunFuncioneBienConPolinomioDeGrado1()
	{
		double[] coeficientes={3,3};
		Polinomio p=new Polinomio(1,coeficientes);
		Assert.assertEquals(9, p.evaluarRecursiva(2),0.0001);
	}
	
	
	@Test
	public void testQueMetodoEvaluarRecursividadComunFuncioneBienConPolinomioDeGrado0()
	{
		double[] coeficientes={3};
		Polinomio p=new Polinomio(0,coeficientes);
		Assert.assertEquals(3, p.evaluarRecursiva(2),0.0001);
	}
	
	@Test
	public void testQueMetodoEvaluarMSucesivasSinImportarExponenteDevuelva332()
	{
		double[] coeficientes={3,2,2,4,5};
		Polinomio p=new Polinomio(4,coeficientes);
		Assert.assertEquals(332, p.evaluarRecursiva(3),0.0001);
	}
}
