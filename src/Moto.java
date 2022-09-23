public class Moto implements Veiculo {
    private boolean duasRodas;
    private boolean capaceteExtra;

    public Moto(boolean duasRodas, boolean capaceteExtra) {
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
    public String getPlaca() {
        return null;
    }

    @Override
    public String getCor() {
        return null;
    }
}
