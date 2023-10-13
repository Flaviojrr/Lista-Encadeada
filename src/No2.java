public class No2<T> {
    private Aluno no;
    private No2<T> Proximo;

    public Aluno getNo() {
        return no;
    }

    public void setNo(Aluno no) {
        this.no = no;
    }

    public No2<T> getProximo() {
        return Proximo;
    }

    public void setProximo(No2<T> proximo) {
        this.Proximo = proximo;
    }
}
