public class Carro implements Veiculo{
    private String placa;
    private String cor;
    private boolean quatroRodas;
    private boolean presencaEstepe;

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Carro() {
        this.quatroRodas = quatroRodas;
        this.presencaEstepe = presencaEstepe;
    }

    public boolean isQuatroRodas() {
        return quatroRodas;
    }

    public void setQuatroRodas(boolean quatroRodas) {
        this.quatroRodas = quatroRodas;
    }

    public boolean isPresencaEstepe() {
        return presencaEstepe;
    }

    public void setPresencaEstepe(boolean presencaEstepe) {
        this.presencaEstepe = presencaEstepe;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", quatroRodas=" + quatroRodas +
                ", presencaEstepe=" + presencaEstepe +
                '}';
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public boolean getQuatroRodas() {
        return quatroRodas;
    }

    @Override
    public boolean getDuasRodas() {
        return false;
    }

    @Override
    public boolean getPresencaEstepe() {
        return presencaEstepe;
    }

    @Override
    public boolean getCapaceteExtra() {
        return false;
    }
}
