package ficha3;

import java.text.ParseException;

public class Application {
    public static void main(String[] args) throws ParseException {
//        ContaBancaria conta1 = new ContaBancaria("José Fernandes");

//        System.out.println("\n----- Ficha de exercícios 3: Exercício 1 -----");
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

        System.out.println("\n----- Ficha de exercícios 3.2 -----\n");
        ContaBancaria conta1 = new ContaBancaria("João");
        ContaBancaria conta2 = new ContaBancaria("Carlos");
        ContaBancaria conta3 = new ContaBancaria("Ana");
        ContaBancaria conta4 = new ContaBancaria("Roberto");
        ContaBancaria conta5 = new ContaBancaria("Carla");

        Banco banco = new Banco("Milenium");
        banco.criaConta(conta1);
        banco.criaConta(conta2);
        banco.criaConta(conta3);
        banco.criaConta(conta4);
        banco.criaConta(conta5);
        System.out.println(banco.getConta("João"));
        System.out.println(banco.getConta("Maria"));
        System.out.println(banco.getConta("Carlos"));
        System.out.println(banco.getConta("João"));
    }
}
