public class Jogador {
    private int id;
    private String role;
    private int pontuacaoHabilidade;

    public Jogador(int id, String role, int pontuacaoHabilidade) {
        this.id = id;
        this.role = role;
        this.pontuacaoHabilidade = pontuacaoHabilidade;
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

    public String getNome() {
        return "Jogador " + id;
    }

    public static void adicionarJogador(Matchmaking matchmaking, Utils u) {
        String nome = u.lerTexto("Nome: ");
        int id = u.lerInt("ID: ");
        String role = u.lerTexto("Role (carregador, tanker, suporte ou mago): ");
        int pontuacaoHabilidade = u.lerInt("Pontuação de Habilidade: ");
        matchmaking.adicionarJogadorEmEspera(nome, id, role, pontuacaoHabilidade);
    }
}