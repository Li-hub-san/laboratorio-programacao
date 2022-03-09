package projeto1.auxiliares;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AuxiliarMenu {

    private static int comprimentoNomeUltimoMenu;

    public static int pedirOpcao() {
        System.out.print("Opção: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void imprimirRespostaOpcao(String mensagem) {
        System.out.println("## " + mensagem + " ##");
    }

    public static void imprimirLimiteSuperior(String nomeMenu) {
        imprimirLimiteSuperior(nomeMenu, "~");
    }

    public static void imprimirLimiteSuperior(String nomeMenu, String caracter) {
        imprimirLimiteSuperior(nomeMenu, caracter, "\n");
    }

    public static void imprimirLimiteSuperior(String nomeMenu, String caracter, String prefixo) {
        String separador = repeatirCaracter(caracter, 19 - nomeMenu.length() / 2);
        String cabecalho = prefixo + separador + " " + nomeMenu.toUpperCase() + " " + separador;
        AuxiliarMenu.comprimentoNomeUltimoMenu = cabecalho.length() - 1;
        System.out.println(cabecalho);
    }

    public static void imprimirLimiteInferior() {
        imprimirLimiteInferior("~");
    }

    public static void imprimirLimiteInferior(String caracter) {
        System.out.println(repeatirCaracter(caracter, AuxiliarMenu.comprimentoNomeUltimoMenu));
    }

    private static String repeatirCaracter(String caracter, int repeticoes) {
        return caracter.repeat(Math.max(0, repeticoes));
    }

    public static String removerDecimais(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("#");
        return decimalFormat.format(number);
    }
}
