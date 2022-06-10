import java.util.Scanner;
public class AreaVolume {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num = teclado.nextDouble();
		double pi;
		pi = Math.PI;
		double area;
		area = pi * Math.pow(num, 2);
		
		double volume;
		volume = (4.0/3.0) *pi * Math.pow(num, 3);
		
		System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n", num, area);
		System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.", num, volume);
	}
}
