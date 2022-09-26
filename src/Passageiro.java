
public class Passageiro implements Usuario {
    private String nome;
    private String CPF;
    private String destino;
    private double avaliacoesMotoristas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void informarDestino(){
        System.out.println("Cinema");
    }
    public void realizarPagamento(){
        System.out.println("Pago");
    }

    public Passageiro() {
        this.destino = destino;
        this.avaliacoesMotoristas = avaliacoesMotoristas;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getAvaliacoesMotoristas() {
        return avaliacoesMotoristas;
    }

    @Override
    public float getSalario() {
        return -1;
    }

    @Override
    public float getAvaliacoesPassageiros() {
        return -1;
    }

    public void setAvaliacoesMotoristas(double avaliacoesMotoristas) {
        this.avaliacoesMotoristas = avaliacoesMotoristas;
    }



    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + " CPF=" + CPF +  " destino='" + destino + '\'' + ", avaliacoesMotoristas=" + avaliacoesMotoristas + '}';
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCPF() {
        return CPF;
    }
}
