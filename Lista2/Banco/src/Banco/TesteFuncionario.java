package Banco;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Deyvison", "Suporte Técnico", 2000, "10 de maio de 2022", "17452204");

        f1.bonifica(200);

        f1.mostra();
    
    }
    
}
