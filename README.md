# Sistema de Luta em Java

## Visão Geral
Este projeto implementa um sistema de luta simples em Java, utilizando conceitos de Programação Orientada a Objetos (POO), como encapsulamento e relacionamento entre classes. Ele permite a criação de lutadores e a simulação de lutas entre eles, com resultados determinados aleatoriamente.

## Estrutura do Projeto
1. **Lutador** (localizada no pacote entities): Representa um lutador com atributos como nome, nacionalidade, idade, altura, peso, vitórias, derrotas e empates. A classe também define métodos personalizados para exibir o status do lutador e para atualizar seus registros de vitórias, derrotas e empates.

2. **Luta** (localizada no pacote entities): Gerencia as lutas entre dois lutadores. A classe verifica se a luta pode acontecer, assegurando que ambos os lutadores pertencem à mesma categoria de peso, e simula o resultado da luta usando um gerador de números aleatórios.

3. **Program** (localizada no pacote application): Contém o método main, que cria instâncias de lutadores e simula uma luta entre dois deles. Após a luta, o status dos lutadores é atualizado e exibido.

## Pilares de POO Aplicados
- **Encapsulamento:** Os atributos das classes Lutador e Luta são privados, e o acesso a eles é feito através de métodos públicos (getters e setters). Isso protege os dados das classes e permite maior controle sobre como eles são manipulados.

- **Relacionamento entre Classes:** As classes Luta e Lutador estão inter-relacionadas, com a classe Luta dependendo de instâncias de Lutador para criar e simular uma luta.

## Como Executar
1. Clone o repositório.
2. Compile as classes `Lutador.java`, `Luta.java` e `Program.java`.
3. Execute o programa a partir da classe `Program`, que simulará uma luta entre dois lutadores pré-definidos.

## Melhorias Futuras
- Implementação de um sistema de pontuação baseado em rounds.
- Adição de novas categorias de peso.
- Interface gráfica para simulação das lutas.

## Contribuição
Sinta-se à vontade para contribuir com melhorias ou novas funcionalidades. Para isso, faça um fork deste repositório, crie uma branch para sua feature, e submeta um pull request.
