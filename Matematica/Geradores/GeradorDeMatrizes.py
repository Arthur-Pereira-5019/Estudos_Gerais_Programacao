import random
def gerarMatrizes(linhas, colunas):
    M = []
    for i in range(colunas):
        l = []
        for j in range(linhas):
            l.append(random.randint(-30,30))
        M.append(l)
    return M