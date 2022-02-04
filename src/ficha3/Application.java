package ficha3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Application {
    public static void main(String[] args) throws ParseException {
        ContaBancária conta1 = new ContaBancária("José Fernandes");

        System.out.println("\n----- Ficha de exercícios 3: Exercício 1 -----");
        System.out.println("\n----- Informações de conta -----");
        System.out.println(conta1.getInformaçãoConta());

        System.out.println("\n----- Saldo após depositar -----");
        conta1.depositar(5000.20);
        System.out.println(conta1.getSaldo());

        System.out.println("\n----- Saldo após levantar -----");
        conta1.levantar(250.25);
        System.out.println(conta1.getSaldo());

        System.out.println("\n----- Tentar levantar um valor > saldo -----");
        conta1.levantar(5000);

        System.out.println("\n----- Saldo após depositar -----");
        conta1.depositar(300);
        System.out.println(conta1.getSaldo());

        System.out.println("\n----- Saldo após levantar -----");
        conta1.levantar(4700);
        System.out.println(conta1.getSaldo());


    }
}
