public class Veiculo {
    private String placa;
    private String cor;

    public void ligar(){
        System.out.println("ligado");
    }
    public void desligar(){
        System.out.println("Desligado");
    }
    public void acelerar(){
        System.out.println("acelerei");
    }
    public void frear(){
        System.out.println("Freei");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
