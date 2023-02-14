package Lista01;

import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra;
        int i;
        int cont =0;
        
        System.out.println("Digite uma palavra: ");
        palavra = scan.next();

        for (i = 0; i < palavra.length(); i++){
            if(palavra.substring(i,i+1).equals("a") || palavra.substring(i,i+1).equals("A")){
                    cont++;
                }
            }
    System.out.print(cont);
        }
    }