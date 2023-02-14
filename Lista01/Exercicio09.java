package Lista01;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double areaTotal, areaConstruida, areaNConstruida, valorAPagar;

        System.out.println("Insira a área total do terreno (m2): ");
        areaTotal = scan.nextDouble();
        System.out.println("Insira a área construída (m2): ");
        areaConstruida = scan.nextDouble();
        areaNConstruida = areaTotal -  areaConstruida;
        valorAPagar = (areaConstruida * 5) + (areaNConstruida * 3.8);

        System.out.printf("O valor total a se pagar é de R$ %.2f", valorAPagar);
    }
}
