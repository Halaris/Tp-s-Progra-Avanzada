package testPrincipalParaRecursivaImportandoExponentes;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import org.junit.Test;

import main.Polinomio;

public class Testeadora {
	
	
	/*
	@Test
	public void testGrado5() // Evaluo el polinomio de grado 5 con x=2. //
	{
		double[] coeficientes={5,5,5,5,5,5};
		Polinomio p=new Polinomio(5,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 5 ->   Tiempo ejecución: " + diff + " ms");
	}
	*/
	
	/*
	@Test
	public void testGrado50() // Evaluo el polinomio de grado 50 con x=2. //
	{
		double[] coeficientes = new double[51];
		File archIn;
		Scanner sc;
		try
		{
			archIn=new File("Lote de pruebas\\casoDe50.txt");
			sc=new Scanner(archIn);
			for(int i=0; i<51; i++)
			{
				coeficientes[i]=sc.nextDouble();
			}
			
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		
		Polinomio p=new Polinomio(50,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 50 ->   Tiempo ejecución: " + diff + " ms");		
	}
	*/
	
	/*
	@Test
	public void testGrado100() // Evaluo el polinomio de grado 100 con x=2. //
	{
		double[] coeficientes = new double[101];
		File archIn;
		Scanner sc;
		try
		{
			archIn=new File("Lote de pruebas\\casoDe100.txt");
			sc=new Scanner(archIn);
			for(int i=0; i<101; i++)
			{
				coeficientes[i]=sc.nextDouble();
			}
			
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		
		Polinomio p=new Polinomio(100,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 100 ->   Tiempo ejecución: " + diff + " ms");		
	}
	*/
	
	/*
	@Test
	public void testGrado200() // Evaluo el polinomio de grado 200 con x=2. //
	{
		double[] coeficientes = new double[201];
		File archIn;
		Scanner sc;
		try
		{
			archIn=new File("Lote de pruebas\\casoDe200.txt");
			sc=new Scanner(archIn);
			for(int i=0; i<201; i++)
			{
				coeficientes[i]=sc.nextDouble();
			}
			
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		
		Polinomio p=new Polinomio(200,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 200 ->   Tiempo ejecución: " + diff + " ms");		
	}
	*/
	
	/*
	@Test
	public void testGrado500() // Evaluo el polinomio de grado 200 con x=2. //
	{
		double[] coeficientes = new double[501];
		File archIn;
		Scanner sc;
		try
		{
			archIn=new File("Lote de pruebas\\casoDe500.txt");
			sc=new Scanner(archIn);
			for(int i=0; i<501; i++)
			{
				coeficientes[i]=sc.nextDouble();
			}
			
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		
		Polinomio p=new Polinomio(500,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 500 ->   Tiempo ejecución: " + diff + " ms");		
	}
	*/
	
	/*
	@Test
	public void testGrado1000() // Evaluo el polinomio de grado 200 con x=2. //
	{
		double[] coeficientes = new double[1001];
		File archIn;
		Scanner sc;
		try
		{
			archIn=new File("Lote de pruebas\\casoDe1000.txt");
			sc=new Scanner(archIn);
			for(int i=0; i<1001; i++)
			{
				coeficientes[i]=sc.nextDouble();
			}
			
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		
		Polinomio p=new Polinomio(1000,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 1000 ->   Tiempo ejecución: " + diff + " ms");		
	}
	*/
	
	/*
	@Test
	public void testGrado1500() // Evaluo el polinomio de grado 200 con x=2. //
	{
		double[] coeficientes = new double[1501];
		File archIn;
		Scanner sc;
		try
		{
			archIn=new File("Lote de pruebas\\casoDe1500.txt");
			sc=new Scanner(archIn);
			for(int i=0; i<1501; i++)
			{
				coeficientes[i]=sc.nextDouble();
			}
			
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		
		Polinomio p=new Polinomio(1500,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 1500 ->   Tiempo ejecución: " + diff + " ms");		
	}
	*/
	
	/*
	@Test
	public void testGrado2000() // Evaluo el polinomio de grado 200 con x=2. //
	{
		double[] coeficientes = new double[2001];
		File archIn;
		Scanner sc;
		try
		{
			archIn=new File("Lote de pruebas\\casoDe2000.txt");
			sc=new Scanner(archIn);
			for(int i=0; i<2001; i++)
			{
				coeficientes[i]=sc.nextDouble();
			}
			
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		
		Polinomio p=new Polinomio(2000,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 2000 ->   Tiempo ejecución: " + diff + " ms");		
	}
	*/
	
	/*
	@Test
	public void testGrado3000() // Evaluo el polinomio de grado 200 con x=2. //
	{
		double[] coeficientes = new double[3001];
		File archIn;
		Scanner sc;
		try
		{
			archIn=new File("Lote de pruebas\\casoDe3000.txt");
			sc=new Scanner(archIn);
			for(int i=0; i<3001; i++)
			{
				coeficientes[i]=sc.nextDouble();
			}
			
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		
		Polinomio p=new Polinomio(3000,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 3000 ->   Tiempo ejecución: " + diff + " ms");		
	}
	*/
	
	/*
	@Test
	public void testGrado4000() // Evaluo el polinomio de grado 200 con x=2. //
	{
		double[] coeficientes = new double[4001];
		File archIn;
		Scanner sc;
		try
		{
			archIn=new File("Lote de pruebas\\casoDe4000.txt");
			sc=new Scanner(archIn);
			for(int i=0; i<4001; i++)
			{
				coeficientes[i]=sc.nextDouble();
			}
			
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		
		Polinomio p=new Polinomio(4000,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 4000 ->   Tiempo ejecución: " + diff + " ms");		
	}
	*/
	
	/*
	@Test
	public void testGrado5000() // Evaluo el polinomio de grado 200 con x=2. //
	{
		double[] coeficientes = new double[5001];
		File archIn;
		Scanner sc;
		try
		{
			archIn=new File("Lote de pruebas\\casoDe5000.txt");
			sc=new Scanner(archIn);
			for(int i=0; i<5001; i++)
			{
				coeficientes[i]=sc.nextDouble();
			}
			
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		
		Polinomio p=new Polinomio(5000,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 5000 ->   Tiempo ejecución: " + diff + " ms");		
	}
	*/
	
	/*
	@Test
	public void testGrado6000() // Evaluo el polinomio de grado 200 con x=2. //
	{
		double[] coeficientes = new double[6001];
		File archIn;
		Scanner sc;
		try
		{
			archIn=new File("Lote de pruebas\\casoDe6000.txt");
			sc=new Scanner(archIn);
			for(int i=0; i<6001; i++)
			{
				coeficientes[i]=sc.nextDouble();
			}
			
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		
		Polinomio p=new Polinomio(6000,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 6000 ->   Tiempo ejecución: " + diff + " ms");		
	}
	*/
	
	/*
	@Test
	public void testGrado10000() // Evaluo el polinomio de grado 200 con x=2. //
	{
		double[] coeficientes = new double[10001];
		File archIn;
		Scanner sc;
		try
		{
			archIn=new File("Lote de pruebas\\casoDe10000.txt");
			sc=new Scanner(archIn);
			for(int i=0; i<10001; i++)
			{
				coeficientes[i]=sc.nextDouble();
			}
			
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		
		Polinomio p=new Polinomio(10000,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 10000 ->   Tiempo ejecución: " + diff + " ms");		
	}
	*/
	
	
	/*
	@Test
	public void testGrado12000() // Evaluo el polinomio de grado 200 con x=2. //
	{
		double[] coeficientes = new double[12001];
		File archIn;
		Scanner sc;
		try
		{
			archIn=new File("Lote de pruebas\\casoDe12000.txt");
			sc=new Scanner(archIn);
			for(int i=0; i<12001; i++)
			{
				coeficientes[i]=sc.nextDouble();
			}
			
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
			
		Polinomio p=new Polinomio(12000,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 12000 ->   Tiempo ejecución: " + diff + " ms");		
	}
	*/
	
	///*
	@Test
	public void testGrado14000() // Evaluo el polinomio de grado 200 con x=2. //
	{
		double[] coeficientes = new double[14001];
		File archIn;
		Scanner sc;
		try
		{
			archIn=new File("Lote de pruebas\\casoDe14000.txt");
			sc=new Scanner(archIn);
			for(int i=0; i<14001; i++)
			{
				coeficientes[i]=sc.nextDouble();
			}
			
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		
		Polinomio p=new Polinomio(14000,coeficientes);
		Calendar tIni, tFin;
		tIni = new GregorianCalendar();
		p.evaluarRecursivaImportandoExponentes(2);
		tFin = new GregorianCalendar();
		long diff = tFin.getTimeInMillis() - tIni.getTimeInMillis();
		System.out.println("Polinomio de grado 14000 ->   Tiempo ejecución: " + diff + " ms");		
	}
	//*/
	
}
