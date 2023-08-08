import java.util.Scanner;

class TipoTriangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public TipoTriangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean ehTriangulo() {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            return false;
        }
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }

    public String tipo() {
        if (!ehTriangulo()) {
            return "invalido";
        }
        if (lado1 == lado2 && lado1 == lado3) {
            return "equilatero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "isosceles";
        } else {
            return "escaleno";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double lado1 = sc.nextDouble();
            double lado2 = sc.nextDouble();
            double lado3 = sc.nextDouble();

            TipoTriangulo triangulo = new TipoTriangulo(lado1, lado2, lado3);
            System.out.println(triangulo.tipo());
        } catch (Exception e) {
            System.out.println("Entrada inválida. Certifique-se de que você digitou números válidos para as medidas dos lados.");
        } finally {
            sc.close();
        }
    }
}
