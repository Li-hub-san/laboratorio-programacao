package ficha3;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Banco {
    private String nome;
    private List<ContaBancaria> contas;
    private List<Casa> casas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>(100);
        this.casas = new ArrayList<>();
    }

    public ContaBancaria getConta(String titular) {
        for (ContaBancaria conta : contas) {
            if (Objects.equals(conta.getTitular(), titular)) {
                return conta;
            }
        }

        System.out.print("Não existe registo de nenhuma conta com o titular " + titular + " -> ");

        return null;
    }

    public void criaConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(List<ContaBancaria> contas) {
        this.contas = contas;
    }

    public void adicionarCasa(Casa casa) {
        casas.add(casa);
    }

    public void removeCasa(String morada) {
//        casas.stream()
//                .filter(casa -> Objects.equals(casa.getMorada(), morada))
//                .peek(casa -> casas.remove(casa));
//
//        for (Casa casa : casas) {
//            if (casa.getMorada().equals(morada)) {
//                casas.remove(casa);
//                return;
//            }
//        }

        for (int i = 0; i < casas.size(); i++) {
            Casa casa = casas.get(i);
            if (Objects.equals(casa.getMorada(), morada)) {
                casas.remove(casa);
                // apenas se tiver a certeza que as casas têm moradas únicas.
                return;
            }
        }
    }

    public double getLucroPrevisto() {
        double lucroPrevisto = 0;
        for (Casa casa : casas) {
            lucroPrevisto += casa.getMargemLucro();
        }

        return lucroPrevisto;
    }

    public List<Casa> getCasas() {
        return casas;
    }


}
