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
	
	public Integer getDaño()
	{
		return personaje.getDaño();
	}
	
	public Integer getSalud()
	{
		return personaje.getSalud();
	}
}
