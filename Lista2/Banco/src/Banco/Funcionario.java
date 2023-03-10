package Banco;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String RG;
    private boolean ativo;

    public double bonifica (double aumento){
        return salario + aumento;
    }

    public boolean demite(){
        return ativo = false;
    }
    public Funcionario(String nome, String departamento, double salario, String dataEntrada, String RG) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.RG = RG;
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void mostra(){
        System.out.println("O nome do funcioário é: " + this.getNome());
        System.out.println("O departamento: " + this.getDepartamento());
        System.out.println("O salário é: " + this.getSalario());
        System.out.println("O salário após a bonificação é: " + this.bonifica(salario));
        System.out.println("A data de entrada deste funcionário foi: " + this.getDataEntrada());
        System.out.println("O documento RG é o: " + this.getRG());
        System.out.println("Este funcionário está ativo na empresa?" + isAtivo());
        System.out.println("Funcionário demitido? " + this.demite());
    }
}
