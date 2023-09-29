import com.sun.tools.javac.Main;

import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ListaEncadeada<professor> lista = new ListaEncadeada<>();
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
                            addNome(lista);
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
                    }
                    break;
//            case 2:
//                System.out.println("//// Questão 2 ////"+
//                        "\n(1)Adicionar"+
//                        "\n(2)Remover"+
//                        "\n(3)Pesquisar"+
//                        "\n(4)Listar"+
//                        "\n(5)Ordem alfabética"+);
//                int op2 = sc.nextInt();
//                switch (op2){
//                    case 1:
//                        addNome(lista);
//                        break;
//                    case 2:
//                        removerNome(lista);
//                        break;
//                    case 3:
//                        verificarTamanho(lista);
//                        break;
//                    case 4:
//                        verificarLista(lista);
//                        break;
//                }
//            break;
            }
        }while (op!=6);

    }
    public static void addNome(ListaEncadeada lista){
            System.out.println("Nome do professor:");
            String novoElemento = sc.next();
            professor nomeProfessor = new professor(novoElemento);
            lista.adicionar(nomeProfessor);
    }
    public static void removerNome(ListaEncadeada lista){
        System.out.println("Nome do professor para remoção da lista:");
        String elementoRemocao = sc.next();
        lista.remover(elementoRemocao);
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
}
