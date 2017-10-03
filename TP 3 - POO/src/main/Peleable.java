package main;

public abstract class Peleable {
	
	
	//public Integer getPosicion();
	public abstract Integer getSalud();
	//public void setSalud(int cant);
//	public void atacar(Peleable atacado);
	//public abstract void serAtacado(int da�o);
	//public Integer getPosicion();
	// El "da�o", en los objetos no decorados, es real. En cambio, en los objetos decorados con 
	// escudo o pu�al, no son reales sino que es menor en el primer caso y mayor en el 
	//segundo.
	
	public void atacar(Peleable atacado)
	{
		if(puedoAtacar(atacado))
		{
			costoDeAtaque();
			atacado.serAtacado(getDa�o());
		}
	}
	
	public abstract Integer getPosicion();
	
	public abstract boolean puedoAtacar(Peleable atacado);
	
	protected abstract void costoDeAtaque();
	
	protected abstract void serAtacado(int da�o);
	
	protected abstract Integer getDa�o();

}
