package projeto1;

import projeto1.user.Cliente;
import projeto1.user.Programador;

public class Main {
    public static void main(String[] args){

        Programador programador1 = new Programador("Juan", 22);
        Aplicacao aplicacao1 = programador1.desenvolverAplicacao(TipoAplicacao.GAMES, "Aplicacao", 50);
        Cliente cliente1 = new Cliente("Alberto", 35);

        Aplicacao aplicacao2 = new Aplicacao(TipoAplicacao.GAMES, "Aplicacao2", 60);

        System.out.println(programador1.getId());
        System.out.println(cliente1.getId());

        // adicionar aplicacoes à AppStore
        AppStore loja1 = new AppStore();
        loja1.adicionarAplicacao(aplicacao1);
        loja1.adicionarAplicacao(aplicacao2);

        System.out.println(loja1);
        System.out.println(loja1.getAplicacoes());

        // adicionar clientes à AppStore
        loja1.adicionarUser(cliente1);

        // adicionar clientes à AppStore
        loja1.adicionarUser(programador1);

        System.out.println(loja1.getUsers());
    }
}
