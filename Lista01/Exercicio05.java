package Lista01;

import java.util.Scanner;

public class Exercicio05{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double peso, altura;
      String sexo;
      double imc;

      System.out.println("\n>>Calcule o seu IMC<<\n");


      System.out.printf("Seu peso (Kg): ");
      peso = scan.nextDouble();
      System.out.printf("Sua altura (metro): ");
      altura = scan.nextDouble();
      System.out.printf("Informe o seu sexo (M - Mulher) ou (H - Homem): ");
      sexo = scan.next();
      imc = peso/(altura * altura);
      System.out.println("Seu IMC é: " + imc); 

      if(sexo.equals('M') && imc < 19.1){
      }
      else if(imc < 20.7){
        System.out.println("\nEstá abaixo do peso");
      }
      else if(sexo.equals('M') && imc >= 19.1 && imc <= 25.8){
      }
      else if(imc >=20.7 && imc <= 26.4){
        System.out.println("\nEstá com peso ideal");
      }
      else if( imc > 25.8){
        System.out.println("\nObesidade");
      }
      else {
        System.out.println("Valor informado é inválido.");
      }

   }     
}