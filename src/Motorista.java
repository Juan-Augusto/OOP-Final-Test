public class Motorista implements Usuario{
    private String nome;
    private String CPF;
    private float salario;
    private float avaliacoesPassageiros;

    public void dirigir(){
        System.out.println("dirigi");
    }
    public void manterVeiculoDentroDosPadroesDeSegurança(){
        System.out.println("mantive");
    }

    public Motorista() {
        this.salario = salario;
        this.avaliacoesPassageiros = avaliacoesPassageiros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
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
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", salario=" + salario +
                ", avaliacoesPassageiros=" + avaliacoesPassageiros +
                '}';
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCPF() {
        return CPF;
    }

    @Override
    public String getDestino() {
        return null;
    }

    @Override
    public double getAvaliacoesMotoristas() {
        return -1;
    }
}
