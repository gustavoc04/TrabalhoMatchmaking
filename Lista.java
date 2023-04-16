public class Lista {
    private No cabeca;
    private int tamanho;

    public Lista() {
        this.cabeca = new No();
        cabeca.setProximo(cabeca);
        cabeca.setAnterior(cabeca);
        this.tamanho = 0;
    }

    public void addPrimeiro(String jogador) {
        No novo = new No();
        novo.setNome(jogador);
        novo.setProximo(cabeca.getProximo());
        novo.setAnterior(cabeca);
        cabeca.getProximo().setAnterior(novo);
        cabeca.setProximo(novo);
        tamanho += 1;
    }

    public void addUltimo(String jogador) {
        if (tamanho == 0) {
            addPrimeiro(jogador);
        } else {
            No novo = new No();
            novo.setNome(jogador);
            novo.setProximo(cabeca);
            novo.setAnterior(cabeca.getAnterior());
            cabeca.getAnterior().setProximo(novo);
            cabeca.setAnterior(novo);
            tamanho++;
        }
    }

    public void removerPrimeiro() {
        if (tamanho == 0) {
            System.out.println("ainda n existem jogadores");
        } else {
            No primeiro = cabeca.getProximo();
            cabeca.setProximo(primeiro.getProximo());
            primeiro.getProximo().setAnterior(cabeca);
            tamanho--;
        }
    }

    public void printLista() {
        if (tamanho != 0) {
            for (No atual = cabeca.getProximo(); atual != cabeca; atual = atual.getProximo()) {
                System.out.println(atual.getNome());
            }
        }
    }
}