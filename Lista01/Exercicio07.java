package Lista01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double b1, b2, b3, b4, media;

        System.out.println("Nota primeiro bimestre: ");
        b1 = scan.nextDouble();
        System.out.println("Nota segundo bimestre: ");
        b2 = scan.nextDouble();
        System.out.println("Nota terceiro bimestre: ");
        b3 = scan.nextDouble();
        System.out.println("Nota quarto bimestre: ");
        b4 = scan.nextDouble();
        media = (b1 + b2 + b3 + b4) / 4.00;
        System.out.printf("A média é: %.2f \n", media);

        if(media <= 3.49){
            System.out.println("Reprovado =(");
        }
        else if(media >= 3.5 && media <= 6.49){
            System.out.println("Recuperação, foco!");
        }
        else if (media >= 6.5){
            System.out.println("Aprovado!");
        }
}
}
