package main;

public class Capa extends PersonajeDecorator{
	
	public Capa(Peleable peleable)
	{
		super(peleable);
		if(personaje.getClass() == Soldado.class)
		{
			Soldado sol = (Soldado)personaje;
			sol.energia *= 2;
		}
		((Personaje)personaje).daño= 	(int)Math.round(((Personaje)personaje).daño.intValue() *  0.9);
	}
	
	@Override
	public void atacar(Peleable atacado)
	{
		personaje.atacar(atacado);		
	}

	@Override
	public void serAtacado(int daño) 
	{
		personaje.serAtacado(daño);
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
