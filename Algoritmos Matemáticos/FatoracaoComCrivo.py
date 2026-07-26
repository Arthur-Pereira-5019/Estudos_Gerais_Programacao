import math
encontrados = []
testaveis = []
fatores = []

valor = int(input("Diga o valor v a ser fatorado, tal que v E I; v > 1: "))

for i in range(2,math.floor(valor**0.5)):
    testaveis.append(i)

while len(testaveis) > 0:
    m = testaveis[0]
    encontrados.append(m)
    j = 0
    while j < len(testaveis):
        if testaveis[j] % m == 0:
            testaveis.pop(j)
        j+=1

fatorado = False
while not fatorado:
    if valor == 1:
        fatorado = True
    i = 0
    while encontrados[i] <= valor:
        if valor % encontrados[i] == 0:
            fatores.append(encontrados[i])
            valor /= encontrados[i]
            i-=1
        if len(encontrados) == i + 1:
            break
        fatorado = True
        i+=1

print("Os fatores são:")
print(fatores)
