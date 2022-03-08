package projeto1;

import projeto1.user.Cliente;
import projeto1.user.Programador;
import projeto1.user.User;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        printExerciseTitle("Registar novos utilizadores e atribuir automaticamente números únicos");
        Programador programador1 = new Programador("Kevin", 22);
        Programador programador2 = new Programador("Bernardo", 35);
        Programador programador3 = new Programador("Joana", 40);
        Programador programador4 = new Programador("João", 39);

        Cliente cliente1 = new Cliente("Alberto", 35);
        Cliente cliente2 = new Cliente("Teresa", 35);
        Cliente cliente3 = new Cliente("Carlos", 35);
        Cliente cliente4 = new Cliente("Betty", 35);
        Cliente cliente5 = new Cliente("Carolina", 35);

        AppStore loja1 = new AppStore();
        loja1.registarUser(programador1);
        System.out.println(programador1);

        loja1.registarUser(programador2);
        System.out.println(programador2);

        loja1.registarUser(programador3);
        System.out.println(programador3);

        loja1.registarUser(programador4);
        System.out.println(programador4);

        loja1.registarUser(cliente1);
        System.out.println(cliente1);

        loja1.registarUser(cliente2);
        System.out.println(cliente2);

        loja1.registarUser(cliente3);
        System.out.println(cliente3);

        loja1.registarUser(cliente4);
        System.out.println(cliente4);

        loja1.registarUser(cliente5);
        System.out.println(cliente5);

        printExerciseTitle("Incluir novas aplicações com a informação necessária");
        // adicionar aplicacoes à AppStore
        Aplicacao aplicacao1 = programador1.desenvolverAplicacao(TipoAplicacao.GAMES, "Angry Birds", 3.99);
        loja1.adicionarAplicacao(aplicacao1);
        Aplicacao aplicacao2 = programador1.desenvolverAplicacao(TipoAplicacao.GAMES, "Final Fantasy", 50);
        loja1.adicionarAplicacao(aplicacao2);
        Aplicacao aplicacao3 = programador1.desenvolverAplicacao(TipoAplicacao.GAMES, "Call of Duty", 29.95);
        loja1.adicionarAplicacao(aplicacao3);
        Aplicacao aplicacao4 = programador1.desenvolverAplicacao(TipoAplicacao.GAMES, "League of Legends", 0);
        loja1.adicionarAplicacao(aplicacao4);

        System.out.println(loja1);

        printExerciseTitle("Listar todos os utilizadores da App Store. Para cada utilizador é mostrado o nome, idade, e número de utilizador");
        StringBuilder users = new StringBuilder("Users{");
        for (int i = 0; i < loja1.getUsers().size(); i++) {
            User user = loja1.getUsers().get(i);

            users.append("\n  ").append(user);
        }
        System.out.println(users + "\n}");

        printExerciseTitle("Realizar compras de aplicações");
        loja1.comprarAplicacoes(cliente1, Arrays.asList(aplicacao1, aplicacao4));
        loja1.comprarAplicacoes(cliente2, Arrays.asList(aplicacao1, aplicacao3));
        loja1.comprarAplicacoes(cliente3, Arrays.asList(aplicacao3, aplicacao4));

        imprimirCompra(cliente1.getId(), cliente1.getNome(), cliente1.getAplicacoesCompradas());
        imprimirCompra(cliente2.getId(), cliente2.getNome(), cliente2.getAplicacoesCompradas());
        imprimirCompra(cliente3.getId(), cliente3.getNome(), cliente3.getAplicacoesCompradas());

        printExerciseTitle("Atribuir a uma aplicação uma avaliação (e comentários) dados por um utilizador e atualizar a classificação do programador e da aplicação");
        aplicacao1.avaliar(5, 4, "Boa jogabilidade.");
        aplicacao1.avaliar(6, 5);
        System.out.println(aplicacao1.getNome() + " -> " + aplicacao1.getAvaliacao());

        aplicacao3.avaliar(7, 3);
        System.out.println(aplicacao3.getNome() + " -> " + aplicacao3.getAvaliacao());

        aplicacao4.avaliar(7, 4);
        System.out.println(aplicacao4.getNome() + " -> " + aplicacao4.getAvaliacao());

        System.out.println("\nAvaliação programador:\n" + programador1.getNome() + " -> " + programador1.getAvaliacao());

        printExerciseTitle("Lista de Apps após rating");
        System.out.println(loja1);
    }

    private static void printExerciseTitle(String title) {
        System.out.println("\n_______ " + title + " _______\n");
    }

    private static void imprimirCompra(int clienteId, String nome, List<Aplicacao> appsAdquiridas) {
        System.out.println("ID: " + clienteId + ", nome: " + nome + "\nLista de aplicaçoes compradas:\n" + appsAdquiridas + "\n");
    }

}
