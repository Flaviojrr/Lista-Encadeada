import java.util.Random;

public class aluno {
    Random rd = new Random();
    private String nome;
    private int matricula;
    private int idade;
    private String email;

    public aluno(String nome,int idade, String email) {
        this.nome = nome;
        this.matricula = rd.nextInt(1000);
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
