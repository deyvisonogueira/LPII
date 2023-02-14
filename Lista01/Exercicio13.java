package Lista01;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, d;
        double valorAPagar;

        System.out.println("Quantas pessoas querem o pacote?");
        n = scan.nextInt();
        System.out.println("Serão quantos dias?");
        d = scan.nextInt();

        if (n <= 4){
            valorAPagar = (160 * n) * d;
            System.out.printf("O valor total a se pagar é de R$%.2f", valorAPagar);
        }
        else if (n == 5 && n <=8){
            valorAPagar = (120 * n) * d;
            System.out.printf("O valor total a se pagar é de R$%.2f", valorAPagar);
        }
        else if(n > 8){
            valorAPagar = (80 * n) * d;
            System.out.printf("O valor total a se pagar é de R$%.2f", valorAPagar);
        }
        
    }
}