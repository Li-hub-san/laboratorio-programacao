# Laboratório — programação

Este projecto foi realizado no âmbito da disciplina laboratório de programação, leccionada no curso de programação Java oferecido pela Startup Madeira na iniciativa Requalificar + Digital.
O objectivo é modelar as classes `ContaBancaria`, `Banco` e `Casa` e gerar interações entre as mesmas.

O enunciado do projecto encontra-se abaixo, sub-dividido pelas diferentes funcionalidades requeridas.

## Ficha de exercícios 3

### Exercício 1: 

**Crie um novo projeto e codifique a classe [`ContaBancária`](https://github.com/Li-hub-san/laboratorio-programacao/blob/main/src/main/java/ficha3/ContaBancaria.java) com os seguintes atributos e métodos:**

:white_check_mark: a) Uma variável de instância de acesso privado, `titular`, com tipo `String`.

:white_check_mark: b) Uma variável de instância de acesso privado, `saldo`, com tipo `double`, e com valor 0.0 por defeito.

:white_check_mark: c) Uma variável de instância de acesso privado, `dataAbertura`, com tipo `Date`, e com valor por defeito a data de hoje.

:white_check_mark: d) Um `construtor` de instância da classe que recebe por parâmetro o nome do titular e cria uma conta bancária para esse
titular, na data de hoje, e com saldo zero.

:white_check_mark: e) Os métodos `getters` e `setters` para o saldo. E, apenas o método `getter` para a data de abertura e o método `getter` para o titular.

:white_check_mark: f) Um método `getInformaçãoConta()` que retorna uma String com o titular, o saldo da conta com duas casas decimais e a
data de abertura da conta no formato DD/MM/YYYY. Ex.: Titular: José Fonseca Saldo: €321.50 Data Abertura: 21/2/2017.

:white_check_mark: g) Um método `depositar(…)` que recebe o valor a depositar na conta (double) e atualiza o respetivo saldo.

:white_check_mark: h) `Um método levantar(…)` que recebe o valor a levantar da conta (double) e atualiza o respetivo saldo. Não devem ser
permitidos levantamentos que coloquem o saldo negativo.

:white_check_mark: Escreva a função `main()` para testar a classe `ContaBancária`. Crie uma conta, efetue depósitos e levantamentos e imprima no ecrã a informação da conta sempre que atualiza o saldo.

### Exercício 2:

**Codifique a classe [`Banco`](/src/ficha3/Banco.java) com os seguintes atributos e métodos:**

:white_check_mark: a) Um nome e um array de contas de objetos do tipo `ContaBancária` (ver exercício anterior).

:white_check_mark: b) Um `construtor` de instâncias da classe, que recebe por parâmetro o nome do banco e inicializa o array para cem itens.

:white_check_mark: c) Os métodos `getters` e `setters` para o array contas.

:white_check_mark: d) O método `criaConta(…)` que recebe uma `contaBancária` por parâmetro e acrescenta ao array.

:white_check_mark: e) O método `getConta(…)` que recebe o titular por parâmetro e devolve a conta desse titular.

:white_check_mark: Escreva a função `main()` para testar a classe `Banco`. Crie uma conta, efetue depósitos e levantamentos e imprima no ecrã a
informação da conta sempre que atualiza o saldo.

### Exercício 3:

**Crie uma classe [`Casa`](/src/ficha3/Casa.java), a qual deverá ter os seguintes atributos e métodos:**

:white_check_mark: Um atributo privado do tipo `String`, morada, para a morada da casa.

:white_check_mark:Dois atributos de acesso privado, `precoCusto` e `precoVenda`, com tipo `double`, para conterem respetivamente o preço de custo e o preço de venda da casa.

:white_check_mark: Um `construtor` de instâncias da classe, sem argumentos, que cria uma casa.

:white_check_mark: Um `construtor` de instâncias da classe que recebe por parâmetro a morada da casa e cria uma casa com essa morada.

:white_check_mark: Os métodos `getters` e `setters` dos três atributos definidos anteriormente.

:white_check_mark: Um método de instância `getMargemLucro()` que retorna a margem de lucro da casa (diferença entre o preço de venda e o preço de custo).

:white_check_mark: Um método de instância `getPercentMargemLucro()` que retorna a percentagem da margem de lucro (a razão entre o preço de venda e o preço de custo).

:white_check_mark: Escreva a função `main()` para testar a classe `Casa`. Crie três casas com
diferentes valores dos seus atributos.


### Exercício 4:

:white_check_mark: Novamente na classe `Banco`, adicione uma lista de casas. 

:white_check_mark: Adicione uma função para adicionar uma nova casa.

:white_check_mark: Adicione uma função que recebe a morada de uma casa e remove essa casa da lista de casas do `Banco`.

:white_check_mark:Adicione um método de instância `getLucroPrevisto`, que retorna a margem de lucro previsto da venda de todas as casas.

### Exercício 5:

:white_check_mark: **Faça a modelação do sistema com um diagrama de classes `UML` que descreve o sistema. Adicione o seu projeto ao GitHub e crie um ficheiro `README`. Adicione ao ficheiro `README` uma pequena descrição do projeto e adicione o diagrama `UML` (pode encontrar ajuda a escrever o ficheiro README aqui).**

## Diagrama de Classes
![Diagrama de classes](/src/ficha3/uml-ficha3.png)
