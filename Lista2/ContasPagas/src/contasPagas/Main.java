package contasPagas;

public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Deyvison", "118.222.666-44");
        Cliente cli2 = new Cliente("Maria Oliveira", "555.444.333-22");
        Produto pro1 = new Produto("Camiseta", 35.00);
        Produto pro2 = new Produto("Shorts", 90.00);
        Conta c1 = new Conta(1, "10/11/2024", "11/01/2024", pro1, cli1);
        Conta c2 = new Conta(2, "20/02/2023", "21/02/2023", pro2, cli2);

        c1.visualizarConta();
        System.out.println("-------------------");
        c2.visualizarConta();
    }
}