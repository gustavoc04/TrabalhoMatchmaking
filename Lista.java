public class Lista{
   private No cabeca;
   private No cauda;
   private int tamanho;
   
   public Lista(){
      this.cabeca = new No();
      this.cauda = new No();
      cabeca.setProximo(cauda);
      this.tamanho = 0;
   }
   
   public void addPrimeiro(String jogador){
      No novo = new No();
      novo.setNome(jogador);
      novo.setProximo(cabeca.getProximo());
      cabeca.setProximo(novo);
      tamanho += 1;
   }
   
   public void addUltimo(String jogador){
      if(tamanho == 0){
         addPrimeiro(jogador);
      }
      else{
         No novo = new No();
         novo.setNome(jogador);
         for(No atual = cabeca.getProximo(); atual != cauda; atual = atual.getProximo()){
            if(atual.getProximo() == cauda){
               atual.setProximo(novo);
               novo.setProximo(cauda);
               tamanho++;
               atual.setProximo(atual.getProximo());
            }
         }
      } 
   }
   
   public void removerPrimeiro(){
      if (tamanho == 0){
         System.out.println("ainda n existem jogadores");
      }
      else{
         No primeiro = cabeca.getProximo();
         cabeca.setProximo(primeiro.getProximo());
         tamanho--;
      }
   }
   
   public void printLista(){
      if(tamanho != 0){
         for(No atual = cabeca.getProximo(); atual != cauda; atual = atual.getProximo()){
            System.out.println(atual.getNome());
         }
      }
   }
}