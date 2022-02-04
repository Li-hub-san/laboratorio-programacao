package ficha3;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ContaBancária {
    private String titular;
    private double saldo;
    private Date dataAbertura;

    public ContaBancária(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.dataAbertura = new Date();
    }

    public String getInformaçãoConta() throws ParseException {
        return "Titular: " + titular +
                "\nSaldo: " + getSaldo() +
                "\nData Abertura: " +
                getDataAbertura();
    }

    public String getDataAbertura() throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2012-05-20T09:00:00.000Z");
        return new SimpleDateFormat("dd/MM/yyyy").format(dataAbertura);
    }

    public void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    public void levantar(double valorLevantado) {
        if (valorLevantado > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valorLevantado;
    }

    public String getSaldo() {
        DecimalFormat formatarSaldo = new DecimalFormat("0.00");
        return formatarSaldo.format(saldo);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getTitular() {
        return titular;
    }
}
