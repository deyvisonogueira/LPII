public class Cliente {
    private String nome;
    private String CPF;
    private String RG;
    public Caminhoneiro caminhoneiro1;
    public Viagem viagem1;
    public Carreta carreta1;

    public Cliente(String nome, Caminhoneiro caminhoneiro1, Viagem viagem1, Carreta carreta1) {
        this.nome = nome;
        this.caminhoneiro1 = caminhoneiro1;
        this.viagem1 = viagem1;
        this.carreta1 = carreta1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public Caminhoneiro getCaminhoneiro1() {
        return caminhoneiro1;
    }

    public void setCaminhoneiro1(Caminhoneiro caminhoneiro1) {
        this.caminhoneiro1 = caminhoneiro1;
    }

    public Viagem getViagem1() {
        return viagem1;
    }

    public void setViagem1(Viagem viagem1) {
        this.viagem1 = viagem1;
    }

    public Carreta getCarreta1() {
        return carreta1;
    }

    public void setCarreta1(Carreta carreta1) {
        this.carreta1 = carreta1;
    }

    public void visualizarViagem() {
        System.out.println("Cliente: " + this.nome);
        System.out.println("Motorista: " + this.caminhoneiro1.getNome());
        System.out.println("Veículo: " + this.carreta1.getModeloCarreta());
        System.out.println("Destino: " + this.viagem1.getDestino());
        System.out.println("Valor KM: " + this.viagem1.getValorKM() + " Distancia: " + this.viagem1.getDistancia());
        System.out.println("Valor total viagem: " + this.viagem1.getValorViagem());
    }

}
