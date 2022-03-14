# Laboratório — programação

## Ficha de exercícios 5

**Exercício 1:** Crie o seu primeiro projeto  `Maven`.

Crie uma classe [`Pessoa`](https://github.com/Li-hub-san/laboratorio-programacao/blob/main/src/main/java/ficha5/Pessoa.java) que contém os seguintes atributos:

:white_check_mark: `primeiroNome` e `últimoNome`, ambos do tipo `String`;

:white_check_mark: idade` do tipo `int`;

:white_check_mark: `saldo` do tipo `double`;

:white_check_mark: `id` do tipo `UUID`.

:white_check_mark: Todas as pessoas devem ter um identificador único, gerado automaticamente.

:white_check_mark: Adicionar os `getters` e `setters` que achar necessários.

:white_check_mark: Escreva a função `main()` para testar a classe `Pessoa`.

**Exercício 2:**

Crie uma classe [`Mercado`](https://github.com/Li-hub-san/laboratorio-programacao/blob/main/src/main/java/ficha5/Mercado.java):

:white_check_mark: List<Pessoa> `pessoas`;

:white_check_mark: Implemente um método para obter o valor `totalAcumulado()` de `saldo` da lista de pessoas.

:white_check_mark: Escreva a função `main()` para testar a classe `Mercado`.

:white_check_mark: Deverá adicionar pessoas com diferentes valores de saldo.

**Exercício 3:**

Coloque o seguinte ficheiro no seu projeto, na pasta `resources`. Crie uma classe chamada [`LoadFromFile`](https://github.com/Li-hub-san/laboratorio-programacao/blob/main/src/main/java/ficha5/LoadFromFile.java).

:white_check_mark: Defina o método `obterInformacaoFicheiro()` que recebe como parâmetro o nome do ficheiro(do tipo `String`) e retorna uma lista de pessoas.

:white_check_mark: Deverá ser usado a biblioteca `org.json`.

Deverá dividir a função `obterInformacaoFicheiro()` em responsabilidades, nomeadamentenas seguintes funções:

:white_check_mark: `getFileAsIOStream()`;

:white_check_mark: `getFileContent()`;

:white_check_mark: `convertStringToPessoa()`.

:white_check_mark: As exceções deverão ser tratadas na função correspondente.

**Exercício 4:**

Escreva as instruções necessárias no método main para carregar a lista de pessoas presente no ficheiro numa
instância da `classe Mercado`.

**Exercício. 5:**

Instale o `Postman` e o `Postgresql`.
