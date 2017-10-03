package main;

public abstract class Personaje extends Peleable{
	
	protected Integer posicion;
	protected Integer salud;
	protected Integer da�o;
	//protected Integer saludAnterior;
	
	public Personaje(Integer posicion, Integer salud, Integer da�o)
	{
		this.posicion = posicion;
		this.salud = salud;
		//saludAnterior = salud;
		this.da�o = da�o;
	}
	
	public Integer getPosicion()
	{
		return posicion;
	}
	
	public Integer getSalud()
	{
		return salud;
	}
	
	public void setSalud(int cant)
	{
		salud = cant;
	}
	
	
	public void serAtacado(int da�o)
	{
		//saludAnterior = salud;
		if(salud-da�o < 0)
		{
			salud = 0;
		}
		else
		{
			salud -= da�o;
		}
	}
	
	protected Integer getDa�o()
	{
		return da�o;
	}

}
