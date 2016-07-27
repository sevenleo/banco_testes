package banco;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class BancoEspacoEntrada {

	
	

	//F1b1 (1<=caixas<=10)
	@Test
	public void com_espera() {
		int[][] tempos = { { 0, 10 }, { 0, 10 }, { 3, 8 } ,{4,5}};
		int result = Banco.banco(1, 4, tempos);
		assertEquals(1, result);
	}

		
	//F1b2 (caixas>10)
	//Impossível - Restrição das entradas do problema

	// retorno esperado depende dos valores de tempos, 
	//o codigo nao espera valores de entrada fora dos limites
	@Test
	public void caixasmaior10() {
		int[][] tempos = {{ 1, 1 }};
		int result = Banco.banco(20, 1, tempos);
		assertEquals(0, result);
	}
		

		
	//F1b3 (caixas<1)
	//Impossível - Restrição das entradas do problema
		// retorno esperado 0, o codigo nao espera valores de entrada fora dos limites
		@Test
		public void caixasmenor0() {
			int[][] tempos = {{ 1, 1 }};
			int result = Banco.banco(-1, 1, tempos);
			assertEquals(0, result);
		}
		

	//F2b1  (1<=clientes<=1000
	@Test
	public void testeigual() {
		int[][] tempos = {{0,10},{0,10},{0,1}};
		int result = Banco.banco(1, 3, tempos);
		assertEquals(0, result);
	}

		
	//F2b2 (clientes>1000)
	//Impossível - Restrição das entradas do problema


	//F2b3 (clientes<1)
	//Impossível - Restrição das entradas do problema
	// retorno esperado 0, o codigo nao espera valores de entrada fora dos limites
	@Test
	public void clientesmenor0() {
		int[][] tempos = null;
		int result = Banco.banco(1, -1, tempos);
		assertEquals(0, result);
	}

		
	//F3b1 (caixas > clientes)
	@Test
	public void maiscaixas() {
		int[][] tempos = { { 1, 2 }, { 2, 3 }, { 3, 4 } };
		int result = Banco.banco(5, 3, tempos);
		assertEquals(0, result);
	}

	//F3b2 (caixas < clientes)
	public void test1() {
		int[][] tempos = {{1,2},{1,2}};
		int result = Banco.banco(1, 2, tempos);
		assertEquals(0, result);
	}
		
	//F3b3 (caixas == clientes)
	@Test
	public void iguais() {
		int[][] tempos = { { 1, 2 }, { 1, 2 }, { 3, 4 } };
		int result = Banco.banco(3, 3, tempos);
		assertEquals(0, result);
	}

}
