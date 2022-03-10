package projeto1;

import projeto1.menu.MenuAutenticacao;
import projeto1.user.Cliente;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        MenuAutenticacao autenticacao = new MenuAutenticacao();
        autenticacao.mostrar();


        //        imprimirTituloExercicio("Registar novos utilizadores e atribuir automaticamente números únicos");
        //
        //        // Criar uma nova app store
        //        AppStore appStore = new AppStore();
        //
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
        //        List<User> utilizadoresParaRegistar = Arrays.asList(
        //            programador1,
        //            programador2,
        //            programador3,
        //            programador4,
        //            cliente1,
        //            cliente2,
        //            cliente3,
        //            cliente4,
        //            cliente5
        //        );
        //        for (User user : utilizadoresParaRegistar) {
        //            appStore.registarUser(user);
        //            System.out.println(user);
        //        }
        //
        //        // ------------------------------------------------------------------------------------------
        //
        //        imprimirTituloExercicio("Incluir novas aplicações com a informação necessária");
        //
        //        // adicionar aplicacoes à AppStore
        //        Aplicacao aplicacao1 = programador1.desenvolverAplicacao(TipoAplicacao.GAMES, "Angry Birds", 3.99);
        //        appStore.publicarAplicacao(aplicacao1);
        //        Aplicacao aplicacao2 = programador1.desenvolverAplicacao(TipoAplicacao.GAMES, "Final Fantasy", 50);
        //        appStore.publicarAplicacao(aplicacao2);
        //        Aplicacao aplicacao3 = programador1.desenvolverAplicacao(TipoAplicacao.GAMES, "Call of Duty", 29.95);
        //        appStore.publicarAplicacao(aplicacao3);
        //        Aplicacao aplicacao4 = programador1.desenvolverAplicacao(TipoAplicacao.GAMES, "League of Legends", 0);
        //        appStore.publicarAplicacao(aplicacao4);
        //
        //        System.out.println(appStore);
        //
        //        // ------------------------------------------------------------------------------------------
        //
        //        imprimirTituloExercicio(
        //            "Listar todos os utilizadores da App Store. Para cada utilizador é mostrado o nome, idade, e
        //            número de "
        //                + "utilizador");
        //
        //        System.out.println(appStore.getUsers());
        //
        //        // ------------------------------------------------------------------------------------------
        //
        //        imprimirTituloExercicio("Realizar compras de aplicações");
        //        appStore.comprarAplicacoes(cliente1, Arrays.asList(aplicacao1, aplicacao4));
        //        appStore.comprarAplicacoes(cliente2, Arrays.asList(aplicacao1, aplicacao3));
        //        appStore.comprarAplicacoes(cliente3, Arrays.asList(aplicacao3, aplicacao4));
        //
        //        imprimirAplicacoesCompradas(appStore, cliente1);
        //        imprimirAplicacoesCompradas(appStore, cliente2);
        //        imprimirAplicacoesCompradas(appStore, cliente3);
        //
        //        // ------------------------------------------------------------------------------------------
        //
        //        imprimirTituloExercicio(
        //            "Atribuir a uma aplicação uma avaliação (e comentários) dados por um utilizador e atualizar a "
        //                + "classificação do programador e da aplicação");
        //
        //        aplicacao1.avaliar(5, 4, "Boa jogabilidade.");
        //        aplicacao1.avaliar(6, 5);
        //        System.out.println(aplicacao1.getNome() + " -> " + aplicacao1.getAvaliacaoMedia());
        //
        //        aplicacao2.avaliar(6, 2, "nada intuitivo");
        //
        //        aplicacao3.avaliar(7, 3);
        //        System.out.println(aplicacao3.getNome() + " -> " + aplicacao3.getAvaliacaoMedia());
        //
        //        aplicacao4.avaliar(7, 4);
        //        System.out.println(aplicacao4.getNome() + " -> " + aplicacao4.getAvaliacaoMedia());
        //
        //        // ------------------------------------------------------------------------------------------
        //
        //        System.out.println(
        //            "\nAvaliação programador:\n" + programador1.getNome() + " -> " + programador1.getAvaliacaoMedia
        //            ());
        //
        //        imprimirTituloExercicio("Lista de Apps após rating");
        //        System.out.println(appStore);
        //
        //        // ------------------------------------------------------------------------------------------
        //
        //        imprimirTituloExercicio("Listar avaliações");
        //        System.out.println(aplicacao1.listarAvaliacoes());
        //        System.out.println(aplicacao2.listarAvaliacoes());
        //        System.out.println(aplicacao3.listarAvaliacoes());
        //        System.out.println(aplicacao4.listarAvaliacoes());
        //
        //        System.out.println(
        //            "Programador 1: " + programador1.getNome() + ", avaliação: " + programador1.getAvaliacaoMedia());
        //
        //        // ------------------------------------------------------------------------------------------
        //
        //        imprimirTituloExercicio("Fazer listagens seletivas das apps por categoria");
        //        System.out.println(appStore.getAplicacoesPorCategoria(TipoAplicacao.GAMES));
        //        System.out.println(appStore.getAplicacoesPorCategoria(TipoAplicacao.ENTERTAINMENT));
        //
        //        // ------------------------------------------------------------------------------------------
        //
        //        imprimirTituloExercicio("Fazer listagens seletivas das apps por classificação dos utilizadores.");
        //        System.out.println(appStore.getAplicacoesPorClassificacao(3));
        //        appStore.getAplicacoesPorClassificacao(3)
        //            .forEach(aplicacao -> System.out.println(aplicacao.getAvaliacaoMedia()));
        //
        //        // ------------------------------------------------------------------------------------------
        //
        //        imprimirTituloExercicio("Fazer listagens ordenadas das apps por nome");
        //        System.out.println(appStore.listarPorNome());
        //        appStore.listarPorNome().forEach(aplicacao -> System.out.println(aplicacao.getNome()));
        //
        //        // ------------------------------------------------------------------------------------------
        //
        //        imprimirTituloExercicio("Fazer listagens ordenadas das apps por número de vendas");
        //        System.out.println(appStore.listarPorNumeroVendas());
        //        appStore.getAplicacoes()
        //            .forEach(aplicacao -> System.out.println(aplicacao.getNome() + "-> sales: " + aplicacao
        //            .getNumeroVendas()));
        //
        //        // ------------------------------------------------------------------------------------------
        //
        //        imprimirTituloExercicio("Fazer listagens ordenadas das apps por classificação dos utilizadores");
        //        System.out.println(appStore.listarPorClassificacao());
        //        appStore.listarPorClassificacao().forEach(aplicacao -> System.out.println(
        //            aplicacao.getNome() + " -> avaliação: " + aplicacao.getAvaliacaoMedia()));
        //
        //        // ------------------------------------------------------------------------------------------
        //
        //        imprimirTituloExercicio(
        //            "Listar as aplicações de um utilizador em concreto (independentemente de ser cliente ou
        //            programador)");
        //        System.out.println("cliente " + cliente1.getNome() + " -> " + appStore.getAplicacoesCompradas
        //        (cliente1));
        //        System.out.println(
        //            "programador " + programador1.getNome() + " -> " + programador1.getAplicacoesDesenvolvidas());
    }

    private static void imprimirTituloExercicio(String title) {
        System.out.println("\n_______ " + title + " _______\n");
    }

    private static void imprimirAplicacoesCompradas(AppStore appStore, Cliente cliente) {
        System.out.printf(
                "ID: %s, nome: %s\n -> Aplicaçoes compradas:\n%s\n\n",
                cliente.getId(),
                cliente.getNome(),
                appStore.getAplicacoesCompradas(cliente)
        );
    }

}
