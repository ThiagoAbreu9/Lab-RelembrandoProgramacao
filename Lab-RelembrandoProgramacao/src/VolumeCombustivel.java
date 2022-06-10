import java.util.Scanner;
public class VolumeCombustivel {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double altura = teclado.nextDouble();
		double nivel = teclado.nextDouble();
		double raio = teclado.nextDouble();
		double pi = Math.PI;
		double volumeEsfera = (4.0/3.0)*pi * Math.pow(raio, 3)/2;
		double volumeCilindro = pi*Math.pow(raio,2) * (nivel-raio);
		double volumeTotal= 0;
		if(altura>0) {
			if(altura>nivel & nivel <= altura-raio & nivel>=raio) {
				volumeTotal = volumeCilindro + volumeEsfera;
				System.out.printf("%.3f",volumeTotal);
			}
			if(nivel<raio) {
				volumeEsfera = (pi/3.0)*Math.pow(nivel, 2)*(3*raio-nivel);
				System.out.printf("%.3f",volumeEsfera);
				}
			if(altura==nivel) {
				volumeEsfera = volumeEsfera/2;
				volumeTotal = volumeEsfera+volumeCilindro+volumeEsfera;
				System.out.print(volumeTotal);
		}}
		else {
			System.out.print("-1.000");
		}
		}
		}