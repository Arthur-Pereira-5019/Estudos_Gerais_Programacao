"""Solução em O(n) para o problema da maior sequência de valores do array, de forma holística e menos rigorosa, é possível
compreendê-lo da seguinte forma através dos seguintes fatos:
 * Um array puramente de positivos é o maior subarray.
 * Não escolher nenhum valor, é o equivalente a dizer que a maior soma é 0.
 * Caso o algoritmo esteja em uma sequência ruim, basta não registrá-la (por isso a segunda variável de melhor soma).
 * Caso o valor atual seja maior do que a sequência somada a ele, ele é candidato a uma nova sequência possivelmente maior.
"""

def kadane(valores: list[float]):
    melhorSoma = 0
    somaAtual = 0
    for i in range(len(valores)):
        valorAtual = valores[i]
        somaAtual = max(valorAtual, somaAtual+valorAtual)
        melhorSoma = max(somaAtual, melhorSoma)
    return melhorSoma

print(kadane(list(map(int,input("Digite uma sequência de valores numéricos: ").split()))))