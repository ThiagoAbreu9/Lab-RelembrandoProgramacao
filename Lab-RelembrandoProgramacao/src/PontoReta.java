import java.util.Scanner;
public class PontoReta {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float num = teclado.nextFloat();
		float y = teclado.nextFloat();
		
		float result;
		result = 3;
		if (2*num + y == result){
			System.out.printf("Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.",num,y);
			}
		else {
					System.out.printf("Ponto (%.1f, %.1f) nao pertence a reta 2x + y = 3.",num,y);
			}
}
}
