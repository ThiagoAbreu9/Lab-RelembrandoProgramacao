import java.util.*;

public class DiaSemana {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int[] semana = { 0, 0, 0, 0, 0, 0, 0 };
		
		int hora = kb.nextInt();
		
		int maior = 0;
		
		int dia = 0;

		while (hora != -1) {
			dia = dia == 7 ? 0 : dia;
			semana[dia] = hora + semana[dia];
			maior = semana[dia] > maior ? semana[dia] : maior;
			hora = kb.nextInt();
			dia++;
		}
		
		for (dia = 0; dia < 7; dia++) {
			if (maior == semana[dia])
				System.out.println(dia + 1);
		}
	}
}