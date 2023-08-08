import java.util.*;

public class TimeFutebol {
	public static void main(String[] args) {

		int nGols = 0, vitorias = 0, derrotas = 0, empates = 0;

		ArrayList<Integer> time = new ArrayList<Integer>();
		ArrayList<Integer> contratime = new ArrayList<Integer>();

		Scanner kb = new Scanner(System.in);

		while (nGols != -1) {
			nGols = kb.nextInt();
			if (nGols != -1) {
				time.add(nGols);
			}
		}

		nGols = 0;
		while (nGols != -1 && contratime.size() < time.size()) {
			nGols = kb.nextInt();
			if (nGols != -1) {
				contratime.add(nGols);
			}
		}

		for (int i = 0; i < time.size(); i++) {
			if (time.get(i) == contratime.get(i)) {
				empates++;
			}
			if (time.get(i) > contratime.get(i)) {
				vitorias++;
			}
			if (time.get(i) < contratime.get(i)) {
				derrotas++;
			}
		}

		System.out.printf("%d %d %d\n", vitorias, empates, derrotas);

	}
}