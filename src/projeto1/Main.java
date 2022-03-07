package projeto1;

import projeto1.user.Cliente;
import projeto1.user.Programador;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Programador programador1 = new Programador("Juan", 22);
        Aplicacao aplicacao1 = programador1.desenvolverAplicacao(TipoAplicacao.GAMES, "Aplicacao", 50);
        Cliente cliente1 = new Cliente("Alberto", 35);

        Aplicacao aplicacao2 = new Aplicacao(TipoAplicacao.GAMES, "Aplicacao2", 60, programador1);

        System.out.println(programador1.getId());
        System.out.println(cliente1.getId());

        // adicionar aplicacoes à AppStore
        AppStore loja1 = new AppStore();
        loja1.adicionarAplicacao(aplicacao1);
        loja1.adicionarAplicacao(aplicacao2);

        System.out.println(loja1);
        System.out.println(loja1.getAplicacoes());

        // adicionar clientes à AppStore
        loja1.registarUser(cliente1);
        loja1.comprarAplicacoes(cliente1, Arrays.asList(aplicacao1, aplicacao2));
        aplicacao1.avaliar(cliente1.getId(), 4, "coment meu");
        aplicacao2.avaliar(cliente1.getId(), 5);

        System.out.println(aplicacao1);
        System.out.println(programador1.getAvaliacao());

        // adicionar clientes à AppStore
        loja1.registarUser(programador1);

        System.out.println(loja1.getUsers());

        System.out.println(loja1.getAplicacoesPorCategoria(TipoAplicacao.GAMES));
    }

}
