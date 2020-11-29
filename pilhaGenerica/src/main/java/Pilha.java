public class Pilha <T> {
    private T[] vetor;
    private int topo;

    public Pilha(){
        vetor = (T[]) new Object[15];
        topo = -1;//posição inválida

    }
    public void push(T elemento){
        // adiciona um elemento na posição indicada
        if(topo == vetor.length - 1){
            throw new RuntimeException("A pilha está cheia");
        }
            topo++;
            vetor[topo] = elemento;
    }
    
    public boolean existeDado(){
        // verifica se existe dado
        if (isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    public boolean isEmpty(){
        // verifica se a Pilha está vazia
        return(topo == -1);

    }
    public T top(){
        //recupera o objeto no topo da pilha
        if(isEmpty()){
            throw new RuntimeException("A pilha está vazia!");
        }
        return vetor[topo];
    }   
    
  
    public  T pull(T elemento){
        // Altera o valor do objeto do topo da pilha
        vetor[topo] = elemento;
        return vetor[topo];
    }
    

    public T pop(){
        if(isEmpty()){
            throw new RuntimeException("A pilha está vazia!");
        }
        // remove o objeto do topo da pilha
        T t;
        t = vetor[topo];
        topo--;
        return t;
    }

    public int tamanho(){
        // retorna o tamanho da pilha (quantidade de elementos inseridos)
        return vetor.length;
    }

    public void limpar(){
        //exclui todos os elementos da pilha
            Iterador<T> iterador = new Iterador<>(vetor);
            while (iterador.hasNext()) {
              this.vetor[iterador.getPosicao()] = null;
              iterador.next();
    }
        }


    @Override
    public String toString() {
        Iterador<T> iterador = new Iterador<>(vetor);
            String vetorToString = "[" + iterador.next();
            while (iterador.hasNext()) {
              vetorToString += ", " + iterador.next();
            }
            vetorToString += "]";

            return vetorToString;
          }

}
