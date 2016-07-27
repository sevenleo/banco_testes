
////////////// TESTES //////////////


package banco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BancoParesArcosTest {

	/** 
	 * 1 ≤ C ≤ 10 Numero de caixas
	 * 1 ≤ N ≤ 1000 Numero de clientes
	 * 0 ≤ T ≤ 300 Momento cliente entra na fila
	 * 1 ≤ D ≤ 10 Tempo para atender o cliente
	 */

	// [1,3]
	@Test
	public void teste1() {
		int[][] tempos = {{ 1, 1 }};
		int result = Banco.banco(1, 1, tempos);
		assertEquals(0, result);
	}

	// [1,2,4,5,7,8,11,13,4,6]
	@Test
	public void teste2() {
		int[][] tempos = { { 1, 2 }, { 1, 2 } };
		int result = Banco.banco(2, 2, tempos);
		assertEquals(0, result);
	}

	// [1,2,4,5,7,8,10,13,4,5,7,8,10,13,4,6]
	@Test
	public void teste3() {
		int[][] tempos = { { 1, 2 }, { 1, 2 }, { 3, 4 } };
		int result = Banco.banco(1, 3, tempos);
		assertEquals(0, result);
	}

	// [1,2,4,5,7,9,8,11,13,4,5,7,8,11,13,4,6]
	@Test
	public void teste4() {
		int[][] tempos = { { 1, 2 }, { 4, 2 }, { 5, 2 } };
		int result = Banco.banco(2, 3, tempos);
		assertEquals(0, result);
	}

	// [1,2,4,5,7,8,10,13,4,5,7,8,10,13,4,5,7,8,10,12,13,4,6]
	@Test
	public void teste5() {
		int[][] tempos = { { 30, 1 }, { 30, 10 }, { 30, 10 }, { 30, 1 } };
		int result = Banco.banco(1, 4, tempos);
		assertEquals(1, result);
	}
	
	/**
	 * Teste criados depois para matar os mutantes restantes
	 */
	
	//matar "41: changed conditinal boundary"
	// O ultimo cliente {2,10} chega no tempo 2, mas só será atendido no tempo 22 (20 depois de sua chegada)
	// E como a condição era se (atendimento - tempos[i][0] > 20) foi mudada para (atendimento - tempos[i][0] >= 20)
	// Ele entrará nesse if e mudará o cont para 1 no mutante, enquanto no original ele não entraria, continuando cont=0
	@Test
	public void teste6() {
		int[][] tempos = { { 1, 10 }, { 1, 10 }, { 2, 1 }, { 2, 10 }};
		int result = Banco.banco(1, 4, tempos);
		assertEquals(0, result);
	}
	
	//matou "21: removed call to collections.sort
	@Test
	public void teste7() {
		int[][] tempos = {{0,5}, {0, 2}, {3, 9}, {4, 4}, {4, 8}, {4, 8}, {4, 9}, {4, 5}, {4, 1}};
		int result = Banco.banco(2, 9, tempos);
		assertEquals(1, result);
	}
	
	//matou "33: changed increment from -1 to 1
	//matou "34: replaced integer addition with subtraction
	@Test
	public void teste8() {
		int[][] tempos = {{0,5}, {0, 8}, {0, 9}, {1, 10}, {1, 10}, {2, 7}, {2, 4}};
		int result = Banco.banco(2, 7, tempos);
		assertEquals(1, result);
	}

}



