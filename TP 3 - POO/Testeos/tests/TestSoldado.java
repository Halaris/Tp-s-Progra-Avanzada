package tests;

import org.junit.Assert;
import org.junit.Test;

//import main.Caballero;
import main.Capa;
import main.Escudo;
import main.Peleable;
//import main.Personaje;
import main.Puñal;
import main.Soldado;


public class TestSoldado {
	
	@Test
	public void soldadoPeladoAtacaSoldadoPelado()
	{
		Peleable s1 = new Soldado(0);
		Peleable s2 = new Soldado(0);
		s1.atacar(s2);
		Assert.assertEquals((Integer)190, s2.getSalud());
	}
	
	@Test
	public void soldadoPeladoAtacaSoldadoConEscudo()
	{
		Peleable s1 = new Soldado(0);
		Peleable s2 = new Soldado(0);
		s2 = new Escudo(s2);
		s1.atacar(s2);
		Assert.assertEquals((Integer)196, s2.getSalud());
	}
	
	@Test
	public void soldadoPeladoAtacaSoldadoConCapa()
	{
		Peleable s1 = new Soldado(0);
		Peleable s2 = new Soldado(0);
		s2 = new Capa(s2);
		s1.atacar(s2);
		Assert.assertEquals((Integer)190, s2.getSalud());
			
	}
	
//	@Test
//	public void capaDuplicaEnergia(){
//		Peleable s1 = new Soldado(0);
//		Peleable s2 = new Soldado(0);
//		
//		
//		for(int i = 0; i<5; i++){
//			s1.atacar(s2);
//		}
//		s1 = new Capa(s1);
//		
//		Assert.assertEquals((Integer)100, ((Soldado)s1).getEnergia());
//		
//	}
	
	@Test
	public void soldadoPeladoAtacaSoldadoConPuñal()
	{
		Peleable s1 = new Soldado(0);
		Peleable s2 = new Soldado(0);
		s2 = new Puñal(s2);
		s1.atacar(s2);
		Assert.assertEquals((Integer)187, s2.getSalud());
	}
	
	@Test
	public void soldadoConPuñalAtacaSoldadoPelado()
	{
		Peleable s1 = new Soldado(0);
		Peleable s2 = new Soldado(0);
		s1 = new Puñal(s1);
		s1.atacar(s2);
		Assert.assertEquals((Integer)187, s2.getSalud());
	}
	
	@Test
	public void soldadoConPuñalAtacaSoldadoConEscudo() {
		
		Peleable s1 = new Soldado(0);
		Peleable s2 = new Soldado(0);
		s1 = new Puñal(s1);
		s2 = new Escudo(s2);
		s1.atacar(s2);
		Assert.assertEquals((Integer)195, s2.getSalud());
		
	}
	
	
	@Test
	public void atacaDosVecesLuegoTomaAgua() {
		
		Peleable s1 = new Soldado(0);
		Peleable s2 = new Soldado(0);
		s1.atacar(s2);
		s1.atacar(s2);

		Assert.assertEquals((Integer)80, ((Soldado)s1).getEnergia());
		((Soldado)s1).darPocionDeAgua(20);
		Assert.assertEquals((Integer)100, ((Soldado)s1).getEnergia());
	}

	@Test
	public void noTieneAlcanceParaAtacar() {
		Peleable s1 = new Soldado(0);
		Peleable s2 = new Soldado(10);
		
		s1.atacar(s2);
		
		Assert.assertEquals((Integer)200, s2.getSalud());
		
	}
	
	@Test
	public void seQuedaSinEnergiaParaAtacar() {
		Peleable s1 = new Soldado(0);
		Peleable s2 = new Soldado(0);
		
		for(int i = 0;i<15; i++){
			s1.atacar(s2);
		}
		
		Assert.assertNotEquals((Integer)50, s2.getSalud());
		
	}
	
	

}
