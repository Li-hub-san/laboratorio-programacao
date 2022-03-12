# Laboratório — programação

## ProjetoExtra 1

**1. Descrição**

Neste projeto pretende-se que o aluno desenvolva uma aplicação que gere uma `AppStore`, permitindo a inserção e consulta
de informação relevante.

Existem dois tipos de utilizadores:`Cliente` e `Programador`. Cada _Utilizador_ é caraterizado:

`String` nome;

`int` idade;

`int` id;

Os clientes realizam compras na `AppStore`.

Os programadores são caraterizados pelas aplicações que desenvolveram, e pelas avaliações dos utilizadores às aplicações
que desenvolveram (classificação de 1 a 5).

A `Aplicacao` tem associado:

`String` nome;

`double` preço;

`double` avaliação; (classificação de 1 a 5)

`ENUM` tipo; (Games, Business, Education, Lifestyle, Entertainment, Utilities, Travel e Health & Fitness)

`Programador` programador;

As compras das aplicações ocorrem numa determinada data e com um preço determinado. Cada compra pode conter várias
aplicações e está sempre associado a um cliente.

A avaliaçãodos programadorese das aplicações é dinâmica e, é atualizada à medida que novos utilizadores avaliam, devendo
representar a média de todas as classificações.

Os utilizadores avaliam as aplicações só após estas terem sido compradas.

Além da avaliação (classificação de 1 a 5), os utilizadores também podem opcionalmente deixar comentários.

A aplicação da App Store deve permitir:

•Registar novos utilizadores e atribuir automaticamente números únicos.

•Incluir novas aplicaçõescom a informação necessária.

•Listar todos os utilizadores da App Store. Para cada utilizador é mostrado o nome, idade, e número de utilizador.

•Realizar compras de aplicações.•Atribuir a uma aplicaçãouma avaliação (e comentários) dados por um utilizador e
atualizar aclassificaçãodo programador e da aplicação.

•Fazer listagens seletivas das ‘apps’ por categoria e por classificação dos utilizadores.

•Fazer listagens ordenadas das ‘apps’ por nome, por número de vendas e porclassificação dos utilizadores.

•Listar as classificações e comentários (se houver) de uma aplicaçãoem concreto.

•Listar as aplicações de um utilizador em concreto (independentemente de ser cliente ou programador).

•Imprimir o valor total que a App Store recebeu do conjunto dos seus utilizadores.

•Imprimir o valor total que cada programador recebeu do conjunto das suas apps.

•Sair da aplicação.

**2. Considerações gerais:**

O problema deve ser abordado de forma gradual, começando pela fase demodelação. As classes devem ser testadas à medida
que vão sendo desenvolvidas. Os pormenores de ‘interface’ com o utilizador não são considerados e deverão ser
implementados da forma considerada mais pertinente. 