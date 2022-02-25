# Laboratório — programação

## Ficha de exercícios 4

## Problema

Crie um novo projeto. Numa loja, toda a fruta vendida tem um nome e um preço base. Porém, a loja vende fruta em três modalidades: à unidade, ao peso ou pelo volume.

### Exercício 1: 

:white_check_mark: Crie uma hierarquia onde [`Fruta`](https://github.com/Li-hub-san/laboratorio-programacao/blob/main/src/ficha4/fruta/Fruta.java) é uma classe abstrata, com as subclasses [`FrutaUnidade`](https://github.com/Li-hub-san/laboratorio-programacao/blob/main/src/ficha4/fruta/FrutaUnidade.java), [`FrutaPeso`](https://github.com/Li-hub-san/laboratorio-programacao/blob/main/src/ficha4/FrutaPeso.java), e
[`FrutaVolume`](https://github.com/Li-hub-san/laboratorio-programacao/blob/main/src/ficha4/fruta/FrutaVolume.java).

:white_check_mark: a) A classe abstrata deverá ter as variáveis comuns a todas as subclasses
método abstrato double pagar(). Inclua os métodos concretos que considerar adequados.

:white_check_mark: b) Defina as classes `FrutaUnidade`, `FrutaPeso`, e `FrutaVolume`, como subclasses de `Fruta`,
dando a adequada implementação ao método double `pagar()` para cada caso. _Nota: a classe FrutaUnidade terá uma variável quantidade do tipo int, enquanto que as classes FrutaPeso e FrutaVolume terão respetivamente uma variável peso do tipo float e volume do tipo float._

:white_check_mark: Escreva a função `main()` para testar as classes acima descritas.

### Exercício 2
:white_check_mark: Defina a classe `Cesto`, que representa um conjunto de frutas adquiridas.
Esta classe deverá implementar o seguinte:

:white_check_mark: a) Uma variável de instância para o total de items no cesto e uma constante que determina a capacidade máxima do cesto como sendo 100. Inclua também um array de Fruta para representar o cesto, que é um conjunto de frutas.

:white_check_mark: b) Um método que insere no cesto diferentes tipos de fruta.

:white_check_mark: c) Um método que calcula o valor total da fruta no cesto. 

:white_check_mark: d) Um método (deverá receber como parâmetro uma `String` tipoFruta )que determina o número de frutos de um dado tipo existentes no cesto.

:white_check_mark: e) Um método (que deverá receber como parâmetro uma `String` tipoFruta) que determina o valor total gasto em frutos de um dado tipo.

:white_check_mark: Na classe principal, crie um cesto e insira vários tipos de fruta. Teste todos os métodos.

### Exercício 3 

Toda a fruta a peso e toda a fruta a volume podem ter um desconto de uma determinada percentagem. 

:white_check_mark: Crie uma interface `Descontavel` que tem um método double descontar(double percentagem) que será implementado pela classe `FrutaPeso` e pela class `FrutaVolume`.

:white_check_mark: Faça as alterações necessárias nestas classes.

:white_check_mark: Escreva a função `main()` para testar as respetivas alterações.
