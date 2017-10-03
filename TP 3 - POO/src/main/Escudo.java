package main;

public class Escudo extends PersonajeDecorator{
	
	
	public Escudo(Peleable peleable)
	{
		super(peleable);
	}

	

	@Override
	public void atacar(Peleable atacado)
	{
		personaje.atacar(atacado);		
	}

	@Override
	public void serAtacado(int da�o) 
	{
		personaje.serAtacado((int)Math.round(da�o*0.4));
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
