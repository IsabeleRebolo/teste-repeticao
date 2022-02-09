import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner ler=new Scanner(System.in);

        int soma=0;
        int n=0;
        int media=0;
        int i;

        for (i = 1; i<=10; i++) {

            System.out.println("Digite um número:");
            n=ler.nextInt();

            soma += n;
            media=(soma)/i;
        }

        System.out.println("A soma dos números é:" + soma + "e a média é:" + media);



    }
}
