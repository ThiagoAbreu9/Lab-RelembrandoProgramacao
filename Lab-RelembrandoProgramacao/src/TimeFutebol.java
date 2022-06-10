import java.util.Scanner;
public class TimeFutebol {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		int n = 6;
		int time[] = new int[n];
		int i=0;
		int adversario[] = new int[n];
		int numV = 0;
		int numE = 0;
		int numD = 0;
		while(num!=-1) {
			time[i] = num;
			i = i+1;
			num = teclado.nextInt();
		}
		i = 0;
		num = teclado.nextInt();
		while(num!=-1) {
			adversario[i] = num;
			num = teclado.nextInt();
			i= i+1;
		}
		
		for(i=0;i<6;i++) {
			if (time[i]>adversario[i]) {
				numV = numV+1;
			}
			else if(time[i]==adversario[i]) {
				numE = numE+1;
			}
			else if(time[i]<adversario[i]) {
				numD = numD+1;
			}
		}
		System.out.printf("%d ",numV);
		System.out.printf("%d ",numE);
		System.out.print(numD);

		
	}
	
}