package projeto1.menu;

import projeto1.auxiliares.AuxiliarExcecao;
import projeto1.auxiliares.AuxiliarMenu;
import projeto1.user.Cliente;
import projeto1.user.Programador;
import projeto1.user.Utilizador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuAutenticacao extends Menu {

    private final List<Utilizador> utilizadores = new ArrayList<>();

    @Override
    protected void imprimirOpcoes() {
        AuxiliarMenu.imprimirLimiteSuperior("menu de autenticação");
        System.out.println("1 - Registar utilizador");
        System.out.println("2 - Iniciar sessão");
        System.out.println("0 - Saír");
        AuxiliarMenu.imprimirLimiteInferior();
    }

    @Override
    protected void tratarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> registarUtilizador();
            case 2 -> iniciarSessao();
            case 0 -> sair();
        }
    }

    private void registarUtilizador() {
        Scanner scanner = new Scanner(System.in);

        AuxiliarMenu.imprimirLimiteSuperior("registo", ".");

        String nomeUtilizador = pedirNomeUtilizadorUnico();

        System.out.print("Digite a sua palavra-passe (password): ");
        String palavraPasse = scanner.next();

        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        finalizarRegisto(nomeUtilizador, palavraPasse, nome, idade);

        AuxiliarMenu.imprimirRespostaOpcao("Utilizador registado com sucesso!");
        AuxiliarMenu.imprimirLimiteInferior(".");
    }

    private String pedirNomeUtilizadorUnico() {
        Scanner scanner = new Scanner(System.in);
        String nomeUtilizador;
        boolean utilizadorExiste;

        System.out.print("Digite o seu nome de utilizador (username): ");
        do {
            nomeUtilizador = scanner.next();

            utilizadorExiste = nomeUtilizadorExiste(nomeUtilizador);
            if (utilizadorExiste) {
                AuxiliarMenu.imprimirRespostaOpcao("Nome de utilizador em uso");
                System.out.print("Tente novamente: ");
            }
        } while (utilizadorExiste);

        return nomeUtilizador;
    }

    private void finalizarRegisto(String nomeUtilizador, String palavraPasse, String nome, int idade) {
        System.out.println("\nRegistar-se como:");
        System.out.println("1 - Cliente");
        System.out.println("2 - Programador");

        int opcao = AuxiliarMenu.pedirOpcao();
        switch (opcao) {
            case 1 -> utilizadores.add(new Cliente(nomeUtilizador, palavraPasse, nome, idade));
            case 2 -> utilizadores.add(new Programador(nomeUtilizador, palavraPasse, nome, idade));
            default -> {
                AuxiliarExcecao.tratarExcecaoInput();
                finalizarRegisto(nomeUtilizador, palavraPasse, nome, idade);
            }
        }
    }

    private boolean nomeUtilizadorExiste(String nomeUtilizador) {
        return utilizadores.stream()
                .anyMatch(utilizador -> utilizador.getNomeUtilizador().equals(nomeUtilizador));
    }

    private void iniciarSessao() {
        Scanner scanner = new Scanner(System.in);
        AuxiliarMenu.imprimirLimiteSuperior("Iniciar menu", ".");
        System.out.print("Nome de utilizador: ");
        String nomeUtilizador = scanner.nextLine();

        System.out.print("Palavra passe: ");
        String palavraPasse = scanner.nextLine();

        Utilizador utilizadorEncontrado = utilizadores.stream()
                .filter(utilizador -> utilizador.getNomeUtilizador().equals(nomeUtilizador))
                .findFirst()
                .orElse(null);

        if (utilizadorEncontrado != null && utilizadorEncontrado.getPalavraPasse().equals(palavraPasse)) {
            AuxiliarMenu.imprimirRespostaOpcao("Sessão iniciada com sucesso");
            AuxiliarMenu.imprimirLimiteInferior(".");
            MenuAppStore menuLoja = new MenuAppStore(utilizadorEncontrado);
            menuLoja.mostrar();
            return;
        }
        AuxiliarMenu.imprimirRespostaOpcao("Nome de utilizador ou palavra-passe errado(s).");
        AuxiliarMenu.imprimirLimiteInferior(".");
    }
}
