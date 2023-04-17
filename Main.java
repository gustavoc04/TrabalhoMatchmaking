import java.io.File;

public class Main {
    public static void main(String[] args) {
       String caminhoArquivo = new File("").getAbsolutePath() + "/dados_jogadores.txt";
       Menu menu = new Menu(caminhoArquivo);
       menu.exibirMenu();
   }
}
