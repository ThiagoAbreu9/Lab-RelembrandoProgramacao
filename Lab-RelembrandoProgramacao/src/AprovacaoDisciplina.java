import java.util.*;
public class AprovacaoDisciplina {
	public static void main(String[] args) {

		int presenca = 0, aprovado = 0, reprovadoNota = 0, reprovadoPresenca = 0;

		Scanner kb = new Scanner(System.in);

		double entradaNotas = 0;
		ArrayList<Double> notas = new ArrayList<Double>();
		
		while (entradaNotas > -1) {
			entradaNotas = kb.nextDouble();
			if (entradaNotas > -1) {
				notas.add(entradaNotas);
			}
		}

		ArrayList<Integer> presente = new ArrayList<Integer>();
		
		while (presenca > -1) {
			presenca = kb.nextInt();
			if (presenca > -1) {
				presente.add(presenca);
			}
		}

		if (presente.size() == notas.size()) {
			int horas = kb.nextInt();

			Double cargaHoraria = 0.75 * horas;

			for (int i = 0; i < notas.size(); i++) {
				if (notas.get(i) >= 5 && presente.get(i) >= cargaHoraria) {
					aprovado++;
				}

				if (presente.get(i) < cargaHoraria) {
					reprovadoPresenca++;
				}

				if (notas.get(i) < 5 && presente.get(i) >= cargaHoraria) {
					reprovadoNota++;
				}
			}

			System.out.printf("%d %d %d", aprovado, reprovadoNota, reprovadoPresenca);
		}
	}
}