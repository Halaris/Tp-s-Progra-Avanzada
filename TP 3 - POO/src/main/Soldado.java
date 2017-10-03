package main;

public class Soldado extends Personaje{
	
	private static final Integer ENERGIA_TOPE = 100;
	protected Integer energia;

	public Soldado(Integer posicion)
	{
		super(posicion, 200, 10);
		this.energia = ENERGIA_TOPE;
	}
	
	public void darPocionDeAgua(int valorARecargar)
	{
		if(energia+valorARecargar > ENERGIA_TOPE)
		{
			energia = ENERGIA_TOPE;
		}
		else
		{
			energia += valorARecargar;
		}
	}

	@Override
	public boolean puedoAtacar(Peleable atacado) {
		return posicion == atacado.getPosicion() && energia >= 10;
	}

	@Override
	public void costoDeAtaque() {
		
		energia -= 10;
	}
	
	public Integer getEnergia(){
		
		return energia;
	}
}
