package banco;

import java.util.Scanner;

public class main {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Caixas?");
		int c = scanner.nextInt();
		System.out.println("Clientes?");
		int n = scanner.nextInt();
		
		int[][] tempos = new int[n][2];

		for (int i = 0; i < n; i++){
			System.out.println("Chega do Cliente "+i);
			tempos[i][0] = scanner.nextInt();
			System.out.println("Tempo de atendimento?");
			tempos[i][1] = scanner.nextInt();
		}
		
		System.out.println(Banco.banco(c, n, tempos));
		
		scanner.close();		
	}

}
