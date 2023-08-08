import java.util.Scanner;

public class RotaOrtodromica {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double latitude;
		latitude = scan.nextDouble();
		double longitude = scan.nextDouble();
		double latitude2 = scan.nextDouble();
		double longitude2 = scan.nextDouble();
		
		double latitudeemrad = Math.toRadians(latitude);
		double longitudeemrad = Math.toRadians(longitude);
		double latitude2emrad = Math.toRadians(latitude2);
		double longitude2erad = Math.toRadians(longitude2);
		double r = 6371.00;
		double result;
		result = Math.sin(latitudeemrad) * Math.sin(latitude2emrad)
				* Math.cos(latitudeemrad) * Math.cos(latitude2emrad)
				* Math.cos(longitudeemrad - longitude2erad);
		result = Math.acos(result);
		result = result * r;
		System.out.print("A distancia entre os pontos (" 
		+ latitude + ", " + longitude + ") e (" + latitude2+ ", ");
		System.out.printf("%.6f", longitude2);
		System.out.printf(") e de %.2f",result);
		System.out.println(" km");
		
	}
}
