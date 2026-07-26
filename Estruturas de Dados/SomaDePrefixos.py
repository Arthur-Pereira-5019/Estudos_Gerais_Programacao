original = list(map(int,input("Digite uma lista de valores numéricos: ").split()))
n = len(original)
soma = [0]*n
soma[0] = original[0]
for i in range(1,n):
    soma[i] = original[i]+soma[i-1]
print("Após o algoritmo de Soma de Prefixos, esta é a nova lista: ")
print(soma)