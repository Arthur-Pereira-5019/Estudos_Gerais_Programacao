import random

from Matematica.Geradores.GeradorDeMatrizes import gerarMatrizes
from Matrizes.MetodoGaussiano import metodoGaussiano
from Matrizes.Produtos import produtoDiagonalPrincial
from Meta.Exibicao import exibirMatriz

n = int(input("Quantos determinantes você quer resolver? "))
ordem_max = int(input("Até qual ordem de matriz você deseja resolver? "))
acertos = 0
for i in range(n):
    o = random.randint(2,ordem_max)
    M = gerarMatrizes(o,o)
    exibirMatriz(M, o)
    #TODO: Erro de sinal
    resposta_esperada = produtoDiagonalPrincial(metodoGaussiano(M,o,o),o)
    resposta = int(input("Digite o determinante: "))
    # TODO: EPSILON RELATIVO
    if resposta-resposta_esperada < 0.001:
        print("Parabéns!")
        acertos += 1
    else:
        print(f"A resposta esperada era: {resposta_esperada}")
print(f"Você fez {acertos}/{n} acertos!")



