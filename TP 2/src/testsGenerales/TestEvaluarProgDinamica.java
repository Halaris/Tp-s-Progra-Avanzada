package testsGenerales;

import org.junit.Assert;
import org.junit.Test;

import main.Polinomio;

public class TestEvaluarProgDinamica {
		
	
	@Test
	public void testQueMetodoEvaluarProgDinamicaDevuelva21()
	{
		double[] coeficientes={3,3,3};
		Polinomio p=new Polinomio(2,coeficientes);
		Assert.assertEquals(21, p.evaluarProgDinamica(2),0.0001);
	}
	
	
	@Test
	public void testQueMetodoEvaluarProgDinamicaFuncioneBienConPolinomioDeGrado1()
	{
		double[] coeficientes={3,3};
		Polinomio p=new Polinomio(1,coeficientes);
		Assert.assertEquals(9, p.evaluarProgDinamica(2),0.0001);
	}
	
	
	@Test
	public void testQueMetodoEvaluarMSucesivasFuncioneBienConPolinomioDeGrado0()
	{
		double[] coeficientes={3};
		Polinomio p=new Polinomio(0,coeficientes);
		Assert.assertEquals(3, p.evaluarProgDinamica(2),0.0001);
	}
	
	@Test
	public void testQueMetodoEvaluarProgDinamicaDevuelva332()
	{
		double[] coeficientes={3,2,2,4,5};
		Polinomio p=new Polinomio(4,coeficientes);
		Assert.assertEquals(332, p.evaluarProgDinamica(3),0.0001);
	}

}
