package banco;

import static org.junit.Assert.*;
import org.junit.Test;

public class BancoCoberturaLogica {

	
//if (n <= c)
	@Test //true - menor
	public void if1true() {
		int[][] tempos = {{1,1},{2,3},{3,6}};
		int result = Banco.banco(4, 3, tempos);
		assertEquals(0, result);
	}
	@Test //true - igual
	public void if1true2() {
		int[][] tempos = {{1,1},{2,3},{3,6}};
		int result = Banco.banco(3, 3, tempos);
		assertEquals(0, result);
	}
	
	@Test //false - n > c 
	public void if1false() {
		int[][] tempos = {{1,1},{2,3},{3,6}};
		int result = Banco.banco(1, 3, tempos);
		assertEquals(0, result);
	}

	
	
//for (int i = 1; i < n; i++)
//( i < n )
	@Test //true - o for sera percorrido ao menos uma vez quando n>=1
	public void fortrue() {
		int[][] tempos = {{1,1},{2,3},{3,6},{5,10},{9,9}};
		int result = Banco.banco(2, 5, tempos);
		assertEquals(0, result);
	}

	
	
	@Test //false - o for nao sera percorrido nenhuma vez se (n <= 1), ou seja, se houver um ou nenhum cliente (n=1)
	public void forfalse() {
		int[][] tempos = {{9,10}};
		int result = Banco.banco(1, 1, tempos);
		assertEquals(0, result);
	}
	
	
//while (termina.get(0) <= tempos[i][0])
	
	@Test //true - cliente nao espera caixa esvaziar
	public void whiletrue() {
		int[][] tempos = {{1,9},{11,1}};
		int result = Banco.banco(1, 2, tempos);
		assertEquals(0, result);
	}

	

	@Test //false - cliente esperando caixa esvaziar
	public void whilefalse() {
		int[][] tempos = {{0,10},{0,10},{0,10},{0,10},{2,9},{3,10},{4,2}};
		int result = Banco.banco(2, 7, tempos);
		assertEquals(1, result);
	}
	


//if (termina.isEmpty())
// para entrar no caso que testa se ha caixas ocupados é necessário criar uma fila
	@Test
	public void if2true() {
		int[][] tempos = {{0,10},{0,10},{0,10},{5,10}};
		int result = Banco.banco(1, 4, tempos);
		assertEquals(1, result);
	}
	

	
	
//if (caixas > 0)
//todos os  caixas ocupados
	@Test
	public void if3true() {
		int[][] tempos = {{10,1},{11,3},{15,1}};
		int result = Banco.banco(2, 3, tempos);
		assertEquals(0, result);
	}
	
	
//existem caixas livres	
	@Test
	public void if3false() {
		int[][] tempos = {{0,10},{0,10},{5,5}};
		int result = Banco.banco(2, 3, tempos);
		assertEquals(0, result);
	}
	
	
	
//if (atendimento - tempos[i][0] > 20)
	@Test // true - ocorreu algum atraso
	public void if4true() {
		int[][] tempos = {{0,10},{0,10},{5,5},{10,15},{11,10},{12,10},{12,10}};
		int result = Banco.banco(1, 7, tempos);
		assertEquals(3, result);
	}
	
	@Test // false - nao ocorreram atrasos
	public void if4false() {
		int[][] tempos = {{0,10},{0,10},{5,5},{10,15},{11,10},{12,10}};
		int result = Banco.banco(4, 6, tempos);
		assertEquals(0, result);
	}
	
	
	
	
	

}
