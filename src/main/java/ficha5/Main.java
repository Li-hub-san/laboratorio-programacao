package ficha5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pessoa> pessoas = exercicio1();
        exercicio2(pessoas);
        exercicio3();
        exercicio4();
    }

    private static List<Pessoa> exercicio1() {
        imprimirCabecalho(1, "Testar a classe Pessoa:");

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Lígia", "Santos", 36, 500);
        pessoas.add(pessoa1);

        Pessoa pessoa2 = new Pessoa("Jessica", "Barros", 29, 700);
        pessoas.add(pessoa2);

        Pessoa pessoa3 = new Pessoa("Bernardo", "Luis", 35, 550.50);
        pessoas.add(pessoa3);

        imprimirAccao("Instanciar pessoas", pessoas);
        imprimirAccao("Get saldo", null);
        pessoas.forEach(pessoa -> System.out.println(pessoa.getFirstName() + " -> " + pessoa.getSaldo()));

        return pessoas;
    }

    private static void exercicio2(List<Pessoa> pessoas) {
        imprimirCabecalho(2, "Criar classe Mercado, adicionando pessoas com diferentes valores de saldo:");

        Mercado mercado = new Mercado();
        pessoas.forEach(mercado::adicionarPessoa);

        imprimirAccao("Lista pessoas", mercado.getPessoas());
        imprimirAccao("Saldo acumulado", mercado.getSaldoAcumulado());
    }

    private static void exercicio3() {
        imprimirCabecalho(3, "Tranformar pessoas.json em objetos:");

        LoadFromFile file = new LoadFromFile();
        imprimirAccao("Lista pessoas", file.obterInformacaoFicheiro("pessoas.json"));
    }

    private static void exercicio4() {
        imprimirCabecalho(4, "Carregar a lista de pessoas (ficheiro json) numa instância da classe Mercado:");

        LoadFromFile file = new LoadFromFile();
        List<Pessoa> pessoas = file.obterInformacaoFicheiro("pessoas.json");

        Mercado mercado = new Mercado(pessoas);

        imprimirAccao("Mercado", mercado);
    }

    private static void imprimirCabecalho(int numeroExercicio, String descricao) {
        String caracterSeparacaoTitulo = "-";
        String caracterSeparacaoDescricao = "*";

        String titulo = "%s FICHA 5 -> Exercício %d %s".formatted(caracterSeparacaoTitulo, numeroExercicio, caracterSeparacaoTitulo);

        String separadorDescricao = caracterSeparacaoDescricao.repeat(2);
        String descricaoFinal = "%s %s %s".formatted(separadorDescricao, descricao, separadorDescricao);

        int diferencaTamanho = descricaoFinal.length() - titulo.length();
        int repeticaoInicial = Math.max(0, diferencaTamanho / 2);
        int repeticaoFinal = Math.max(0, diferencaTamanho - repeticaoInicial);

        String tituloFinal = caracterSeparacaoTitulo.repeat(repeticaoInicial) + titulo + caracterSeparacaoTitulo.repeat(repeticaoFinal);
        String separadorLinha = caracterSeparacaoTitulo.repeat(tituloFinal.length());

        System.out.println();
        System.out.println(tituloFinal);
        System.out.println(descricaoFinal);
        System.out.println(separadorLinha);
    }

    private static void imprimirAccao(String accao, Object objeto) {
        System.out.println("\n<< " + accao + " >>");
        if (objeto != null) {
            System.out.println(objeto);
        }
    }
}
