public class No {
    private Jogador jogador;
    private No anterior;
    private No proximo;

    public No(Jogador jogador) {
        this.jogador = jogador;
        this.anterior = null;
        this.proximo = null;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    // outros getters e setters que você possa precisar
}
