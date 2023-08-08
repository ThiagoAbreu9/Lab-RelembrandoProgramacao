import java.util.Scanner;

// This code was created to exercice java
public class IdadeUfam{
    public static void main(String[] args){
       int nasceUfam = 1909;
       Scanner tec = new Scanner(System.in);
       int ano = tec.nextInt();

       int idade = ano-nasceUfam;

       System.out.print("A UFAM tem ");
       System.out.printf("%d", idade);
       System.out.print(" anos de fundacao");
}
}