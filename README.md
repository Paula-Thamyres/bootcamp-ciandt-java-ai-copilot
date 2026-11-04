# bootcamp-ciandt-java-ai-copilot
Desafios e exercícios do bootcamp CI&T - Java AI Copilot

## Desafio: Condicionais e Laços
*Desafios de Código sobre Condicionais e Laços com Java*

Exercícios em Java do bootcamp CI&T - Java AI Copilot. Para rodar qualquer um,
entre na pasta dele e use `javac Main.java` e depois `java Main`.

### 1. Sequência equilibrada

Lê uma sequência de números e diz se ela é `equilibrada` (tem par, ímpar e nenhum
negativo), `invalida` (tem algum negativo) ou `incompleta` (só pares ou só ímpares).

Leio a lista inteira mesmo depois de achar um negativo, para não deixar número
sobrando na entrada. E uso `hasNextInt()` antes de cada leitura, então se faltar
número o programa não quebra.

#### Desafio

Em uma maratona de estudos de Java, a Academia Loop and If criou um painel que avalia sequencias digitadas pelos novatos. Cada participante envia varios numeros inteiros, e o painel precisa decidir rapidamente se a sequencia foi equilibrada. Uma sequencia sera considerada equilibrada quando contiver pelo menos um numero par, pelo menos um numero impar e nenhum valor negativo. Como o painel sera usado em desafios introdutorios, a verificacao deve ser simples, direta e feita com condicionais e laços.

Sua tarefa e ler uma quantidade informada de valores e analisar a lista completa. Se todos os numeros forem maiores ou iguais a zero e houver ao menos um par e ao menos um impar, imprima equilibrada. Se existir qualquer numero negativo, imprima invalida. Caso nao haja negativos, mas todos os numeros sejam apenas pares ou apenas impares, imprima incompleta. O problema deve ser resolvido processando os valores em um unico programa, sem depender de arquivos extras ou bibliotecas externas.

#### Entrada

A primeira linha contem um inteiro N, indicando quantos numeros serao analisados. A segunda linha contem N inteiros separados por espaco. Considere 1 <= N <= 100.

#### Saída

Imprima exatamente uma das tres palavras: equilibrada, invalida ou incompleta, de acordo com a analise da sequencia.

#### Exemplos

A tabela abaixo apresenta exemplos de entrada e saída:

| Entrada | Saída |
|---|---|
| 5 2 7 8 11 14 | equilibrada |
| 4 2 4 6 8 | incompleta |
| 3 1 3 5 | incompleta |
| 4 2 -1 6 9 | invalida |
