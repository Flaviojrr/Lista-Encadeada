import java.util.Random;

public class professor {
    Random rd = new Random();
    private String nome;
    private int id;

    public professor(String nome) {
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
}
