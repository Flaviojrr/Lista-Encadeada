import java.util.Random;

public class Professor {
    Random rd = new Random();
    private String nome;
    private int id;

    public Professor(String nome) {
        this.nome = nome;
        this.id = rd.nextInt(1000);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nome;
    }
}

