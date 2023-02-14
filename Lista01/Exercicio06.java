package Lista01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double C, L;
        double A;
        double P;

        System.out.println("\n>>Calculando area e perimetro do retangulo<<\n");

        System.out.printf("Insira o comprimento: ");
        C = scan.nextDouble();
        System.out.printf("Insira a largura: ");
        L = scan.nextDouble();
        A = C * L;
        P = (2 * C) + (2 * L);
        System.out.println("A area do retangulo é: " + A);
        System.out.println("O perimetro do rentangulo é: " + P);
    }
}
