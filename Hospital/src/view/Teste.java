package view;

import java.util.Scanner;
import model.*;

public class Teste {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de internações: ");
    int n = scanner.nextInt(); 

    Internacao[] internacoes = new Internacao[n];

    
    for (int i = 0; i < n; i++) {
      scanner.nextLine();
      System.out.println("*** Internação " + (i+1) + " ***");

      System.out.print("Motivo: ");
      String motivo = scanner.nextLine();

      System.out.println("Paciente:");
      System.out.print("Nome: ");
      String nomePaciente = scanner.nextLine();
      
      System.out.print("Idade: ");
      int idadePaciente = scanner.nextInt();
      scanner.nextLine();
      
      System.out.print("CPF: ");
      String cpfPaciente = scanner.nextLine();
      Paciente paciente = new Paciente(nomePaciente, idadePaciente, cpfPaciente);

      System.out.println("Médico:");
      System.out.print("Nome: ");
      String nomeMedico = scanner.nextLine();
      System.out.print("CRM: ");
      String crmMedico = scanner.nextLine();
      Medico medico = new Medico(nomeMedico, crmMedico);

      System.out.println("Enfermeiro:");
      System.out.print("Nome: ");
      String nomeEnfermeiro = scanner.nextLine();
      Enfermeiro enfermeiro = new Enfermeiro(nomeEnfermeiro);

      System.out.print("Nº Identificador: ");
      int id = scanner.nextInt();

      System.out.print("Valor diário: ");
      int valorDia = scanner.nextInt();

      System.out.print("Quantidade de dias: ");
      int qtdDias = scanner.nextInt();
      scanner.nextLine(); 
      
        System.out.println("Valor total de todas internações: ");
        double valorTotal = qtdDias * valorDia;

      Internacao internacao = new Internacao(data, motivo, paciente, medico, enfermeiro, id, valorDia, qtdDias, valorTotal);
      internacoes[i] = internacao;
    }

    
    for (int i = 0; i < n; i++) {
      System.out.println("*** Internação " + (i+1) + " ***");
      System.out.println("Paciente: " + internacoes[i].getPaciente1().getNome());
      System.out.println("Médico: " + internacoes[i].getMedico1().getNome());
      System.out.println("Enfermeiro: " + internacoes[i].getEnfermeiro1().getNome());
      System.out.println("Nº Identificador: " + internacoes[i].getId());
      System.out.println("Motivo: " + internacoes[i].getMotivo());  
      System.out.println("Valor da diária: " + internacoes[i].getValorDia());
      System.out.println (internacoes[i].getQtdDias() + "Quantidade de dias de internação: ");
      System.out.println("Valor total da internacao: " + internacoes[i].getQtdDias()* internacoes[i].getValorDia());
         
    }
  }
}
