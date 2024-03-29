public class Viagem {
    private String destino;
    private double valorKM;
    private double valorViagem;
    private double distancia;
    
    public Viagem(String destino, double valorKM, double distancia) {
        this.destino = destino;
        this.valorKM = valorKM;
        this.distancia = distancia;
    }
    
    public void calcularViagem () {
        this.valorViagem = this.distancia * this.valorKM;
    }

    public double getValorViagem () {
        return this.valorViagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValorKM() {
        return valorKM;
    }

    public void setValorKM(double valorKM) {
        this.valorKM = valorKM;
    }

    public void setValorViagem(double valorViagem) {
        this.valorViagem = valorViagem;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    
}
