package projetoExtra1.menu;

import projetoExtra1.auxiliares.AuxiliarMenu;
import projetoExtra1.utilizador.Programador;
import projetoExtra1.utilizador.Utilizador;

public class MenuAppStore extends Menu {

    private final Utilizador utilizador;

    public MenuAppStore(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    @Override
    public void mostrar() {
        System.out.println("\nBenvido à AppStore!");
        super.mostrar();
        System.out.println("Obrigada pela visita. Esperamos vê-lo novamente!");
    }

    @Override
    protected void imprimirOpcoes() {
        AuxiliarMenu.imprimirLimiteSuperior("App Store");
        System.out.println("1 - Listar Aplicações");
        System.out.println("2 - Listar aplicações por ordem alfabética");
        System.out.println("3 - Listar aplicações por classificação");
        System.out.println("4 - Listar aplicações por tipo");
        System.out.println("5 - Listar aplicações por preço");
        System.out.println("6 - Listar aplicações por mais vendidas");
        System.out.println("7 - Listar as minhas aplicações");

        if (utilizador instanceof Programador) {
            System.out.println("8 - Adicionar aplicação");
        }

        System.out.println("0 - Saír");

        // opções programador
        System.out.println("Listar as minhas aplicações");
        System.out.println("Consultar a minha classificação");
        System.out.println("Consultar valor acumulado");

        AuxiliarMenu.imprimirLimiteInferior();
    }

    @Override
    protected void tratarOpcao(int opcao) {

    }
}
