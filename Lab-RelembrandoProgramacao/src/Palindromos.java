import java.util.*;

public class Palindromos {
	public static void main(String[] args) {
		
		Boolean palindromo = true;
		
		Scanner kb = new Scanner(System.in);
		String texto = kb.nextLine();
		
		
		for (int t1 = 0, t2 = texto.length() - 1; t1 < (int) texto.length() / 2; t1++, t2--) {
			Character caractere1 = texto.charAt(t1);
			Character caractere2 = texto.charAt(t2);
			palindromo = caractere1.equals(caractere2) ? palindromo : false;
		}
		texto = texto.replaceAll(" ", "");
		texto = texto.toUpperCase();
		
		System.out.printf("%s %d", texto, palindromo ? 1 : 0);
	}
}