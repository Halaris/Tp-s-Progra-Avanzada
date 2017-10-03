package main;

public class Lancero extends Personaje {

	public Lancero(Integer posicion) {
		super(posicion, 150, 25);
	}

	/*
	 * @Override public void atacar(Peleable atacado) {
	 * 
	 * if(Math.abs(posicion-((Personaje)atacado).getPosicion())>=1 &&
	 * Math.abs(posicion-((Personaje)atacado).getPosicion())<=3) {
	 * atacado.serAtacado(5); } }
	 */

	@Override
	public boolean puedoAtacar(Peleable atacado) {
		return Math.abs(posicion - (atacado).getPosicion()) >= 1
				&& Math.abs(posicion - (atacado).getPosicion()) <= 3;
	}

	@Override
	protected void costoDeAtaque() {

	}

}
