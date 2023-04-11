public class No {
    private String nome;
    private int id;
    private String role;
    private int pontuacaoHabilidade;
    private No proximo;

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public int getPontuacaoHabilidade() {
        return pontuacaoHabilidade;
    }

    public No getProximo() {
        return proximo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPontuacaoHabilidade(int pontuacaoHabilidade) {
        this.pontuacaoHabilidade = pontuacaoHabilidade;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
