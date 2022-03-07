package projeto1.user;

import projeto1.Aplicacao;
import projeto1.Compra;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends User {
    private List<Compra> compras;

    public Cliente(String nome, int idade) {
        super(nome, idade);
        this.compras = new ArrayList<>();
    }

    public void adicionarCompra(Compra compra) {
        compras.add(compra);
    }

    public List<Aplicacao> getAplicacoesCompradas() {
        List<Aplicacao> compradas = new ArrayList<>();
        for (Compra compra : compras) {
            compradas.addAll(compra.getAplicacoes());
        }
        return compradas;
    }

    public List<Compra> getCompras() {
        return compras;
    }

}
