package main;

public abstract class Personaje extends Peleable{
	
	protected Integer posicion;
	protected Integer salud;
	protected Integer daño;
	//protected Integer saludAnterior;
	
	public Personaje(Integer posicion, Integer salud, Integer daño)
	{
		this.posicion = posicion;
		this.salud = salud;
		//saludAnterior = salud;
		this.daño = daño;
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
	
	
	public void serAtacado(int daño)
	{
		//saludAnterior = salud;
		if(salud-daño < 0)
		{
			salud = 0;
		}
		else
		{
			salud -= daño;
		}
	}
	
	protected Integer getDaño()
	{
		return daño;
	}

}
