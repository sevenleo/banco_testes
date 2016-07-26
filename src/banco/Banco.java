package banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

	public static int banco(int QtdadeCaixas, int QtdadeClientes, int[][] tempos) {
		/*if (tempos.length != QtdadeClientes) {
			System.out.println("Péraí");
			System.out.println(QtdadeClientes);
			System.out.println(tempos.length);
		}
		*/
		if (QtdadeClientes <= QtdadeCaixas) {
			return 0;
		} else {
			int cont = 0;

			List<Integer> termina = new ArrayList<Integer>();
			termina.add(tempos[0][0] + tempos[0][1]);

			int caixas = QtdadeCaixas - 1;

			for (int i = 1; i < QtdadeClientes; i++) {
				Collections.sort(termina);

				while (termina.get(0) <= tempos[i][0]) {
					termina.remove(0);
					caixas = caixas + 1;

					if (termina.isEmpty()) {
						break;
					}
				}

				if (caixas > 0) {
					caixas = caixas - 1;
					termina.add(tempos[i][0] + tempos[i][1]);
				} else {
					Integer atendimento = Collections.min(termina);
					termina.remove(atendimento);

					termina.add(atendimento + tempos[i][1]);

					if (atendimento - tempos[i][0] > 20) {
						cont = cont + 1;
					}
				}
			}
			return cont;
		}
	}
}
