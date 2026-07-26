o = int(input("Número de relações lidas: "))
n = int(input("Tamanho da matriz: "))
vetor = [[0 for i in range (n)] for i in range (n)]

for i in range(o):
    l,c = input("Novo vértice ([l]inha [c]oluna): ").split()
    l = int(l)-1
    c = int(c)-1
    vetor[l][c] = 1
for k in range (o):
    for i in range (o):
        for j in range (o):
            if vetor[i][j] == 1 or (vetor[i][k] == 1 and vetor[k][j] == 1):
                vetor[i][j] = 1
for i in range (o):
    print(vetor[i])

