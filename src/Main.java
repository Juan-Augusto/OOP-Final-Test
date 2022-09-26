import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int usuarioI, veiculoI;
        float somaNotasPassageiros = 0;
        float somaNotasMotoristas = 0;
        float mediaNotasPassageiros = 0;
        float mediaNotasMotoristas = 0;
        int qtdVeiculosPretos = 0;
        ArrayList<Passageiro> passageiro = new ArrayList<>();
        ArrayList<Motorista> motorista = new ArrayList<>();
        ArrayList<Carro> carro = new ArrayList<>();
        ArrayList<Moto> moto = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        passageiro.clear();
        motorista.clear();
        carro.clear();
        moto.clear();
        usuarios.clear();
        veiculos.clear();

        try{
            FileReader arq = new FileReader("entrada1.txt");
            FileReader arq2 = new FileReader("entrada2.txt");
            BufferedReader arqReader = new BufferedReader(arq);
            BufferedReader arq2Reader = new BufferedReader(arq2);
            String data, data2;
            try{
                data = arqReader.readLine();
                data2 = arq2Reader.readLine();
                while (data != null) {
                    String[] info = data.split(",");
                    Passageiro passageiro1 = new Passageiro();
                    Motorista motorista1 = new Motorista();
                    if (Objects.equals(info[info.length - 1], "passageiro")){
                        passageiro1.setNome(info[0]);
                        passageiro1.setCPF(info[1]);
                        passageiro1.setDestino(info[2]);
                        passageiro1.setAvaliacoesMotoristas(Double.parseDouble(info[3]));
                        passageiro.add(passageiro1);
                        usuarios.add(passageiro1);
                    }else{
                        motorista1.setNome(info[0]);
                        motorista1.setCPF(info[1]);
                        motorista1.setSalario(Float.parseFloat(info[2]));
                        motorista1.setAvaliacoesPassageiros(Float.parseFloat(info[3]));
                        motorista.add(motorista1);
                        usuarios.add(motorista1);
                    }
                    data = arqReader.readLine();
                }
                while (data2 != null){
                    String[] info2 = data2.split(",");
                    Carro carro1 = new Carro();
                    Moto moto1 = new Moto();
                    if(Objects.equals(info2[info2.length - 1], "carro")){
                        carro1.setPlaca(info2[0]);
                        carro1.setCor(info2[1]);
                        carro1.setQuatroRodas(Boolean.parseBoolean(info2[2]));
                        carro1.setPresencaEstepe(Boolean.parseBoolean(info2[3]));
                        carro.add(carro1);
                        veiculos.add(carro1);
                    }else{
                        moto1.setPlaca(info2[0]);
                        moto1.setCor(info2[1]);
                        moto1.setDuasRodas(Boolean.parseBoolean(info2[2]));
                        moto1.setCapaceteExtra(Boolean.parseBoolean(info2[3]));
                        moto.add(moto1);
                        veiculos.add(moto1);
                    }
                    data2 = arq2Reader.readLine();
                }
                arq.close();
//                System.out.println(passageiro);
//                System.out.println(motorista);
//                System.out.println(carro);
//                System.out.println(moto);
//                System.out.println(usuarios);
//                System.out.println(veiculos);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            System.out.println("Erro: Arquivo inexistente no caminho declarado");
        }
        for (usuarioI = 0; usuarioI < passageiro.toArray().length + motorista.toArray().length; usuarioI++) {
            if(usuarios.get(usuarioI).getAvaliacoesPassageiros() != -1.0){
                somaNotasPassageiros = somaNotasPassageiros + usuarios.get(usuarioI).getAvaliacoesPassageiros();
            }else if(usuarios.get(usuarioI).getAvaliacoesMotoristas() != -1.0){
                somaNotasMotoristas = (float) (somaNotasMotoristas + usuarios.get(usuarioI).getAvaliacoesMotoristas());
            }
        }
        if(motorista.toArray().length > 0){
            mediaNotasMotoristas = somaNotasMotoristas / motorista.toArray().length;
            System.out.println(mediaNotasMotoristas);
        }else{
            System.out.println("Nenhum motorista cadastrado, impossível calcular média");
        }
        if (passageiro.toArray().length > 0){
            mediaNotasPassageiros = somaNotasPassageiros / passageiro.toArray().length;
            System.out.println(mediaNotasPassageiros);
        }else{
            System.out.println("Nenhum passageiro cadastrado, impossível calcular média");
        }

        for(veiculoI = 0; veiculoI < moto.toArray().length + carro.toArray().length; veiculoI++){
            if (Objects.equals(veiculos.get(veiculoI).getCor(), "Preto")){
                qtdVeiculosPretos = qtdVeiculosPretos + 1;
            }
        }
        System.out.println(qtdVeiculosPretos);

        try{
            FileWriter usuariosMedia = new FileWriter("resultado1.txt");
            FileWriter veiculosPretos = new FileWriter("resultado2.txt");
            PrintWriter gravMedia = new PrintWriter(usuariosMedia);
            PrintWriter gravVeiculosPretos = new PrintWriter(veiculosPretos);
            gravMedia.append("Media de avaliações de passageiros: " + mediaNotasPassageiros + " Média de avaliações motoristas: " + mediaNotasMotoristas + ".");
            gravVeiculosPretos.append("Foram cadastrados " + qtdVeiculosPretos + " veículos pretos.");
            gravMedia.close();
            gravVeiculosPretos.close();
            return;
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}