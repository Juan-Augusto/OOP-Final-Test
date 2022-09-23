import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArrayList<Passageiro> passageiro = new ArrayList<>();
        ArrayList<Motorista> motorista = new ArrayList<>();

        passageiro.clear();
        try{
            FileReader arq = new FileReader("entrada1.txt");
            BufferedReader arqReader = new BufferedReader(arq);
            String data;
            try{
                data = arqReader.readLine();
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
                        System.out.println(passageiro1);
                    }else{
                        motorista1.setNome(info[0]);
                        motorista1.setCPF(info[1]);
                        motorista1.setSalario(Float.parseFloat(info[2]));
                        motorista1.setAvaliacoesPassageiros(Float.parseFloat(info[3]));
                        System.out.println(motorista1);
                    }
                    data = arqReader.readLine();
                }
                arq.close();
                System.out.println(passageiro);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            System.out.println("Erro: Arquivo inexistente no caminho declarado");
        }


    }
}