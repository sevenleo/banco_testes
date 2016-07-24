package banco;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class BancoCoberturaLogica {

	
//if (n <= c)
	@Test
	public void if1menor() {
		int[][] tempos = {{1,1},{2,3},{3,6}};
		int result = Banco.banco(3, 3, tempos);
		assertEquals(0, result);
	}
	@Test
	public void if1igual() {
		int[][] tempos = {{1,1},{2,3},{3,6}};
		int result = Banco.banco(3, 3, tempos);
		assertEquals(0, result);
	}
	
//else
	@Test
	public void if1else() {
		int[][] tempos = {{1,1},{2,3},{3,6}};
		int result = Banco.banco(1, 3, tempos);
		assertEquals(0, result);
	}

	
	
//for (int i = 1; i < n; i++)
	//sempre sera coberto ? 
	//o mutante i<=n devera causar erro de segmentation fault 

	
	
//while (termina.get(0) <= tempos[i][0])

	
	

//if (termina.isEmpty())


	
	
//if (caixas > 0)


	
	
//if (atendimento - tempos[i][0] > 20)

	
	
	

}
