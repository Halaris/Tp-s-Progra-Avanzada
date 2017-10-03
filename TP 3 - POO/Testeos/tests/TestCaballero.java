package tests;

import main.Arquero;
import main.Caballero;
import main.Escudo;
import main.Lancero;
import main.Peleable;
import main.Puñal;
import main.Soldado;

import org.junit.Assert;
import org.junit.Test;
//import main.Escudo;
//import main.Capa;
//import main.Escudo;
//import main.Peleable;
//import main.Personaje;

public class TestCaballero {

	@Test
	public void caballeroPeladoAtacaCaballeroPelado() {
		Peleable c1 = new Caballero(0);
		Peleable c2 = new Caballero(2);

		c1.atacar(c2);

		Assert.assertEquals((Integer) 150, c2.getSalud());

	}

	@Test
	public void noPuedeAtacarPorCaballoRebelde() {
		Peleable c1 = new Caballero(0);
		Peleable c2 = new Caballero(2);

		for (int i = 0; i < 10; i++) {

			c1.atacar(c2);
		}

		Assert.assertEquals((Integer) 50, c2.getSalud());

	}

	@Test
	public void noTieneAlcanceParaAtacar() {
		Peleable c1 = new Caballero(0);
		Peleable c2 = new Caballero(10);

		c1.atacar(c2);

		Assert.assertEquals((Integer) 200, c2.getSalud());

	}
	
	@Test
	public void noAtacaPorEstarMuyCerca() {
		Peleable c1 = new Caballero(0);
		Peleable c2 = new Caballero(0);

		c1.atacar(c2);

		Assert.assertEquals((Integer) 200, c2.getSalud());

	}

	@Test
	public void caballoRebeldeTomaAgua() {
		Peleable c1 = new Caballero(0);
		Peleable c2 = new Caballero(2);

		for (int i = 0; i < 10; i++) {

			c1.atacar(c2);
		}
		Assert.assertEquals((Integer) 50, c2.getSalud()); //Caballero que hace 50 de daño, ataco a cabellero q comienza con 200 de vida, lo dejo con 50 xq solo puede atacar 3 veces

		((Caballero) c1).darPocionDeAgua(); //se le va la rebeldia al caballo y puede atacar 3 veces mas

		for (int i = 0; i < 10; i++) {

			c1.atacar(c2);
		}

		Assert.assertEquals((Integer) 0, c2.getSalud()); //mata al caballero c2

	}


	@Test
	public void atacaCaballeroConEscudo() {

		Peleable c1 = new Caballero(0);
		Peleable c2 = new Caballero(2);

		c2 = new Escudo(c2);
		c1.atacar(c2);
		c1.atacar(c2);

		Assert.assertEquals((Integer) 160, c2.getSalud());

	}

	@Test
	public void conPuñalAtacaACaballeroPelado() {

		Peleable c1 = new Caballero(0);
		Peleable c2 = new Caballero(2);

		c1 = new Puñal(c1);
		c1.atacar(c2);

		Assert.assertEquals((Integer) 147, c2.getSalud());

	}

	@Test
	public void atacaALancero() {
		Peleable c1 = new Caballero(0);
		Peleable l2 = new Lancero(2);

		c1.atacar(l2);

		Assert.assertEquals((Integer) 100, l2.getSalud());
	}

	@Test
	public void atacaASoldado() {
		Peleable c1 = new Caballero(0);
		Peleable s2 = new Soldado(2);

		c1.atacar(s2);

		Assert.assertEquals((Integer) 150, s2.getSalud());
	}

	@Test
	public void atacaAArquero() {
		Peleable c1 = new Caballero(0);
		Peleable a2 = new Arquero(2);

		c1.atacar(a2);

		Assert.assertEquals((Integer) 0, a2.getSalud());
	}

	@Test
	public void conPuñalAtacaALancero() {
		Peleable c1 = new Caballero(0);
		Peleable l2 = new Lancero(2);

		c1 = new Puñal(c1);
		c1.atacar(l2);

		Assert.assertEquals((Integer) 97, l2.getSalud());
	}

}
