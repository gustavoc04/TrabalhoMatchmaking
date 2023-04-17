import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoJogadores {
    private String nomeArquivo;
    private static Utils u = new Utils();

    public ArquivoJogadores(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public ListaDuplamenteEncadeada lerJogadores() {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.nomeArquivo))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String nome = parts[0];
                    int id = Integer.parseInt(parts[1]);
                    String role = parts[2];
                    int pontuacao = Integer.parseInt(parts[3]);
                    lista.adicionar(new Jogador(nome, id, role, pontuacao));
                }
            }
        } catch (IOException e) {
            u.imprimirTexto("Arquivo de Jogadores criado!");
        }

        return lista;
    }

    public void salvarJogadores(ListaDuplamenteEncadeada lista) {
       ListaDuplamenteEncadeada jogadoresMantidos = new ListaDuplamenteEncadeada();
       No no = lista.getPrimeiro();
       while (no != null) {
           Jogador jogador = no.getJogador();
           if (!lista.contem(jogador)) { // Verifica se o jogador foi removido da lista
               System.out.println("Removendo jogador " + jogador.getNome() + " do arquivo");
           } else {
               jogadoresMantidos.adicionar(jogador); // Adiciona o jogador à lista de mantidos
           }
           no = no.getProximo();
       }
   
       // Reescreve o arquivo com os jogadores mantidos
       try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.nomeArquivo))) {
           No noJogador = jogadoresMantidos.getPrimeiro();
           while (noJogador != null) {
               Jogador jogador = noJogador.getJogador();
               bufferedWriter.write(jogador.getNome() + "," + jogador.getId() + "," + jogador.getRole() + "," + jogador.getPontuacao());
               bufferedWriter.newLine();
               noJogador = noJogador.getProximo();
           }
       } catch (IOException e) {
           System.out.println("Erro na escrita do arquivo: " + e.getMessage());
       }
   }


}

