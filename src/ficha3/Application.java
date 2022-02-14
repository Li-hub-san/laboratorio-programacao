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

        System.out.println("\n----- Ficha de exercícios 3: exercício 1 -----\n");
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

        System.out.println("\n-----Conta do " + conta1.getTitular() + " -----");
        System.out.println("** Deposito **");
        conta1.depositar(5000.00);
        System.out.println(conta1.getInformacaoConta());

        System.out.println("\n** Levantamento **");
        conta1.levantar(3600);
        System.out.println(conta1.getInformacaoConta());

        System.out.println("\n** Levantamento **");
        conta1.levantar(4000);
        System.out.println(conta1.getInformacaoConta());

    }
}
