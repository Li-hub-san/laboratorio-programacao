package ficha5;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private List<Pessoa> pessoas;

    public Mercado() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public double acumularSaldo() {
        double acumulado = 0;

        for (Pessoa pessoa : pessoas) {
            acumulado += pessoa.getSaldo();
        }

        return acumulado;
    }
}
