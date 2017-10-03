package tests;

import main.Arquero;
import main.Escudo;
import main.Peleable;
import main.Puñal;
import main.Soldado;

import org.junit.Assert;
import org.junit.Test;
//import main.Caballero;
//import main.Capa;
//import main.Escudo;
//import main.Personaje;

public class TestArquero {

	@Test
	public void atacaASoldadoPelado() {

		Peleable a1 = new Arquero(10);
		Peleable s2 = new Soldado(13);

		a1.atacar(s2);
		Assert.assertEquals((Integer) 195, s2.getSalud());

	}

	@Test
	public void noAtacaPorEstarMuyCerca() {

		Peleable a1 = new Arquero(10);
		Peleable s2 = new Soldado(11);

		a1.atacar(s2);
		Assert.assertEquals((Integer) 200, s2.getSalud());

	}

	@Test
	public void noAtacaPorEstarMuyLejos() {

		Peleable a1 = new Arquero(10);
		Peleable s2 = new Soldado(20);

		a1.atacar(s2);
		Assert.assertEquals((Integer) 200, s2.getSalud());

	}

	@Test
	public void seQuedaSinFlechas() {

		Peleable a1 = new Arquero(10);
		Peleable s2 = new Soldado(13);

		for (int i = 0; i < 30; i++) {
			a1.atacar(s2);
		}

		Assert.assertEquals((Integer) 100, s2.getSalud());

	}

	@Test
	public void recargaFlechas() {

		Peleable a1 = new Arquero(10);
		Peleable s2 = new Soldado(13);

		for (int i = 0; i < 30; i++) {
			a1.atacar(s2);
		}
		Assert.assertEquals((Integer) 100, s2.getSalud()); // Fechas iniciales
															// de arq = 20 ->
															// 100 daño

		((Arquero) a1).recargarFlechas();// Arq recarga 6 flechas -> 30 daño
		for (int i = 0; i < 30; i++) {
			a1.atacar(s2);
		}
		Assert.assertEquals((Integer) 70, s2.getSalud()); // Soldado inicial=
															// 200 salud - 130 =
															// 70

	}

	// NO ANDA SOLDADO CON ESCUDO
	@Test
	public void atacaASoldadoConEscudo() {

		Peleable a1 = new Arquero(3);
		Peleable s2 = new Soldado(0);

		s2 = new Escudo(s2);
		a1.atacar(s2);
		a1.atacar(s2);

		Assert.assertEquals((Integer) 196, s2.getSalud());

	}

	@Test
	public void atacaConPuñalASoldadoPelado() {

		Peleable a1 = new Arquero(3);
		Peleable s2 = new Soldado(0);

		a1 = new Puñal(a1);
		a1.atacar(s2);

		Assert.assertEquals((Integer) 192, s2.getSalud());

	}

	@Test
	public void atacaAArqueroDosVeces() {

		Peleable a1 = new Arquero(3);
		Peleable a2 = new Arquero(0);

		a1.atacar(a2);
		a1.atacar(a2);

		Assert.assertEquals((Integer) 40, a2.getSalud());

	}

}
