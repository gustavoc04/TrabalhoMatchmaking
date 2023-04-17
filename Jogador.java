import java.io.Serializable;

public class Jogador implements Serializable {
    private String nome;
    private int id;
    private String role;
    private int pontuacao;

    public Jogador(String nome, int id, String role, int pontuacao) {
        this.nome = nome;
        this.id = id;
        this.role = role;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
