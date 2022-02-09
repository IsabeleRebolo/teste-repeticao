import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        int media=0;
        int soma=0;
        int i=0;

        Scanner ler = new Scanner(System.in);


        do{
            System.out.print("Digite um número:");
            n= ler.nextInt();
            i++;

            soma += n;
            media = (soma)/i;

        }while  (i<=10);

            System.out.println("Sua soma é:" + soma + "Sua média é:" + media);






    }
}
