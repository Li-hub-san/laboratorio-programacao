package projeto1;

import projeto1.menu.Menu;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.initialMenu();
//        imprimirTituloExercicio("Registar novos utilizadores e atribuir automaticamente números únicos");
//        Programador programador1 = new Programador("Kevin", 22);
//        Programador programador2 = new Programador("Bernardo", 35);
//        Programador programador3 = new Programador("Joana", 40);
//        Programador programador4 = new Programador("João", 39);
//
//        Cliente cliente1 = new Cliente("Alberto", 35);
//        Cliente cliente2 = new Cliente("Teresa", 35);
//        Cliente cliente3 = new Cliente("Carlos", 35);
//        Cliente cliente4 = new Cliente("Betty", 35);
//        Cliente cliente5 = new Cliente("Carolina", 35);
//
//        AppStore loja1 = new AppStore();
//        loja1.registarUser(programador1);
//        System.out.println(programador1);
//
//        loja1.registarUser(programador2);
//        System.out.println(programador2);
//
//        loja1.registarUser(programador3);
//        System.out.println(programador3);
//
//        loja1.registarUser(programador4);
//        System.out.println(programador4);
//
//        loja1.registarUser(cliente1);
//        System.out.println(cliente1);
//
//        loja1.registarUser(cliente2);
//        System.out.println(cliente2);
//
//        loja1.registarUser(cliente3);
//        System.out.println(cliente3);
//
//        loja1.registarUser(cliente4);
//        System.out.println(cliente4);
//
//        loja1.registarUser(cliente5);
//        System.out.println(cliente5);
//
//        imprimirTituloExercicio("Incluir novas aplicações com a informação necessária");
//        // adicionar aplicacoes à AppStore
//        Aplicacao aplicacao1 = programador1.desenvolverAplicacao(TipoAplicacao.GAMES, "Angry Birds", 3.99);
//        loja1.adicionarAplicacao(aplicacao1);
//        Aplicacao aplicacao2 = programador1.desenvolverAplicacao(TipoAplicacao.ENTERTAINMENT, "Final Fantasy", 50);
//        loja1.adicionarAplicacao(aplicacao2);
//        Aplicacao aplicacao3 = programador1.desenvolverAplicacao(TipoAplicacao.GAMES, "Call of Duty", 29.95);
//        loja1.adicionarAplicacao(aplicacao3);
//        Aplicacao aplicacao4 = programador1.desenvolverAplicacao(TipoAplicacao.GAMES, "League of Legends", 0);
//        loja1.adicionarAplicacao(aplicacao4);
//
//        System.out.println(loja1);
//
//        imprimirTituloExercicio("Listar todos os utilizadores da App Store. Para cada utilizador é mostrado o nome, idade, e número de utilizador");
//        StringBuilder users = new StringBuilder("Users{");
//        for (int i = 0; i < loja1.getUsers().size(); i++) {
//            User user = loja1.getUsers().get(i);
//
//            users.append("\n  ").append(user);
//        }
//        System.out.println(users + "\n}");
//
//        imprimirTituloExercicio("Realizar compras de aplicações");
//        loja1.comprarAplicacoes(cliente1, Arrays.asList(aplicacao1, aplicacao4));
//        loja1.comprarAplicacoes(cliente2, Arrays.asList(aplicacao2, aplicacao3));
//        loja1.comprarAplicacoes(cliente3, Arrays.asList(aplicacao3, aplicacao4));
//
//        imprimirCompra(cliente1.getId(), cliente1.getNome(), cliente1.getAplicacoesCompradas());
//        imprimirCompra(cliente2.getId(), cliente2.getNome(), cliente2.getAplicacoesCompradas());
//        imprimirCompra(cliente3.getId(), cliente3.getNome(), cliente3.getAplicacoesCompradas());
//        System.out.println(cliente3.getId() + "," + cliente3.getNome() + "," + cliente3.getCompras());
//
//
//        imprimirTituloExercicio("Atribuir a uma aplicação uma avaliação (e comentários) dados por um utilizador e atualizar a classificação do programador e da aplicação");
//        aplicacao1.avaliar(5, 4, "Boa jogabilidade.");
//        aplicacao1.avaliar(6, 5);
//        System.out.println(aplicacao1.getNome() + " -> " + aplicacao1.getAvaliacao());
//
//        aplicacao2.avaliar(6, 2, "nada intuitivo");
//
//        aplicacao3.avaliar(7, 3);
//        System.out.println(aplicacao3.getNome() + " -> " + aplicacao3.getAvaliacao());
//
//        aplicacao4.avaliar(7, 4);
//        System.out.println(aplicacao4.getNome() + " -> " + aplicacao4.getAvaliacao());
//
//        System.out.println("\nAvaliação programador:\n" + programador1.getNome() + " -> " + programador1.getAvaliacao());
//
//        imprimirTituloExercicio("Lista de Apps após rating");
//        System.out.println(loja1);
//
//        imprimirTituloExercicio("Listar avaliações");
//        System.out.println(aplicacao1.listarAvaliacoes());
//        System.out.println(aplicacao2.listarAvaliacoes());
//        System.out.println(aplicacao3.listarAvaliacoes());
//        System.out.println(aplicacao4.listarAvaliacoes());
//
//        System.out.println("Programador 1: " + programador1.getNome() + ", avaliação: " + programador1.getAvaliacao());
//
//        imprimirTituloExercicio("Fazer listagens seletivas das apps por categoria");
//        System.out.println(loja1.getAplicacoesPorCategoria(TipoAplicacao.GAMES));
//        System.out.println(loja1.getAplicacoesPorCategoria(TipoAplicacao.ENTERTAINMENT));
//        loja1.getAplicacoesPorCategoria(TipoAplicacao.GAMES).forEach(aplicacao -> System.out.println(aplicacao.getNome() + " -> Games"));
//
//
//        imprimirTituloExercicio("Fazer listagens seletivas das apps por classificação dos utilizadores.");
//        System.out.println(loja1.getAplicacoesPorClassificacao(3));
//        loja1.getAplicacoesPorClassificacao(3).forEach(aplicacao -> System.out.println(aplicacao.getAvaliacao()));
//
//        imprimirTituloExercicio("Fazer listagens ordenadas das apps por nome");
//        System.out.println(loja1.listarPorNome());
//        loja1.listarPorNome().forEach(aplicacao -> System.out.println(aplicacao.getNome()));
//
//        imprimirTituloExercicio("Fazer listagens ordenadas das apps por número de vendas");
//        System.out.println(loja1.listarPorNumeroVendas());
//        loja1.getAplicacoes().forEach(aplicacao -> System.out.println(aplicacao.getNome() + "-> sales: " + aplicacao.getNumeroVendas()));
//
//        imprimirTituloExercicio("Fazer listagens ordenadas das apps porclassificação dos utilizadores");
//        System.out.println(loja1.listarPorClassificacao());
//        loja1.listarPorClassificacao().forEach(aplicacao -> System.out.println(aplicacao.getNome() + " -> avaliação: " + aplicacao.getAvaliacao()));
//
//        imprimirTituloExercicio("Listar as aplicações de um utilizador em concreto (independentemente de ser cliente ou programador");
//        System.out.println("cliente " + cliente1.getNome() +  " -> " + cliente1.getAplicacoesCompradas());
//        System.out.println("programador " + programador1.getNome() + " -> " + programador1.getAplicacoesDesenvolvidas());
//
//        imprimirTituloExercicio("Imprimir o valor total que a App Store recebeu do conjunto dos seus utilizadores");
//        System.out.println(loja1.getValorTotalCompras());
//
//        imprimirTituloExercicio("Imprimir o valor total que cada programador recebeu do conjunto das suas apps");
//        System.out.println(programador1.valorTotalRecebido());
    }

    private static void imprimirTituloExercicio(String title) {
        System.out.println("\n_______ " + title + " _______\n");
    }

    private static void imprimirCompra(int clienteId, String nome, List<Aplicacao> appsAdquiridas) {
        System.out.println("ID: " + clienteId + ", nome: " + nome + "\nLista de aplicaçoes compradas:\n" + appsAdquiridas + "\n");
    }

}
