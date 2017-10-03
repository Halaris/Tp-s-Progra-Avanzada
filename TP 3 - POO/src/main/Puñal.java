package main;

public class Puñal extends PersonajeDecorator{
	
	public Puñal(Peleable peleable)
	{
		super(peleable);
		((Personaje)personaje).daño += 3;
	}
	
	@Override
	public void atacar(Peleable atacado)
	{
		personaje.atacar(atacado);		
	}

	@Override
	public void serAtacado(int daño) 
	{
		personaje.serAtacado(daño+3);
	}

	@Override
	public boolean puedoAtacar(Peleable atacado) {
		
		return personaje.puedoAtacar(atacado);
	}

	@Override
	protected void costoDeAtaque() {
		
		personaje.costoDeAtaque();		
	}

}
