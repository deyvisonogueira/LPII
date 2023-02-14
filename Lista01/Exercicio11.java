package Lista01;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double qtdDiasComCarro, km, valorAPagar;

        System.out.println("Quantos dias ficou com o carro?");
        qtdDiasComCarro = scan.nextDouble();
        System.out.println("Quantos km rodou?");
        km = scan.nextDouble();
        
        if(km >60){
        valorAPagar = (qtdDiasComCarro * 45) + ((km - qtdDiasComCarro * 60) * 0.5);
        System.out.printf("O valor total a se pagar é de R$%.2f", valorAPagar);
        }
        else if(km <60){
         valorAPagar = (qtdDiasComCarro * 45) + ((km - qtdDiasComCarro) * 0.5);
         System.out.printf("O valor total a se pagar é de R$%.2f", valorAPagar);
        }
    }
}
