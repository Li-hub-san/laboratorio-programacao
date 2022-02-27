# Laboratório - programação

## FICHA EXTRA 1

### Exercício 1

Considere que se pretende desenvolver uma aplicação para registo de navios num porto marítimo. Um navio é genericamente caracterizado pela seguinte informação:

:white_check_mark: Identificador do Navio, tipo `String`

:white_check_mark: Nome, tipo `String`

:white_check_mark: Ano de construção, tipo `Date`

:white_check_mark: Comprimento tipo `float`

:white_check_mark: Um navio `PortaContentores` é um navio com atributo adicional, o `númeroMáximoContentores (int)`.

:white_check_mark: Um navio `Petroleiro` é um navio com atributo adicional, `capacidadeCarga (float)`, em toneladas. 

:white_check_mark: Codifique as classes `Navio`, `PortaContentores` e `Petroleiro`, que representam respetivamente um navio qualquer, um navio porta-contentores e um navio petroleiro, incluindo `construtores`, métodos de acesso `getters` e mutação `setters`.


### Exercício 2

:white_check_mark: Implemente uma classe `Porto` (apenas os `atributos` e `construtor`) para armazenar a informação sobre a atracagem de navios (use o tipo de coleção que considerar mais apropriado). A classe deve incluir métodos para _(nota: pode adicionar métodos às classes anteriores se necessário)_:

:white_check_mark: • Adicionar um novo navio sem permitir a duplicação da Identificador do Navio;

:white_check_mark: • Devolver a quantidade máxima total de contentores de todos os navios porta-contentores atracados no porto;

:white_check_mark: • Devolver a capacidade total de carga de todos os navios porta-contentores e petroleiros atracados no porto, sabendo que um contentor tem capacidade para 10 toneladas;

### Exercício 3

Escreva as instruções necessárias, no método main(…), para criar um Porto com um navio petroleiro e um navio porta contentores (utilize qualquer valor para os parâmetros com um tipo de dados válido). Utilize o método para adicionar um novo navio. Valide que não é possível repetir a matrícula de navio, num mesmo porto

