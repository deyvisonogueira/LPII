package Lista01;
    
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rendaContribuinte, valorAPagar;

        System.out.println("Qual é a renda do contribuinte?");
        rendaContribuinte = scan.nextDouble();

        if(rendaContribuinte > 10800 && rendaContribuinte <= 21600){
            valorAPagar = (rendaContribuinte * 0.15) - 1620;
            System.out.printf("IRPF Simples a ser pago é de R$%.2f", valorAPagar);
        }
        else if(rendaContribuinte >= 21600.01){
            valorAPagar = (rendaContribuinte * 0.275) - 4320;
            System.out.printf("IRPF Simples a ser pago é de R$%.2f", valorAPagar);
        }
        else if (rendaContribuinte <= 10800){
            System.out.printf("Contribuinte insento do pagamento.");
        }
}
}