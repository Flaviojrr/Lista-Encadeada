public class ListaEncadeada2 <T>{
    private No2<T> primeiro;
    private No2<T> ultimo;
    private int tamanho=0;

    public void adicionar(Aluno elemento){
        No2<T> celula = new No2<T>();
        celula.setNo(elemento);
        if(primeiro==null && ultimo==null){
            this. primeiro=celula;
            this.ultimo=celula;
        }else{
            this.ultimo.setProximo(celula);
            this.ultimo=celula;
        }
        this.tamanho++;
    }
    private No2<T> recuperarPenultimo(No2<T> celula){
        if (celula.getProximo().equals(ultimo)) {
            return celula;
        }
        return recuperarPenultimo(celula.getProximo());
    }
    public void remover(){
        if(primeiro.getProximo()!=null){
            No2<T> celula = this.recuperarPenultimo(primeiro);
            ultimo=celula;
            celula.setProximo(null);
            this.tamanho--;
        }else{
            primeiro = ultimo = null;
        }
    }
    public boolean buscarRecursivamente(T elemento) {
        return buscarRecursivamente(primeiro, elemento);
    }
    private boolean buscarRecursivamente(No2<T> atual, T elemento) {
        if (atual == null) {
            return false; // Chegamos ao final da lista, elemento não encontrado.
        }
        if (atual.getNo().getNome().equals(elemento)) {
            return true; // Elemento encontrado.
        }
        return buscarRecursivamente(atual.getProximo(), elemento);
    }
    public void print(){
        No2<T> aux =  primeiro;
        if(aux!=null){
            while(aux!=null){
                System.out.println(aux.getNo()+" ");
                aux=aux.getProximo();
            }
        }else{
            System.out.println("Não consigo imprimir, pois a lista está vazia!!!");
        }
        System.out.println();
    }
}
