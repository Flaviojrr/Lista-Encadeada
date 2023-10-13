import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ListaEncadeada<Professor> lista = new ListaEncadeada<>();
        ListaEncadeada2<Aluno> lista2 = new ListaEncadeada2<>();
        ListaEncadeada<Integer> lista3 = new ListaEncadeada<>();
        ListaEncadeada<Integer> lista4 = new ListaEncadeada<>();
        System.out.println("///// Atividade /////"+
                "\n(1)Questão 1"+
                "\n(2)Questão 2"+
                "\n(3)Questão 3"+
                "\n(4)Questão 4"+
                "\n(5)Questão 5"+
                "\nSua escolha:");
        int op = sc.nextInt();
        do {
            switch (op){
                case 1:
                    System.out.println("//// Questão 1 ////"+
                            "\n(1)Adicionar"+
                            "\n(2)Remover"+
                            "\n(3)Verificar tamanho"+
                            "\n(4)Verificar se estar vazia"+
                            "\n(5)Apagar Lista"+
                            "\n(6)Listar registros");
                    int op2 = sc.nextInt();
                    switch (op2){
                        case 1:
                            addNomeProfessor(lista);
                            break;
                        case 2:
                            removerNome(lista);
                            break;
                        case 3:
                            verificarTamanho(lista);
                            break;
                        case 4:
                            System.out.println("A lista estar vazia?" +verificarLista(lista));
                            break;
                        case 5:
                            apagarLista(lista);
                            break;
                        case 6:
                            printLista(lista);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("//// Questão 2 ////"+
                            "\n(1)Adicionar"+
                            "\n(2)Remover"+
                            "\n(3)Pesquisar"+
                            "\n(4)Listar"+
                            "\n(5)Ordem alfabética");
                    int op3 = sc.nextInt();
                switch (op3){
                    case 1:
                        addAluno(lista2);
                        break;
                    case 2:
                        removerAluno(lista2);
                        break;
                    case 3:
                        pesquisarAluno(lista2);
                        break;
                    case 4:
                        printLista(lista2);
                        break;
                }
                    break;
                case 3:
                    System.out.println("//// Questão 3 ////"+
                            "\n(1)Adicionar"+
                            "\n(2)Listar");
                    int op4 = sc.nextInt();
                    switch (op4){
                        case 1:
                            addInt(lista3);
                            break;
                        case 2:
                            printListaInt(lista3);
                            break;
                    }
                    break;
                case 5:
                    System.out.println("//// Questão 5 ////"+
                            "\n(1)Adicionar no começo da lista"+
                            "\n(2)Adicionar no fim da lista"+
                            "\n(3)Listar");
                    int op5 = sc.nextInt();
                    switch (op5){
                        case 1:
                            addIntComeco(lista4);
                            break;
                        case 2:
                            addIntFim(lista4);
                            break;
                        case 3:
                            printListaInt(lista4);
                            break;
                    }
                    break;
            }
        }while (op!=6);
    }
    public static void addNomeProfessor(ListaEncadeada lista){
            System.out.println("Nome do professor:");
            String novoElemento = sc.next();
            Professor nomeProfessor = new Professor(novoElemento);
            lista.adicionar(nomeProfessor);
    }
    public static void addAluno(ListaEncadeada2 lista2){
        System.out.println("Nome do aluno:");
        String nomeAluno = sc.next();
        System.out.println("Idade:");
        int idadeAluno = sc.nextInt();
        System.out.println("Email:");
        String emailAluno = sc.next();
        Aluno novoAluno = new Aluno(nomeAluno,idadeAluno,emailAluno);
        lista2.adicionar(novoAluno);
    }
    public static void addInt(ListaEncadeada lista3){
        System.out.println("Numero inteiro:");
        int addNumeroInt = sc.nextInt();
        lista3.adicionarInt(addNumeroInt);
    }
    public static void addIntComeco(ListaEncadeada lista4){
        System.out.println("Numero inteiro:");
        int addNumeroInt = sc.nextInt();
        lista4.adicionarIntComeco(addNumeroInt);
    }
    public static void addIntFim(ListaEncadeada lista4){
        System.out.println("Numero inteiro:");
        int addNumeroInt = sc.nextInt();
        lista4.adicionarIntFim(addNumeroInt);
    }

    public static void removerNome(ListaEncadeada lista){
        lista.remover();
        System.out.println("Removido com sucesso!!!");
    }
    public static void removerAluno(ListaEncadeada2 lista2){
        lista2.remover();
        System.out.println("Removido com sucesso!!!");
    }
    public static void pesquisarAluno(ListaEncadeada2 lista2){
        System.out.println("Nome aluno para pesquisa:");
        String alunoPesquisa = sc.next();
        System.out.println(lista2.buscarRecursivamente(alunoPesquisa));
    }
    public static void verificarTamanho(ListaEncadeada lista){
        System.out.println("O tamanho da lista é de: "+lista.getTamanho());
    }
    public static boolean verificarLista(ListaEncadeada lista){
        return lista.verificaLista();
    }
    public static void apagarLista(ListaEncadeada lista){
        lista.apagarLista();
        System.out.println("Lista apagada com sucesso!!!");
    }
    public static void printLista(ListaEncadeada2 lista){
        lista.print();
    }
    public static void printLista(ListaEncadeada lista){
        lista.print();
    }
    public static void printListaInt(ListaEncadeada lista){
        lista.printInt();
    }
}
