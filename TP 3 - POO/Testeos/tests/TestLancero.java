package tests;
import org.junit.Assert;
import org.junit.Test;

import main.Arquero;
import main.Caballero;
import main.Escudo;
import main.Lancero;
import main.Peleable;
//import main.Capa;
//import main.Personaje;
import main.Puñal;
import main.Soldado;

public class TestLancero {

	@Test
	public void noAtacaPorEstarMuyCerca(){
		Peleable l1 = new Lancero(10);
		Peleable l2 = new Lancero(10);
		
		l1.atacar(l2);
		
		Assert.assertEquals((Integer)150, l2.getSalud());
		
	}
	
	@Test
	public void atacaLanceroPelado(){
		Peleable l1 = new Lancero(10);
		Peleable l2 = new Lancero(11);
		
		l1.atacar(l2);
		
		Assert.assertEquals((Integer)125, l2.getSalud());
		
	}
	
	@Test
	public void noAtacaPorEstarMuyLejos(){
		Peleable l1 = new Lancero(10);
		Peleable l2 = new Lancero(15);
		
		l1.atacar(l2);
		
		Assert.assertEquals((Integer)150, l2.getSalud());
		
	}
	
	@Test
	public void conPuñalAtacaASoldadoPelado(){
		Peleable l1 = new Lancero(10);
		Peleable s2 = new Soldado(12);
		
		l1 = new Puñal(l1);
		l1.atacar(s2);
		
		Assert.assertEquals((Integer)172, s2.getSalud());
		
	}
	
	@Test
	public void conPuñalAtacaDosVecesACaballeroPelado(){
		Peleable l1 = new Lancero(10);
		Peleable c2 = new Caballero(12);
		
		l1 = new Puñal(l1);
		l1.atacar(c2);
		l1.atacar(c2);
		
		Assert.assertEquals((Integer)144, c2.getSalud());
		
	}
	
	@Test 
	public void mataACaballero(){
		Peleable l1 = new Lancero(10);
		Peleable c2 = new Caballero(12);
		
		for(int i=0; i<8; i++){
			l1.atacar(c2);
		}
		
		Assert.assertEquals((Integer)0, c2.getSalud());
	}
	
	@Test
	public void atacaConPuñalAArquero(){
		Peleable l1 = new Lancero(10);
		Peleable a2 = new Arquero(12);
		
		l1.atacar(a2);
		Assert.assertEquals((Integer)25, a2.getSalud());
		
	}
	
	@Test
	public void atacaASoldadoConEscudo(){
		Peleable l1 = new Lancero(0);
		Peleable s2 = new Soldado(2);
		
		s2 = new Escudo(s2);
		
		for(int i=0; i<4; i++){
			l1.atacar(s2);
		}
		Assert.assertEquals((Integer)160, s2.getSalud());
		
	}
	
}
