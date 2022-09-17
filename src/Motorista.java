public class Motorista extends Usuario{
    private float salario;
    private float avaliacoesPassageiros;

    public void dirigir(){
        System.out.println("dirigi");
    }
    public void manterVeiculoDentroDosPadroesDeSegurança(){
        System.out.println("mantive");
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getAvaliacoesPassageiros() {
        return avaliacoesPassageiros;
    }

    public void setAvaliacoesPassageiros(float avaliacoesPassageiros) {
        this.avaliacoesPassageiros = avaliacoesPassageiros;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "salario=" + salario +
                ", avaliacoesPassageiros=" + avaliacoesPassageiros +
                '}';
    }
}
