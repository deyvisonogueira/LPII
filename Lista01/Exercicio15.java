package Lista01;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
      int i;
      String n;
      String invertido = "";
      
      System.out.println("Informe um número");
      n = scan.next();

      for (i = n.length() - 1; i >= 0; i--){
        invertido += n.substring(i, i+1);
      }
      if(invertido.equals(n)){
        System.out.println(n + " é um número capicuas.");
      }
      else{
        System.out.println(n + " não é um número capicuas." );
      }
    }
}