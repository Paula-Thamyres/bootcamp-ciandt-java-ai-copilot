<p align="center">
  <img src="assets/banner.svg" alt="Bootcamp CI&T · Java AI Copilot" width="100%">
</p>

# bootcamp-ciandt-java-ai-copilot

Desafios e exercícios do bootcamp CI&T · Java AI Copilot.

<p align="center">
  <img src="https://img.shields.io/badge/JAVA-FA5A50?style=for-the-badge" alt="Java">
  <img src="https://img.shields.io/badge/BOOTCAMP_CI%26T-690037?style=for-the-badge" alt="Bootcamp CI&T">
  <img src="https://img.shields.io/badge/AI_COPILOT-FAB9FF?style=for-the-badge" alt="AI Copilot">
</p>

<p align="center">
  <img src="assets/faixa.svg" alt="Faixa nas cores da CI&T" width="100%">
</p>

<p align="center">
  <img src="https://img.shields.io/github/last-commit/Paula-Thamyres/bootcamp-ciandt-java-ai-copilot?style=for-the-badge&label=%C3%9ALTIMO%20COMMIT&labelColor=FA5A50&color=690037" alt="Último commit">
  <img src="https://img.shields.io/github/languages/top/Paula-Thamyres/bootcamp-ciandt-java-ai-copilot?style=for-the-badge&label=LINGUAGEM&labelColor=FA5A50&color=690037" alt="Linguagem principal">
  <img src="https://img.shields.io/github/commit-activity/t/Paula-Thamyres/bootcamp-ciandt-java-ai-copilot?style=for-the-badge&label=COMMITS&labelColor=FA5A50&color=690037" alt="Total de commits">
</p>

## Índice

- [Progresso](#progresso)
- [Desafios](#desafios)
- [Como rodar](#como-rodar)
- [Desafio 01: Condicionais e Laços](#desafio-01-condicionais-e-laços)
- [Desafio 02: Portal Divisível por 3](#desafio-02-portal-divisível-por-3)

<p align="center">
  <img src="assets/faixa.svg" alt="" width="100%">
</p>

## Progresso

<p align="center">
  <img src="assets/progresso.svg" alt="Progresso do bootcamp: desafio 01 em andamento e desafio 02 concluído" width="100%">
</p>

O desafio 01 está em andamento e o desafio 02 está concluído.

<p align="center">
  <img src="assets/faixa.svg" alt="" width="100%">
</p>

## Desafios

<p align="center">
  <a href="01-desafio-condicionais-e-lacos/"><img src="assets/card-01.svg" alt="Desafio 01 · Condicionais e Laços · Em andamento" width="190"></a>
  <a href="01-desafio-condicionais-e-lacos/02-portal-divisivel-por-3/"><img src="assets/card-02.svg" alt="Desafio 02 · Portal Divisível por 3 · Concluído" width="190"></a>
</p>

<p align="center">
  <img src="assets/faixa.svg" alt="" width="100%">
</p>

## Como rodar

Os exercícios rodam no terminal e precisam apenas do JDK instalado.

![1](https://img.shields.io/badge/1-FA5A50?style=flat-square) **Confira se o compilador está disponível**

```bash
javac -version
```

![2](https://img.shields.io/badge/2-690037?style=flat-square) **Clone o repositório e entre na pasta**

```bash
git clone https://github.com/Paula-Thamyres/bootcamp-ciandt-java-ai-copilot.git
cd bootcamp-ciandt-java-ai-copilot
```

![3](https://img.shields.io/badge/3-FAB9FF?style=flat-square) **Entre na pasta do exercício, compile e execute**

Exemplo com o primeiro:

```bash
cd 01-desafio-condicionais-e-lacos/01-sequencia-equilibrada
javac Main.java
java Main
```

> [!NOTE]
> Compile e execute sempre de dentro da pasta do exercício. Depois do `java Main`, o programa espera a entrada no terminal: digite os valores e aperte Enter.

<p align="center">
  <img src="assets/faixa.svg" alt="" width="100%">
</p>

## Desafio 01: Condicionais e Laços

<p align="center">
  <img src="assets/desafio-01.svg" alt="Desafio 01 · Condicionais e Laços" width="100%">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/01-FAB9FF?style=for-the-badge" alt="Desafio 01">
  <img src="https://img.shields.io/badge/B%C3%81SICO-690037?style=for-the-badge" alt="Nível básico">
  <img src="https://img.shields.io/badge/IF_%2F_ELSE-FA5A50?style=for-the-badge" alt="if / else">
  <img src="https://img.shields.io/badge/FOR-FA5A50?style=for-the-badge" alt="for">
  <img src="https://img.shields.io/badge/WHILE-FA5A50?style=for-the-badge" alt="while">
  <img src="https://img.shields.io/badge/SCANNER-FA5A50?style=for-the-badge" alt="Scanner">
</p>

Desafios de código sobre condicionais e laços com Java.

### 1. Sequência equilibrada

Lê uma sequência de números e diz se ela é `equilibrada` (tem par, ímpar e nenhum negativo), `invalida` (tem algum negativo) ou `incompleta` (só pares ou só ímpares).

Leio a lista inteira mesmo depois de achar um negativo, para não deixar número sobrando na entrada. E uso `hasNextInt()` antes de cada leitura, então se faltar número o programa não quebra.

> [!TIP]
> Ao testar, digite também entradas que deveriam dar errado, como um número negativo no meio da lista.

#### Desafio

Em uma maratona de estudos de Java, a Academia Loop and If criou um painel que avalia sequências digitadas pelos novatos. Cada participante envia vários números inteiros, e o painel precisa decidir rapidamente se a sequência foi equilibrada. Uma sequência será considerada equilibrada quando contiver pelo menos um número par, pelo menos um número ímpar e nenhum valor negativo. Como o painel será usado em desafios introdutórios, a verificação deve ser simples, direta e feita com condicionais e laços.

Sua tarefa é ler uma quantidade informada de valores e analisar a lista completa. Se todos os números forem maiores ou iguais a zero e houver ao menos um par e ao menos um ímpar, imprima `equilibrada`. Se existir qualquer número negativo, imprima `invalida`. Caso não haja negativos, mas todos os números forem apenas pares ou apenas ímpares, imprima `incompleta`. O problema deve ser resolvido processando os valores em um único programa, sem depender de arquivos extras ou bibliotecas externas.

#### Entrada e saída

<table>
  <tr>
    <td align="center" valign="middle"><img src="https://img.shields.io/badge/ENTRADA-FA5A50?style=for-the-badge" alt="Entrada"></td>
    <td valign="middle">A primeira linha contém um inteiro N, indicando quantos números serão analisados. A segunda linha contém N inteiros separados por espaço. Considere 1 &lt;= N &lt;= 100.</td>
  </tr>
  <tr>
    <td align="center" valign="middle"><img src="https://img.shields.io/badge/SA%C3%8DDA-690037?style=for-the-badge" alt="Saída"></td>
    <td valign="middle">Imprima exatamente uma das três palavras: <code>equilibrada</code>, <code>invalida</code> ou <code>incompleta</code>, de acordo com a análise da sequência.</td>
  </tr>
</table>

#### Exemplos e casos de teste

<p align="center">
  <img src="assets/tabela-sequencia.svg" alt="Exemplos e casos de teste. 5 com 2 7 8 11 14: equilibrada. 4 com 2 4 6 8: incompleta. 3 com 1 3 5: incompleta. 4 com 2 -1 6 9: invalida. 2 com 0 3, zero conta como par: equilibrada. 3 com 2 3 -1: invalida." width="100%">
</p>

#### O que aprendi

<table>
  <tr>
    <td align="center" valign="middle"><img src="https://img.shields.io/badge/APRENDIZADO-FAB9FF?style=for-the-badge" alt="Aprendizado"></td>
    <td valign="middle">
      <ul>
        <li>Ler a lista inteira antes de decidir evita deixar número sobrando na entrada.</li>
        <li>Conferir com <code>hasNextInt()</code> antes de cada leitura impede o programa de quebrar quando falta número.</li>
      </ul>
    </td>
  </tr>
</table>

<p align="center">
  <img src="assets/faixa.svg" alt="" width="100%">
</p>

## Desafio 02: Portal Divisível por 3

<p align="center">
  <img src="assets/desafio-02.svg" alt="Desafio 02 · Portal Divisível por 3" width="100%">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/02-FF9A3C?style=for-the-badge" alt="Desafio 02">
  <img src="https://img.shields.io/badge/B%C3%81SICO-690037?style=for-the-badge" alt="Nível básico">
  <img src="https://img.shields.io/badge/IF_%2F_ELSE-FA5A50?style=for-the-badge" alt="if / else">
  <img src="https://img.shields.io/badge/FOR-FA5A50?style=for-the-badge" alt="for">
  <img src="https://img.shields.io/badge/SCANNER-FA5A50?style=for-the-badge" alt="Scanner">
</p>

Lê uma quantidade de tentativas e, para cada número, diz se o portal abre (`OPEN`), continua fechado (`CLOSED`) ou se a tentativa é inválida (`INVALID`).

Deixei a regra do portal numa função separada, para o laço só ler os números e montar a saída.

#### Desafio

Na Academia dos Desafios de Código, cada aprendiz precisa atravessar um corredor de portais numerados. Um portal só se abre quando o número informado segue uma regra simples de treinamento: ele deve ser positivo e divisível por 3. O mestre quer um verificador automático para analisar vários portais em sequência e registrar o resultado de cada tentativa.

Implemente um programa que leia uma quantidade de testes e, para cada número recebido, decida qual mensagem deve ser exibida. Se o número for menor ou igual a zero, a tentativa é inválida. Se for positivo e divisível por 3, o portal abre. Caso contrário, o portal permanece fechado. Esse desafio foi criado para praticar condicionais e laços, portanto a solução deve processar todos os casos usando repetição e decisões simples. Cada resultado deve ser produzido de forma independente, na mesma ordem em que os números forem lidos.

#### Entrada e saída

<table>
  <tr>
    <td align="center" valign="middle"><img src="https://img.shields.io/badge/ENTRADA-FA5A50?style=for-the-badge" alt="Entrada"></td>
    <td valign="middle">A primeira linha contém um inteiro N, indicando quantas tentativas serão analisadas. Nas N linhas seguintes, há um inteiro X por linha, representando o número digitado em um portal.</td>
  </tr>
  <tr>
    <td align="center" valign="middle"><img src="https://img.shields.io/badge/SA%C3%8DDA-690037?style=for-the-badge" alt="Saída"></td>
    <td valign="middle">Para cada tentativa, imprima uma linha. Use exatamente <code>INVALID</code> se X for menor ou igual a zero, <code>OPEN</code> se X for positivo e divisível por 3, ou <code>CLOSED</code> nos demais casos.</td>
  </tr>
</table>

#### Exemplos e casos de teste

<p align="center">
  <img src="assets/tabela-portal.svg" alt="Exemplos e casos de teste. 1 com 9: OPEN. 1 com 10: CLOSED. 1 com 0: INVALID. 3 com 3 4 -2: OPEN, CLOSED e INVALID. 1 com -3: INVALID. 1 com 2147483646: OPEN." width="100%">
</p>

#### O que aprendi

<table>
  <tr>
    <td align="center" valign="middle"><img src="https://img.shields.io/badge/APRENDIZADO-FAB9FF?style=for-the-badge" alt="Aprendizado"></td>
    <td valign="middle">
      <ul>
        <li>Checar primeiro se o número é menor ou igual a zero deixa a regra do 3 só para os positivos.</li>
        <li>Separar a regra do portal numa função deixa o laço simples e a regra mais fácil de testar.</li>
      </ul>
    </td>
  </tr>
</table>

<p align="center">
  <img src="assets/faixa.svg" alt="" width="100%">
</p>

<p align="center">
  <a href="https://github.com/Paula-Thamyres">
    <img src="assets/rodape.svg" alt="Paula Femina · github.com/Paula-Thamyres" width="100%">
  </a>
</p>
