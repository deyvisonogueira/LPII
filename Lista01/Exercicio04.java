package Lista01;
import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double cotacao_dolar = 5.10, 
    valor_dolar,
    valor_real;

    System.out.print("Conversor de dólar em real\n\n");

    System.out.print("Digite o valor em dolar: ");
    valor_dolar = scan.nextDouble();

    valor_real = cotacao_dolar * valor_dolar;

    System.out.printf("O Valor em reais é " +valor_real + "\n");

  }

}