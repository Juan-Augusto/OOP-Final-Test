public class Carro implements Veiculo{
    private boolean quatroRodas;
    private boolean presencaEstepe;

    public Carro(boolean quatroRodas, boolean presencaEstepe) {
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
    public String getPlaca() {
        return null;
    }

    @Override
    public String getCor() {
        return null;
    }
}
