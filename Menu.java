import java.util.Scanner;

public class Menu {
    private ListaDuplamenteEncadeada lista;
    private ArquivoJogadores arquivo;
    private static Utils u = new Utils();


    public Menu(String caminhoArquivo) {
        arquivo = new ArquivoJogadores(caminhoArquivo);
        lista = arquivo.lerJogadores();
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 4) {
            u.imprimirTexto("Selecione uma opção:");
            u.imprimirTexto("1. Adicionar jogador");
            u.imprimirTexto("2. Ver jogadores em espera");
            u.imprimirTexto("3. Ver partidas em andamento");
            u.imprimirTexto("4. Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    u.imprimirTexto("Informe o ID do jogador:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consumir quebra de linha
                    u.imprimirTexto("Informe o nome do jogador:");
                    String nome = scanner.nextLine();
                    u.imprimirTexto("Informe a role do jogador:");
                    String role = scanner.nextLine();
                    u.imprimirTexto("Informe a pontuação de habilidade do jogador:");
                    int habilidade = scanner.nextInt();
                    Jogador novoJogador = new Jogador(nome, id, role, habilidade);
                    lista.adicionar(novoJogador);
                    arquivo.salvarJogadores(lista);
                    u.imprimirTexto("Jogador adicionado com sucesso.");
                    break;
                case 2:
                    // Implementar opção 2
                    break;
                case 3:
                    // Implementar opção 3
                    break;
                case 4:
                    u.imprimirTexto("Encerrando programa.");
                    break;
                default:
                    u.imprimirTexto("Opção inválida.");
                    break;
            }
        }
        scanner.close();
    }
}
