
import java.util.*;
public class DataExtenso {
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		String data = kb.next();
		
		String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		
		String dia = data.substring(0, 2);
		String mesString = data.substring(2, 4);
		String  ano = data.substring(4, 8);
		
		int mes = Integer.parseInt(mesString);
		
		System.out.print(dia + " de " + meses[mes-1] + " de " + ano);
	}
	

}