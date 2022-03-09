package projeto1.auxiliares;

public class AuxiliarExcecao {

    public static void tratarExcecaoInput() {
        AuxiliarMenu.imprimirRespostaOpcao("Opção inválida");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
