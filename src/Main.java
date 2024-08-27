import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    static void validarContagem(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

    }
    static void analisarCandidato(double randomValor, double valorBase, int i, ArrayList<Candidato> candidatosSelecionados){
        if(randomValor < valorBase){
            System.out.println("Ligar para candidato: " + i + " | Salário pretendido: " + randomValor);
             Candidato novoCandidato = new Candidato(i,randomValor);
             candidatosSelecionados.add(novoCandidato);

        } else if(randomValor == valorBase){
            System.out.println("Ligar com contra proposta para candidato: " + i + " | Salário pretendido: " + randomValor);
            Candidato novoCandidato = new Candidato(i,randomValor);
            candidatosSelecionados.add(novoCandidato);
        } else{
            System.out.println( i + " - Valor acima do esperado | Salário pretendido: " + randomValor );
        }
    }
    static void entrarEmContato(Candidato candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = candidato.atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }
        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu){
            System.out.println("Contato realizado com: " + candidato.dadosCandidato() + " na " + tentativasRealizadas + " tentativa.");
        }else{
            System.out.println("Não conseguimos contato com: " + candidato.dadosCandidato());
        }

    }




    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        double valorBase = 2000;

        ArrayList<Candidato> candidatosSelecionados = new ArrayList<>();

        try {
            validarContagem(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++){
            double randomValor = Math.random() * (3000 - 1000 + 1) + 1000;
            analisarCandidato(randomValor, valorBase, i, candidatosSelecionados);
        }

        System.out.println("-----------------------------\nLista de Candidatos Selecionados");
        for(Candidato candidato : candidatosSelecionados){
            System.out.println(candidato.dadosCandidato());
        }
        System.out.println("-----------------------------\nEntrando em contato:");

        for (Candidato candidato : candidatosSelecionados){
            entrarEmContato(candidato);
        }



    }

}
