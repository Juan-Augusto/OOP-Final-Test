public class Passageiro extends Usuario{
    private String destino;
    private double avaliacoesMotoristas;

    public void informarDestino(){
        System.out.println("Cinema");
    }
    public void realizarPagamento(){
        System.out.println("Pago");
    }

    public Passageiro(String destino, double avaliacoesMotoristas) {
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

    public void setAvaliacoesMotoristas(double avaliacoesMotoristas) {
        this.avaliacoesMotoristas = avaliacoesMotoristas;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "destino='" + destino + '\'' +
                ", avaliacoesMotoristas=" + avaliacoesMotoristas +
                '}';
    }
}
