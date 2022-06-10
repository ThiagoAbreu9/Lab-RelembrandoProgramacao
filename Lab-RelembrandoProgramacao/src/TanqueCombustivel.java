import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class TanqueCombustivel {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double raio = teclado.nextDouble();
		double x = teclado.nextDouble();
		int num = teclado.nextInt();
		double pi = Math.PI;
		double volumeC;
		volumeC = (pi/3.0)* Math.pow(x, 2)*(3*raio-x);
		double volumeE;
		volumeE = (4.0/3.0)*pi*Math.pow(raio, 3);
		
		if (num == 1) {
			System.out.printf("%.4f",volumeC);
		}
		if (num == 2) {
			volumeE = volumeE - volumeC;
			System.out.printf("%.4f", volumeE);
		}
	}
}