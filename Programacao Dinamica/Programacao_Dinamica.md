# Programação Dinâmica

* Técnica para modelar e resolver problemas de forma otimizada.
* Consiste em quebrar o problema em pedaços pequenos e então juntar os resultados para formar a resposta completa.
* Fortemente orientada pela tomada de decisão em estágios.
* Conhecida como "Dividir para Conquistar".
* Baseado no princípio da otimalidade de Bellman.
* O modelo do problema e sua solução são a mesma coisa nessa técnica.

## Conceitos-chave:
* **Estágio:** Ponto em que o sistema tem de tomar uma decisão.
    * Caso o sistema seja progressivo, a decisão se baseia em estágios anteriores.
    * Caso o sistema seja regressivo, a decisão sem baseia em estágios futuros.
* **Estado**
    * Situação do sistema no momento do estágio, é usado para tomada de decisões
    * A tomada de decisões altera o estado do sistema.
* **Decisão:**
    * Muda o estado do sistema em um estágio.
    * Cada decisão possui um valor, sendo utilizado para o sistema escolher se deve ser tomada ou não.
* **Política:**
    * Sequência de decisões para cada estágio, busca-se a melhor política. (Equivalente a solução ótima em outros métodos de modelagem e solução de problemas)

## Otimalidade de Richard Bellman (1920-1984)

"Uma política ótima tem a propriedade de que, independentemente das decisões e estados iniciais, as decisões restantes devem constituir uma política ótima com respeito ao estado resultante da primeira decisão."

## Recursividade
A programação dinâmica é altamente baseada em recursão, isto é, a solução de um problema através da chamada de um trecho de código que chama a si mesmo até um limite estabelecido até alcançar o resultado. Na matemática é possível encontrar isso em funções que dependem de subresultados da mesma função com um parâmetro diferente.

**Exemplos:**
* Cálculo do valor do n-ésimo termo da sequência de Fibonacci:
  ``` 
  f(n) = f(n-1) + f(n-2);
  Onde n é o termo e f(n) é o valor daquele termo; 
  Os "limites" dessa função são f(0) = 0 e f(1) = 1.
  ```
* Cálculo de um número fatorial:
  ``` 
  f(n) = n * (n-1) * (n-2) * ... * 2 * 1;
  f(n) = n * (n-1) * (n-2) * ... * f(2);
  f(n) = n * (n-1) * f(n-2);
  f(n) = n * f(n-1);
  Onde n é um número inteiro;
  f(n) é o fatorial de um número;
  Os "limites" dessa função são f(0) = 1 e f(1) = 1;
  ```

Os limites que definimos para essas funções chamamos de condições de contorno. Essas condições de contorno são vitais, pois sem elas, o código executará infinitamente.

## A programação dinâmica em si:

Entretanto, há de se tomar um cuidado para não confundir recursividade pura com programação dinâmica, pois a programação dinâmica apesar de se basear na recursividade, são empregados outros métodos e técnicas para otimizar a recursão. A necessidade dessa otimização pode ser facilmente visualizada com a solução da sequência de Fibonacci com recursão:
```
Digamos que queremos o nono termo da sequência de Fibonacci (Considerando o 0 como primeiro termo):
n = 8;
f(8) = f(7) + f(6);
f(8) = f(6) + f(5) + f(5) + f(4)
f(8) = f(5) + f(4) + (f4) + f(3) + f(4) + f(3) + f(3) + f(2);
f(8) = f(4) + f(3) + f(3) + f(2) + f(3) + f(2) + (f2) + f(1) + f(3) + f(2) + f(2) + f(1) + f(2) + f(1) + f(1) + f(0)
```
A função chama os mesmos métodos dezenas de vezes, apenas para o nono termo da equação, no mundo real, dificilmente esse seria o input. É facilmente perceptível o caráter de O(2^n) na notação Big O, o que significa que para cada acréscimo na entrada, a complexidade cresce numa potência de dois. Nesse caso uma técnica de otimização que aproximaria esse problema da programação dinâmica seria armazenar os valores parciais em variáveis, assim dispensando a necessidade de recálculo.


## Referências:

[Playlist de Programação Dinâmica por dr. Pedro Munari](https://www.youtube.com/playlist?list=PLjK8TkmwOe0oDH6JUlqXJ08Kh7CJNNMj0)
