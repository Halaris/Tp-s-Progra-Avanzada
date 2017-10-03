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
		((Personaje)personaje).da�o= 	(int)Math.round(((Personaje)personaje).da�o.intValue() *  0.9);
	}
	
	@Override
	public void atacar(Peleable atacado)
	{
		personaje.atacar(atacado);		
	}

	@Override
	public void serAtacado(int da�o) 
	{
		personaje.serAtacado(da�o);
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
