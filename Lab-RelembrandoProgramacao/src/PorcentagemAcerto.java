import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Vector;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[30];
        int resposta = scanner.nextInt();
        int acertos = 0;
        int totalQuestoes = 0;
        int i=0;
        
        while (resposta != -1) {
        	vetor[i] = resposta;
            totalQuestoes++;
            resposta = scanner.nextInt();
            i++;
        }
        
        int gabarito[] = new int[30];
        
        resposta = scanner.nextInt();
        i = 0;
        
        while (resposta != -1) {
        	gabarito[i] = resposta;
            resposta = scanner.nextInt();
            i++;
        }
        
        for(int j=0;j<totalQuestoes;j++) {
        	if(vetor[j] == gabarito[j]) {
        		acertos++;
        	}
        }
        
        double porcentagemacerto = acertos*100.0/totalQuestoes*1.00;
        
        System.out.printf("%.2f\n", porcentagemacerto);
 
        /*for(i=0;i<gabarito.length;i++) {
        	System.out.print(gabarito[i]);
        }*/
    }
}
