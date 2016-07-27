package banco;

import static org.junit.Assert.*;

import org.junit.Test;

public class BancoAllDefs {

	
////I
////[1,2,4,5,7,8,10,13,4,6]
//	@Test
//	//matou 20changed
//	//matou 20changed
//	//matou 41negated
//	//matou 46replaced
//	public void i() {
//		int[][] tempos = { { 0, 9 }, { 0, 10 }, { 4, 2 },{ 5, 2 }, { 7, 10 } };
//		int result = Banco.banco(2, 5, tempos);
//		assertEquals(0, result);
//	}
//	
//	@Test
//	//matou 20changed
//	//matou 20changed
//	//matou 41negated
//	//matou 41replaced
//	//matou 46replaced
//	public void i2() {
//		int[][] tempos = { { 0, 9 }, { 4, 8 },{ 5, 2 }};
//		int result = Banco.banco(1, 3, tempos);
//		assertEquals(0, result);
//	}
//
//
//	@Test
//	//matou  11
//	//matou  25
//	//matou  27
//	//matou  33
//	//matou  34
//	//matou  42
//	public void i3() {
//		int[][] tempos = { { 0, 9 }, { 4, 8 }};
//		int result = Banco.banco(1, 2, tempos);
//		assertEquals(0, result);
//	}

//CONT
//[1,2,4,5,7,8,10,12,13,4,6]
//	@Test
//	//matou 10,16,18,20,20,20,23,32,32,39,41,42,46 // nao da pra usar esse rs
//	public void cont() {
//		int[][] tempos = { { 0, 10 }, { 0, 5 }, { 1, 9 }, { 2, 2 } };
//		int result = Banco.banco(1, 4, tempos);
//		assertEquals(1, result);
//	}
	@Test
	public void cont2() {
		int[][] tempos = { { 0, 10 }, { 0, 10 }, { 0, 2 },{ 1, 2 } };
		int result = Banco.banco(1, 4, tempos);
		assertEquals(1, result);
	}

	
	
//ATENDIMENTO
//[1,2,4,5,7,8,10,12,13,4,6]
//  Ja percorrido anteriormente	
	
//CAIXAS
//[1,2,4,5,7,9,8,10,13,4,6]
//  Ja percorrido anteriormente

	
//[1,2,4,5,7,8,11,13,4,5,7,9,8,10,13,4,6]
	
	
	

//TERMINA
//[1,2,4,5,7,8,10,13,4,6]
//  Ja percorrido anteriormente
	
//[1,2,4,5,7,8,10,13,4,5,7,8,10,13,4,6]
//  Ja percorrido anteriormente
	
//[1,2,4,5,7,8,11,13,4,5,7,8,10,13,4,6]
//  Ja percorrido anteriormente

	
//[1,2,4,5,7,9,7,8,10,13,4,6]
	
	
//[1,2,4,5,7,9,8,10,13,4,6]

	
	

	
	

	
	

	
	
//C
//coberto automaticamente por qualquer outro caminho
	
	
//N
//coberto automaticamente por qualquer outro caminho
	
	
//TEMPOS
//coberto automaticamente por qualquer outro caminho
	

}
