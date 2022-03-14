package ficha5;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private final List<Pessoa> pessoas;

    public Mercado() {
        this.pessoas = new ArrayList<>();
    }

    public Mercado(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public double getSaldoAcumulado() {
        double acumulado = 0;

        for (Pessoa pessoa : pessoas) {
            acumulado += pessoa.getSaldo();
        }

        return acumulado;
    }

    @Override
    public String toString() {
        return new JSONObject(this).toString(2);
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
