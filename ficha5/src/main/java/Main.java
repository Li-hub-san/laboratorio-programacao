public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Lígia", "Santos");
        pessoa1.setIdade(36);
        pessoa1.setSaldo(500);

        Pessoa pessoa2 = new Pessoa("Jessica", "Barros");
        pessoa2.setIdade(27);
        pessoa2.setSaldo(700);

        Pessoa pessoa3 = new Pessoa("Bernardo", "Luis");
        pessoa3.setIdade(32);
        pessoa3.setSaldo(900);

        System.out.println("\nInstanciar pessoas.json\n" + pessoa1 + "\n" + pessoa2 + "\n" + pessoa3);
        System.out.println("\nGet saldo:");
        System.out.println(pessoa1.getFirstName() + " -> " + pessoa1.getSaldo());
        System.out.println(pessoa2.getFirstName() + " -> " + pessoa2.getSaldo());
        System.out.println(pessoa3.getFirstName() + " -> " + pessoa3.getSaldo());

        Mercado mercado = new Mercado();

        mercado.adicionarPessoa(pessoa1);
        mercado.adicionarPessoa(pessoa2);
        mercado.adicionarPessoa(pessoa3);

        System.out.println("\nLista pessoas.json:\n" + mercado.getPessoas());
        System.out.println("\nSaldo acumulado: " + mercado.acumularSaldo());

        LoadFromFile file = new LoadFromFile();
        System.out.println(file.obterInformacaoFicheiro("pessoas.json"));

    }

}
