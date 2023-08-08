import java.util.*;

public class DistanciaAviao {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int tabela[][] = { { 0, 2, 11, 6, 15, 11, 1 }, { 2, 0, 7, 12, 4, 2, 15 }, { 11, 7, 0, 11, 8, 3, 13 },
				{ 6, 12, 11, 0, 10, 2, 1 }, { 15, 4, 8, 10, 0, 5, 13 }, { 11, 2, 3, 2, 5, 0, 14 },
				{ 1, 15, 13, 1, 13, 14, 0 } };
		
		int somaIntervalos = 0;

		int intervalo1 = kb.nextInt(), intervalo2;
		while (intervalo1 != -1) {

			intervalo2 = kb.nextInt();
			if (intervalo2 == -1)
				break;

			somaIntervalos += tabela[((intervalo1 / 111) - 1)][((intervalo2 / 111) - 1)];
			intervalo1 = intervalo2;

		}

		System.out.printf("%d", somaIntervalos);

	}
}