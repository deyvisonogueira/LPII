package Lista01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double HP, LP, HA, LA, qtd;

        System.out.println("Altura da parede: ");
        HP = scan.nextDouble();
        System.out.println("Largura da parede: ");
        LP = scan.nextDouble();
        System.out.println("Altura do azuleijo: ");
        HA = scan.nextDouble();
        System.out.println("Largura do azuleijo: ");
        LA = scan.nextDouble();

        qtd = (HP * LP) / (HA * LA);

        System.out.printf("São necessários %.0f azuleijos para cobrir a parede", qtd);		
    }
}
