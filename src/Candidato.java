import java.util.Random;

// Classe auxiliar para armazenar as informações do candidato
public class Candidato {
    int indice;
    double valorPretendido;

    Candidato(int indice, double valorPretendido) {
        this.indice = indice;
        this.valorPretendido = valorPretendido;
    }

    public int getIndice() {
        return indice;
    }

    public double getValorPretendido() {
        return valorPretendido;
    }

    public boolean atender(){
        return new Random().nextInt(3)==1;
    }

    public String dadosCandidato() {
        return "Candidato " + indice + " | Salário pretendido: " + valorPretendido;
    }
}
