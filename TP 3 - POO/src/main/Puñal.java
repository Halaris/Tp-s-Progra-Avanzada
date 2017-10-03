package main;

public class Pu�al extends PersonajeDecorator{
	
	public Pu�al(Peleable peleable)
	{
		super(peleable);
		((Personaje)personaje).da�o += 3;
	}
	
	@Override
	public void atacar(Peleable atacado)
	{
		personaje.atacar(atacado);		
	}

	@Override
	public void serAtacado(int da�o) 
	{
		personaje.serAtacado(da�o+3);
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
