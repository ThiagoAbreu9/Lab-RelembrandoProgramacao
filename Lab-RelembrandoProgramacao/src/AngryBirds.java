import java.util.Scanner;
public class AngryBirds {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double vzero = teclado.nextDouble();
		double angulo = teclado.nextDouble();
		double distancia = teclado.nextDouble();
		angulo = 2*angulo;
		double alcancemaximo;
		alcancemaximo = Math.pow(vzero,2);
		angulo = Math.sin(angulo);
		angulo = Math.round(angulo);
		double g = 9.8;
		
		alcancemaximo = alcancemaximo*angulo;
		alcancemaximo = alcancemaximo/g;
		alcancemaximo = Math.round(alcancemaximo);
		if (alcancemaximo == Math.round(distancia)) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}
		
	}
		}