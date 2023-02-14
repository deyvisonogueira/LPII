package Lista01;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        String palavra;
        int cont = 0;

        System.out.println("Informe uma palavra: ");
        palavra = scan.next();

        while (i < palavra.length()){
            if(palavra.substring(i, i+1 ).equals("a") || palavra.substring(i, i+1).equals("A")){
                cont++;
            }
            break;
        }
        System.out.println(cont);
    }
    
}
