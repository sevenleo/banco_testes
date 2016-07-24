package banco;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class BancoEspacoEntrada {

	
	
	public int[][] temposrandom(int clientes, int chegadas, int atendimentos){
		Random sorte = new Random();
		
		int[][] tempos = new int[clientes][2];
		for (int i = 0; i < clientes; i++) {
			tempos[i][0] = sorte.nextInt(chegadas);
			tempos[i][1] = sorte.nextInt(atendimentos);
			//System.out.println(tempos[i][0] + " " + tempos[i][1]);
		}
		
		return tempos;
	}
	
	
	
	// caixas < 0
	// retorno esperado 0, o codigo nao espera valores de entrada fora dos limites
	@Test
	public void caixasmenor0() {
		int[][] tempos = {{ 1, 1 }};
		int result = Banco.banco(-1, 1, tempos);
		assertEquals(0, result);
	}
	
	
	
	// clientes < 0
	// retorno esperado 0, o codigo nao espera valores de entrada fora dos limites
	@Test
	public void clientesmenor0() {
		int[][] tempos = null;
		int result = Banco.banco(1, -1, tempos);
		assertEquals(0, result);
	}

	
	
	// caixas > 10
	// retorno esperado depende dos valores de tempos, 
	//o codigo nao espera valores de entrada fora dos limites
	@Test
	public void caixasmaior10() {
		int[][] tempos = {{ 1, 1 }};
		int result = Banco.banco(20, 1, tempos);
		assertEquals(0, result);
	}
	
	
	
	// clientes > 1000
	// retorno esperado depende dos valores de tempos,
	//o codigo nao espera valores de entrada fora dos limites
	@Test
	public void clientesmaior1000() {
		int caixas = 2;
		int clientes = 1010;
		int[][] tempos = temposrandom(clientes,20,5);
		int result = Banco.banco(caixas, clientes, tempos);
		System.out.println(result);
		assertTrue(result>900);
	}
	
	
	
	//caixas=clientes
	@Test
	public void iguais() {
		int[][] tempos = { { 1, 2 }, { 1, 2 }, { 3, 4 } };
		int result = Banco.banco(3, 3, tempos);
		assertEquals(0, result);
	}
	
	
	
	//caixas<clientes
	@Test
	public void maisclientes() {
		int[][] tempos = { { 1, 2 }, { 1, 2 }, { 3, 4 } };
		int result = Banco.banco(1, 3, tempos);
		assertEquals(0, result);
	}
	
	
	
	//caixas>clientes
	@Test
	public void maiscaixas() {
		int clientes = 20;
		int caixas = clientes + new Random().nextInt(clientes);
		int result = Banco.banco(caixas, clientes, temposrandom(clientes,20,15));
		assertEquals(0, result);
	}
	
}
