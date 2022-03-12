# Laboratório — programação

## Ficha de exercícios 5

**Exercício 1:** Crie o seu primeiro projeto  `Maven`.

Crie uma classe `Pessoa` que contém os seguintes atributos:

`primeiroNome` e `últimoNome`, ambos do tipo `String`;

`idade` do tipo `int`;

`saldo` do tipo `double`;

`id` do tipo `UUID`.

Todas as pessoas devem ter um identificador único, gerado automaticamente.

Adicionar os `getters` e `setters` que achar necessários.

Escreva a função `main()` para testar a classe `Pessoa`.

**Exercício 2:**

Crie uma classe `Mercado`:

List<Pessoa> `pessoas`;

Implemente um método para obter o valor `totalAcumulado()` de `saldo` da lista de pessoas.

Escreva a função `main()` para testar a classe `Mercado`.

Deverá adicionar pessoas com diferentes valores de saldo.

**Exercício 3:**

Coloque o seguinte ficheiro no seu projeto, na pasta `resources`. Crie uma classe chamada `LoadFromFile`.

Defina o método `obterInformacaoFicheiro()` que recebe como parâmetro o nome do ficheiro(do tipo `String`) e retorna uma lista de pessoas.

Deverá ser usado a biblioteca `org.json`.

Deverá dividir a função `obterInformacaoFicheiro()` em responsabilidades, nomeadamentenas seguintes funções:

`getFileAsIOStream()`;

`getFileContent()`;

`convertStringToPessoa()`.

As exceções deverão ser tratadas na função correspondente.

**Exercício 4:**

Escreva as instruções necessárias no método main para carregar a lista de pessoas presente no ficheiro numa
instância da `classe Mercado`.

**Exercício. 5:**

Instale o `Postman` e o `Postgresql`.