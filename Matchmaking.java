import java.util.Scanner;

public class Matchmaking {
    private No primeiroJogadorEmEspera;
    private Utils u = new Utils();
    
    public Matchmaking() {
        primeiroJogadorEmEspera = null;
    }

    public void adicionarJogadorEmEspera(String nome, int id, String role, int pontuacaoHabilidade) {
        No novoJogador = new No();
        novoJogador.setNome(nome);
        novoJogador.setId(id);
        novoJogador.setRole(role);
        novoJogador.setPontuacaoHabilidade(pontuacaoHabilidade);
        
        if (primeiroJogadorEmEspera == null) {
            primeiroJogadorEmEspera = novoJogador;
        } else {
            No ultimoJogador = encontrarUltimoJogador();
            ultimoJogador.setProximo(novoJogador);
        }
        
        u.imprimirTexto("Jogador " + nome + " adicionado com sucesso!");
    }

    public void verJogadoresEmEspera() {
        No atual = primeiroJogadorEmEspera;
        
        if (atual == null) {
            u.imprimirTexto("Não há jogadores em espera.");
            return;
        }
        
        while (atual != null) {
            u.imprimirTexto("ID: " + atual.getId() + ", Role: " + atual.getRole() + ", Pontuação de Habilidade: " + atual.getPontuacaoHabilidade());
            atual = atual.getProximo();
        }
    }

    public void verPartidasEmAndamento() {
        //implementar método
    }

    public void sair() {
        u.imprimirTexto("Saindo...");
    }
    
    private No encontrarUltimoJogador() {
        No atual = primeiroJogadorEmEspera;
        
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }
        
        return atual;
    }
}