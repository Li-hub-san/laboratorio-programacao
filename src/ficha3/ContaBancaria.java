package ficha3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ContaBancaria {
    private String titular;
    private double saldo;
    private Date dataAbertura;


    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.dataAbertura = new Date();
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", dataAbertura=" + dataAbertura +
                '}';
    }

    public String getInformacaoConta() {
        DecimalFormat formatarSaldo = new DecimalFormat("0.00");
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");

        return "Titular: " + titular +
                "\nSaldo: €" + formatarSaldo.format(saldo) +
                "\nData Abertura: " +
                formatarData.format(dataAbertura);
    }


    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void depositar(double valorDepositado) {
        if (valorDepositado <= 0) {
            System.out.println("Montante tem que ser positivo");
            return;
        }

        saldo += valorDepositado;
    }

    public void levantar(double valorLevantado) {
        if (valorLevantado <= 0) {
            System.out.println("Montante tem que ser positivo");
            return;
        }

        if (valorLevantado > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        saldo -= valorLevantado;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }


}
