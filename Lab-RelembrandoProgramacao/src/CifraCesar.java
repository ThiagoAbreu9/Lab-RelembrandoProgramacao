import java.util.Scanner;

public class CifraCesar {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
	    int senha = kb.nextInt();
	    String texto = kb.nextLine();

	    String cifrado = "";
	    char alfabeto;

	    for (int i = 1; i < texto.length(); i++) {
	      alfabeto = texto.charAt(i);
	      if (alfabeto >= 'a' && alfabeto <= 'z') {
	        alfabeto = (char)(alfabeto + senha);
	        if (alfabeto > 'z') {
	          alfabeto = (char)(alfabeto + 'a' - 'z' - 1);
	        }
	        cifrado = cifrado + alfabeto;
	      }
	      else if (alfabeto >= 'A' && alfabeto <= 'Z') {
	        alfabeto = (char)(alfabeto + senha);
	        if (alfabeto > 'Z') {
	          alfabeto = (char)(alfabeto + 'A' - 'Z' - 1);
	        }
	        cifrado = cifrado + alfabeto;
	      } else {
	        cifrado = cifrado + alfabeto;
	      }
	    }
	    System.out.print(cifrado.toUpperCase());
	}
}