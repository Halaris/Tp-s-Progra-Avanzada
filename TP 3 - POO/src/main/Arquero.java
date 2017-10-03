package main;

public class Arquero extends Personaje {

	private Integer cantFlechas;

	public Arquero(Integer posicion) {
		super(posicion, 50, 5);
		cantFlechas = 20;
	}

	/*
	 * @Override public void atacar(Peleable atacado) {
	 * 
	 * if(Math.abs(posicion-((Personaje)atacado).getPosicion())>=2 &&
	 * Math.abs(posicion-((Personaje)atacado).getPosicion())<=5 &&
	 * cantFlechas>0) { cantFlechas--; atacado.serAtacado(5); } }
	 */

	public void recargarFlechas() {
		if (cantFlechas > 14) {
			cantFlechas = 20;
		} else {
			cantFlechas += 6;
		}
	}

	@Override
	public boolean puedoAtacar(Peleable atacado) {

		return Math.abs(posicion - (atacado).getPosicion()) >= 2
				&& Math.abs(posicion - (atacado).getPosicion()) <= 5
				&& cantFlechas > 0;
	}

	@Override
	protected void costoDeAtaque() {
		cantFlechas--;
	}
}
