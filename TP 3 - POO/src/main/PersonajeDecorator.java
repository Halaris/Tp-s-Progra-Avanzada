package main;

public abstract class PersonajeDecorator extends Peleable{
	
	protected Peleable personaje;
	
	public PersonajeDecorator(Peleable personaje)
	{
		this.personaje = personaje;
	}
	
	public Peleable getPeleable()
	{
		return personaje;
	}
	
	public Integer getPosicion()
	{
		return personaje.getPosicion();
	}
	
	public Integer getDa�o()
	{
		return personaje.getDa�o();
	}
	
	public Integer getSalud()
	{
		return personaje.getSalud();
	}
}
