import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static Matchmaking matchmaking = new Matchmaking();
    private static Utils u = new Utils();

    public static void exibirMenu() {
        int opcao = 0;

        while (opcao != 4) {
            u.imprimirTexto("\nSelecione uma opção:\n");
            u.imprimirTexto("1. Adicionar jogador em espera");
            u.imprimirTexto("2. Ver jogadores em espera");
            u.imprimirTexto("3. Ver partidas em andamento");
            u.imprimirTexto("4. Sair\n");

            opcao = u.lerInt("Opção escolhida: ");

            switch (opcao) {
                case 1:
                    Jogador.adicionarJogador(matchmaking, u);
                    break;
                case 2:
                    matchmaking.verJogadoresEmEspera();
                    break;
                case 3:
                    matchmaking.verPartidasEmAndamento();
                    break;
                case 4:
                    matchmaking.sair();
                    break;
                default:
                    u.imprimirTexto("Opção inválida!");
                    break;
            }
        }
    }
}