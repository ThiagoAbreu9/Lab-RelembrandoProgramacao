import java.util.*;

public class AproximacaoSeno {

    static double Fatorial (int n) {
        double fatorial;
        fatorial = n;
        while (n>1) {
            fatorial = fatorial * (n-1);
            n--;
        }
        return fatorial;
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num;
        num = scan.nextInt();
        double x = Math.toRadians(num);
        int n;
        n = scan.nextInt();

        double seno = 0;
        //System.out.printf("%.10f\n", x);
        for (int i=0;i<n;i++) {
            int variable = 2*i + 1;

            if (i%2==0) {
                // x = x - ((Math.pow(x, variable))/Fatorial(variable));
                seno += ((Math.pow(x, variable))/Fatorial(variable));
                // variable = variable+2;
                System.out.printf("%.10f\n", seno);
            }
            else{
                //x = x + ((Math.pow(x, variable))/Fatorial(variable));
                seno -= ((Math.pow(x, variable))/Fatorial(variable));
                // variable = variable + 2 ;
                System.out.printf("%.10f\n", seno);
            }
        }
    }
}