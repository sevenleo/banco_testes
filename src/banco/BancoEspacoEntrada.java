package banco;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class BancoEspacoEntrada {

	
	
	int[][] temposrandom(int clientes){
		Random sorte = new Random();
		
		int[][] tempos = new int[clientes][2];
		for (int i = 0; i < clientes; i++) {
			tempos[i][0] = sorte.nextInt(101);
			tempos[i][1] = sorte.nextInt(11);
			//System.out.println(tempos[i][0] + " " + tempos[i][1]);
		}
		
		return tempos;
	}
	

	//com espera menor do que 20
	@Test
	public void testemenos() {
		int[][] tempos = {{1,10},{10,10}};
		int result = Banco.banco(1, 2, tempos);
		assertEquals(0, result);
	}
	
	//com espera igual a 20
	@Test
	public void testeigual() {
		int[][] tempos = {{0,10},{0,10},{0,1}};
		int result = Banco.banco(1, 3, tempos);
		assertEquals(0, result);
	}
	
	//com espera maior do que 20
	@Test
	public void testemais() {
		int[][] tempos = {{1,7},{1,7},{1,7},{1,10}};
		int result = Banco.banco(1, 4, tempos);
		assertEquals(1, result);
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
//	@Test
//	public void clientesmenor0() {
//		int[][] tempos = null;
//		int result = Banco.banco(1, -1, tempos);
//		assertEquals(0, result);
//	}

	
	
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
		int[][] tempos = temposrandom(clientes);
		int result = Banco.banco(caixas, clientes, tempos);
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
	
	//caixas<clientes com espera
	@Test
	public void maisclientes_com_espera() {
		int[][] tempos = { { 0, 10 }, { 0, 10 }, { 3, 8 } ,{4,5}};
		int result = Banco.banco(1, 4, tempos);
		assertEquals(1, result);
	}
	
	
	//caixas>clientes
	@Test
	public void maiscaixas() {
		int clientes = 20;
		int caixas = clientes + new Random().nextInt(clientes);
		int result = Banco.banco(caixas, clientes, temposrandom(clientes));
		assertEquals(0, result);
	}
	
}
