public class Teste {
    public static void main(String[] args) {
        Carreta c1 = new Carreta("Preta", "ct-700");
        Caminhoneiro ca1 = new Caminhoneiro("João Alves", "123456789", "123.456.789.10", 5000.0);
        Viagem v1 = new Viagem("São Paulo", 4.5, 350);
        Cliente cli1 = new Cliente("Pedro", ca1, v1, c1);

        v1.calcularViagem();
        cli1.visualizarViagem();
    }
}
