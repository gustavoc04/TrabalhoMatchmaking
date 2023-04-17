import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ListaDuplamenteEncadeada {
    private No primeiro;
    private No ultimo;
    private int tamanho = 0;

    public void adicionar(Jogador jogador) {
        if (contem(jogador)) {
            System.out.println("O jogador " + jogador.getNome() + " já está na lista.");
            return;
        }

        No novoNo = new No(jogador);

        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            ultimo.setProximo(novoNo);
            novoNo.setAnterior(ultimo);
            ultimo = novoNo;
        }

        tamanho++;
    }

    public boolean contem(Jogador jogador) {
        No noAtual = primeiro;
        while (noAtual != null) {
            Jogador jogadorAtual = noAtual.getJogador();
            if (jogadorAtual.getNome().equals(jogador.getNome()) && jogadorAtual.getId() == jogador.getId()) {
                return true;
            }
            noAtual = noAtual.getProximo();
        }
        return false;
    }

    public void removerPorNome(String nome) {
        No noAtual = primeiro;
        while (noAtual != null) {
            Jogador jogador = noAtual.getJogador();
            if (jogador.getNome().equals(nome)) {
                No anterior = noAtual.getAnterior();
                No proximo = noAtual.getProximo();
                if (anterior == null) {
                    primeiro = proximo;
                } else {
                    anterior.setProximo(proximo);
                }
                if (proximo == null) {
                    ultimo = anterior;
                } else {
                    proximo.setAnterior(anterior);
                }
                tamanho--;
                return;
            }
            noAtual = noAtual.getProximo();
        }
    }

    public void removerPorId(int id) {
        No noAtual = primeiro;
        while (noAtual != null) {
            Jogador jogador = noAtual.getJogador();
            if (jogador.getId() == id) {
                No anterior = noAtual.getAnterior();
                No proximo = noAtual.getProximo();
                if (anterior == null) {
                    primeiro = proximo;
                } else {
                    anterior.setProximo(proximo);
                }
                if (proximo == null) {
                    ultimo = anterior;
                } else {
                    proximo.setAnterior(anterior);
                }
                tamanho--;
                return;
            }
            noAtual = noAtual.getProximo();
        }
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
