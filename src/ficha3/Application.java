package ficha3;

import java.text.ParseException;

public class Application {
    public static void main(String[] args) throws ParseException {
//        ContaBancaria conta1 = new ContaBancaria("José Fernandes");

//        System.out.println("\n----- Ficha de exercícios 3: exercício 1 -----");
//        System.out.println("\n----- Informações de conta -----");
//        System.out.println(conta1.getInformacaoConta());
//
//        System.out.println("\n----- Saldo após depositar -----");
//        conta1.depositar(5000.20);
//        System.out.println(conta1.getSaldo());
//
//        System.out.println("\n----- Saldo após levantar -----");
//        conta1.levantar(250.25);
//        System.out.println(conta1.getSaldo());
//
//        System.out.println("\n----- Tentar levantar um valor > saldo -----");
//        conta1.levantar(5000);
//
//        System.out.println("\n----- Saldo após depositar -----");
//        conta1.depositar(300);
//        System.out.println(conta1.getSaldo());
//
//        System.out.println("\n----- Saldo após levantar -----");
//        conta1.levantar(4700);
//        System.out.println(conta1.getSaldo());
//
//        System.out.println("\n----- Informações de conta -----");
//        System.out.println(conta1.getInformacaoConta());

//        System.out.println("\n----- Ficha de exercícios 3: exercício 2 -----\n");
//        ContaBancaria conta1 = new ContaBancaria("João");
//        ContaBancaria conta2 = new ContaBancaria("Carlos");
//        ContaBancaria conta3 = new ContaBancaria("Ana");
//
//        Banco banco = new Banco("Milenium");
//        banco.criaConta(conta1);
//        banco.criaConta(conta2);
//        banco.criaConta(conta3);
//        System.out.println(banco.getConta("João"));
//        System.out.println(banco.getConta("Maria"));
//        System.out.println(banco.getConta("Carlos"));
//
//        System.out.println("\n-----Conta do " + conta1.getTitular() + " -----");
//        System.out.println("** Deposito **");
//        conta1.depositar(5000.00);
//        System.out.println(conta1.getInformacaoConta());
//
//        System.out.println("\n** Levantamento **");
//        conta1.levantar(3600);
//        System.out.println(conta1.getInformacaoConta());
//
//        System.out.println("\n** Levantamento **");
//        conta1.levantar(4000);
//        System.out.println(conta1.getInformacaoConta());

        System.out.println("\n----- Ficha de exercícios 3: exercício 3 -----\n");

        Casa casa = new Casa();
        casa.setMorada("Rua da Olaria, Caniço");
        casa.setPrecoCusto(80_000);
        casa.setPrecoVenda(120_000);

        Casa casa1 = new Casa("Rua velha da Ajuda, Funchal");
        casa1.setPrecoCusto(120_000);
        casa1.setPrecoVenda(250_500);

        Casa casa2 = new Casa("Vale Paraíso, Camacha");
        casa2.setPrecoCusto(90_000);
        casa2.setPrecoVenda(270_000);

        System.out.println(casa);
        System.out.println(casa1);
        System.out.println(casa2);
        System.out.println("Moradia: " + casa.getMorada()
                + " -> margem de lucro: " + casa.getMargemLucro() + " -> " + casa.getPercentMargemLucro() + "%");

        System.out.println("\n----- Ficha de exercícios 3: exercício 4 -----\n");

        Banco casaBanco = new Banco("Banif");
        casaBanco.adicionarCasa(casa);
        casaBanco.adicionarCasa(casa1);
        casaBanco.adicionarCasa(casa2);
        System.out.println("Remover uma casa, antes/depois");
        System.out.println(casaBanco.getCasas());
        casaBanco.removeCasa("Vale Paraíso, Camacha");
        System.out.println(casaBanco.getCasas());
        System.out.println("Lucro previsto: " + casaBanco.getLucroPrevisto() + " (" + casaBanco.getCasas().size() + " casas)");

    }

}
