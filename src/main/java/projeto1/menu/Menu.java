package projeto1.menu;

import projeto1.auxiliares.AuxiliarExcecao;
import projeto1.auxiliares.AuxiliarMenu;

import java.util.InputMismatchException;

public abstract class Menu {

    private boolean continuarNoCiclo = true;

    public void mostrar() {
        while (continuarNoCiclo) {
            imprimirOpcoes();

            try {
                int opcao = AuxiliarMenu.pedirOpcao();
                tratarOpcao(opcao);
            } catch (InputMismatchException excecao) {
                AuxiliarExcecao.tratarExcecaoInput();
            }
        }
    }

    protected void sair() {
        continuarNoCiclo = false;
    }

    protected abstract void imprimirOpcoes();
    protected abstract void tratarOpcao(int opcao);

}
