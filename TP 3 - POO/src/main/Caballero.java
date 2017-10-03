package main;

public class Caballero extends Personaje {

	private Integer cantAtaques; // Es la cantidad de ataques seguidos del
									// caballo del caballero.

	public Caballero(Integer posicion) {
		super(posicion, 200, 50);
		cantAtaques = 0;
	}

	/*
	 * @Override public void atacar(Peleable atacado) {
	 * 
	 * if(Math.abs(posicion-((Personaje)atacado).getPosicion())>=1 &&
	 * Math.abs(posicion-((Personaje)atacado).getPosicion())<=2 && cantAtaques <
	 * 3) { cantAtaques++; atacado.serAtacado(50); } }
	 */

	public void darPocionDeAgua() {
		cantAtaques = 0;
	}

	@Override
	public boolean puedoAtacar(Peleable atacado) {
		return Math.abs(posicion - (atacado).getPosicion()) >= 1
				&& Math.abs(posicion - (atacado).getPosicion()) <= 2
				&& cantAtaques < 3;
	}

	@Override
	protected void costoDeAtaque() {
		cantAtaques++;
	}

}
