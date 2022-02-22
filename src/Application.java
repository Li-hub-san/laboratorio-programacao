import ficha3.Banco;
import ficha3.Casa;
import ficha3.ContaBancaria;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) throws ParseException {

        testeExercicio1();
        testeExercicio2();
        List<Casa> casas = testeExercicio3();
        testeExercicio4(casas);

    }

    private static void testeExercicio1() {
        imprimeTitulo(1);

        ContaBancaria conta = new ContaBancaria("José Fernandes");

        imprimeExercicio("Informações de conta");
        System.out.println(conta.getInformacaoConta());

        imprimeExercicio("Saldo após depositar");
        conta.depositar(5000.20);
        System.out.println(conta.getSaldo());

        imprimeExercicio("Saldo após levantar");
        conta.levantar(250.25);
        System.out.println(conta.getSaldo());

        imprimeExercicio("Tentar levantar um valor > saldo");
        conta.levantar(5000);

        imprimeExercicio("Saldo após depositar");
        conta.depositar(300);
        System.out.println(conta.getSaldo());

        imprimeExercicio("Saldo após levantar");
        conta.levantar(4700);
        System.out.println(conta.getSaldo());

        imprimeExercicio("Informações de conta");
        System.out.println(conta.getInformacaoConta());
    }

    private static void testeExercicio2() {
        imprimeTitulo(2);

        ContaBancaria conta1 = new ContaBancaria("João");
        ContaBancaria conta2 = new ContaBancaria("Carlos");
        ContaBancaria conta3 = new ContaBancaria("Ana");

        Banco banco = new Banco("Milenium");
        banco.criaConta(conta1);
        banco.criaConta(conta2);
        banco.criaConta(conta3);
        System.out.println(banco.getConta("João"));
        System.out.println(banco.getConta("Maria"));
        System.out.println(banco.getConta("Carlos"));

        imprimeExercicio("Conta do " + conta1.getTitular());
        imprimeExercicio("Deposito");
        conta1.depositar(5000.00);
        System.out.println(conta1.getInformacaoConta());

        imprimeExercicio("Levantamento");
        conta1.levantar(3600);
        System.out.println(conta1.getInformacaoConta());

        imprimeExercicio("Levantamento");
        conta1.levantar(4000);
        System.out.println(conta1.getInformacaoConta());
    }

    private static List<Casa> testeExercicio3() {
        imprimeTitulo(3);

        Casa casa1 = new Casa();
        casa1.setMorada("Rua da Olaria, Caniço");
        casa1.setPrecoCusto(80_000);
        casa1.setPrecoVenda(120_000);

        Casa casa2 = new Casa("Rua velha da Ajuda, Funchal");
        casa2.setPrecoCusto(120_000);
        casa2.setPrecoVenda(250_500);

        Casa casa3 = new Casa("Vale Paraíso, Camacha");
        casa3.setPrecoCusto(90_000);
        casa3.setPrecoVenda(270_000);

        System.out.println(casa1);
        System.out.println(casa2);
        System.out.println(casa3);
        System.out.println("Moradia: " + casa1.getMorada()
                + " -> margem de lucro: " + casa1.getMargemLucro() + " -> " + casa1.getPercentMargemLucro() + "%");

        return Arrays.asList(casa1, casa2, casa3);
    }

    private static void testeExercicio4(List<Casa> casas) {
        imprimeTitulo(4);

        Banco casaBanco = new Banco("Banif");
        for (Casa casa : casas) {
            casaBanco.adicionarCasa(casa);
        }

        imprimeExercicio("Remover uma casa, antes/depois");
        System.out.println(casaBanco.getCasas());
        casaBanco.removeCasa("Vale Paraíso, Camacha");
        System.out.println(casaBanco.getCasas());
        System.out.println("Lucro previsto: " + casaBanco.getLucroPrevisto() + " (" + casaBanco.getCasas().size() + " casas)");
    }

    private static void imprimeTitulo(int numeroExercicio) {
        System.out.println("\n****** FICHA 3 -> EXERCÍCIO: " + numeroExercicio + " *****\n");
    }

    private static void imprimeExercicio(String tituloExercicio) {
        System.out.println("\n-------- " + tituloExercicio + " --------");
    }

}

