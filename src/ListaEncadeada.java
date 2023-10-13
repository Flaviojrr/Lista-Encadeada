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
    public void adicionarInt(T elemento){
        No<T> celula = new No<T>();
        celula.setElemento(elemento);
        if(primeiro==null && ultimo==null && tamanho<15){
            this.primeiro=celula;
            this.ultimo=celula;
            this.tamanho++;
        }else if(tamanho<15){
            this.ultimo.setProximo(celula);
            this.ultimo=celula;
            this.tamanho++;
        }
        else{
            System.out.println("Tamanho maximo atingido!!!");
        }
    }
    public void adicionarIntComeco(T elemento){
        No<T> celula = new No<T>();
        celula.setElemento(elemento);
        if(primeiro==null && ultimo==null && tamanho<15){
            this.primeiro=celula;
            this.ultimo=celula;
            this.tamanho++;
        }else if(tamanho<7){
            celula.setProximo(primeiro);
            primeiro=celula;
            this.tamanho++;
        }
        else{
            System.out.println("Tamanho maximo atingido!!!");
        }
    }
    public void adicionarIntFim(T elemento){
        No<T> celula = new No<T>();
        celula.setElemento(elemento);
        if(primeiro==null && ultimo==null && tamanho<15){
            this.primeiro=celula;
            this.ultimo=celula;
            this.tamanho++;
        }else if(tamanho<7){
            this.ultimo.setProximo(celula);
            this.ultimo=celula;
            this.tamanho++;
        }
        else{
            System.out.println("Tamanho maximo atingido!!!");
        }
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
    public void remover(){
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
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }
    public void print(){
        No<T> aux =  primeiro;
        if(aux!=null){
            while(aux!=null){
                System.out.println(aux.getElemento()+" ");
                aux=aux.getProximo();
            }
        }else{
            System.out.println("Não consigo imprimir, pois a lista está vazia!!!");
        }
        System.out.println();
    }
    public void printInt(){
        No<T> aux =  primeiro;
        int valor=1;
        if(aux!=null){
            while(aux!=null){
                System.out.print(aux.getElemento()+" ");
                aux=aux.getProximo();
                valor++;
            }
        }else{
            System.out.println("Não consigo imprimir, pois a lista está vazia!!!");
        }
        System.out.println();
    }
    public boolean pesquisar(T alunoPesquisa){
        No<T> aux = primeiro;
        while(aux!=null){
            if(aux.getElemento().equals(alunoPesquisa)){
                System.out.println("Aluno encontrado!!!");
                return true;
            }
            aux=aux.getProximo();
        }
        System.out.println("Nenhum aluno encontrado!!!");
        return false;
    }
    public boolean buscarRecursivamente(T elemento) {
        return buscarRecursivamente(primeiro, elemento);
    }
    private boolean buscarRecursivamente(No<T> atual, T elemento) {
        if (atual == null) {
            return false; // Chegamos ao final da lista, elemento não encontrado.
        }
        if (atual.getElemento().equals(elemento)) {
            return true; // Elemento encontrado.
        }
        return buscarRecursivamente(atual.getProximo(), elemento);
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


}
