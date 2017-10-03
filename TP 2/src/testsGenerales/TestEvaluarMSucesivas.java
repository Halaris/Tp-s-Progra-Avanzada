package testsGenerales;

import org.junit.Assert;
import org.junit.Test;

import main.Polinomio;

public class TestEvaluarMSucesivas {
	
	@Test
	public void testQueSeCreaPolinomioDeGrado3ConTodosSusCoeficientesConValor1()
	{
		double[] coeficientes={1,1,1,1};
		Polinomio p=new Polinomio(3,coeficientes);
		Assert.assertEquals(3,p.getGrado());
		Assert.assertEquals(1, p.getCoeficientes()[0],0.0001);
		Assert.assertEquals(1, p.getCoeficientes()[1],0.0001);
		Assert.assertEquals(1, p.getCoeficientes()[2],0.0001);
		Assert.assertEquals(1, p.getCoeficientes()[3],0.0001);		
	}
	
	@Test
	public void testQueMetodoEvaluarMSucesivasDevuelva21()
	{
		double[] coeficientes={3,3,3};
		Polinomio p=new Polinomio(2,coeficientes);
		Assert.assertEquals(21, p.evaluarMSucesivas(2),0.0001);
	}
	
	@Test
	public void testQueMetodoEvaluarMSucesivasFuncioneBienConPolinomioDeGrado1()
	{
		double[] coeficientes={3,3};
		Polinomio p=new Polinomio(1,coeficientes);
		Assert.assertEquals(9, p.evaluarMSucesivas(2),0.0001);
	}
	
	@Test
	public void testQueMetodoEvaluarMSucesivasFuncioneBienConPolinomioDeGrado0()
	{
		double[] coeficientes={3};
		Polinomio p=new Polinomio(0,coeficientes);
		Assert.assertEquals(3, p.evaluarMSucesivas(2),0.0001);
	}
	
	@Test
	public void testQueMetodoEvaluarMSucesivasDevuelva332()
	{
		double[] coeficientes={3,2,2,4,5};
		Polinomio p=new Polinomio(4,coeficientes);
		Assert.assertEquals(332, p.evaluarMSucesivas(3),0.0001);
	}

}
