import java.util.Scanner;

public class NumeroNeperiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double k = sc.nextDouble();
        sc.close();

        double resultado = calcularNeperiano(k);
        System.out.printf("%.6f%n", resultado);
    }

    public static double calcularNeperiano(double k) {
        double neperiano = 1.0;
        double termo = 1.0;

        for (int i = 1; i <= k; i++) {
            termo /= i;
            neperiano += termo;
        }

        return neperiano;
    }
}
