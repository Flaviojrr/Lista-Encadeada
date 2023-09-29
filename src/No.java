public class No<T> {
    private T valor;
    private No<T> proximo;

    public T getValor() {
        return valor;
    }

    public void setElemento(T valor) {
        this.valor = valor;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
}
