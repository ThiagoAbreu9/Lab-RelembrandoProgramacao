
import java.util.*;

public class RaizDois {

	static double raiz(int N) {

		return N == 0 ? 1.0 : 1.0 / (2.0 + raiz(N - 1));
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int entrada = kb.nextInt();
		for (int n = 1; n <= entrada; n++) {
			System.out.printf("%.14f\n", 1.0 + raiz(n));
		}
	}

}