public class Moto implements Veiculo {
    private String placa;
    private String cor;
    private boolean duasRodas;
    private boolean capaceteExtra;

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Moto() {
        this.duasRodas = duasRodas;
        this.capaceteExtra = capaceteExtra;
    }

    public boolean isDuasRodas() {
        return duasRodas;
    }

    public void setDuasRodas(boolean duasRodas) {
        this.duasRodas = duasRodas;
    }

    public boolean isCapaceteExtra() {
        return capaceteExtra;
    }

    public void setCapaceteExtra(boolean capaceteExtra) {
        this.capaceteExtra = capaceteExtra;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", duasRodas=" + duasRodas +
                ", capaceteExtra=" + capaceteExtra +
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
        return false;
    }

    @Override
    public boolean getDuasRodas() {
        return duasRodas;
    }

    @Override
    public boolean getPresencaEstepe() {
        return false;
    }

    @Override
    public boolean getCapaceteExtra() {
        return capaceteExtra;
    }
}
