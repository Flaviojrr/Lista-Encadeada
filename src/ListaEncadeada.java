public class ListaEncadeada<T> {
    private No<T> primeiro;
    private No<T> ultimo;
    private No<T> posicaoAtual;
    private int tamanho=0;

    //Adiconar novos elementos na lista
    public void adicionar(T elemento){
        No<T> celula = new No<T>();
        celula.setElemento(elemento);
        if(primeiro==null && ultimo==null){
            this.primeiro=celula;
            this.ultimo=celula;
        }else{
            this.ultimo.setProximo(celula);
            this.ultimo=celula;
        }
        this.tamanho++;
    }

    public boolean temProximo() {
        if (this.primeiro == null) {
            return false;
        } else if (this.posicaoAtual == null) {
            posicaoAtual = primeiro;
            return true;
        } else {
            boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
            posicaoAtual = posicaoAtual.getProximo();
            return temProximo;
        }
    }
    private No<T> recuperarPenultimo(No<T> celula){
        if (celula.getProximo().equals(ultimo)) {
            return celula;
        }
        return recuperarPenultimo(celula.getProximo());
    }
    public void remover(T elemento){
        if(primeiro.getProximo()!=null){
            No<T> celula = this.recuperarPenultimo(primeiro);
            ultimo=celula;
            celula.setProximo(null);
            this.tamanho--;
        }else{
            primeiro = ultimo = null;
        }
    }
    //Verifica se a lista estar vazia
    public boolean verificaLista(){
        if(primeiro==null && ultimo==null){
            return true;
        }else{
            return false;
        }
    }
    //Obter tamanho da lista
    public int getTamanho() {
        return tamanho;
    }

    public void apagarLista(){
        for(posicaoAtual=primeiro; posicaoAtual!=null;){
            No<T> proximo = posicaoAtual.getProximo();
            posicaoAtual.setElemento(null);
            posicaoAtual.setProximo(null);
        };
        this.primeiro=null;
        this.ultimo=null;
        this.tamanho=0;
    }

    public No<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No<T> primeiro) {
        this.primeiro = primeiro;
    }

    public No<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(No<T> ultimo) {
        this.ultimo = ultimo;
    }

    public No<T> getPosicaoAtual() {
        return posicaoAtual;
    }

    public void setPosicaoAtual(No<T> posicaoAtual) {
        this.posicaoAtual = posicaoAtual;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void print(){
        int i=0;
        if(primeiro==null){
            System.out.println("Lista vazia");
        }else{
            posicaoAtual = primeiro;
            while(i<tamanho){
                System.out.println(" "+posicaoAtual.getProximo());
                posicaoAtual = posicaoAtual.getProximo();
            }
        }
    }
}
