package ficha3;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Banco {
    private String nome;
    private List<ContaBancaria> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>(100);
    }

    public ContaBancaria getConta(String titular){
        ContaBancaria conta = contas.get(0);

        for (int i = 0; i < contas.size(); i++) {
        ContaBancaria currentAccount = contas.get(i);
         if (Objects.equals(currentAccount.getTitular(), titular)){
             conta = currentAccount;
         }
        }
        return conta;
    }

    public void criaConta(ContaBancaria conta){
        contas.add(conta);
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(List<ContaBancaria> contas) {
        this.contas = contas;
    }

}
