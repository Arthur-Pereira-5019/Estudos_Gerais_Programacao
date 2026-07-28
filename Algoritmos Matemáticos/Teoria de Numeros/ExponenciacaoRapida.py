def expo_rapida(valor,expoente):
    if valor == 1:
        return 1
    if expoente == 0:
        return 1
    parcial = expo_rapida(valor, expoente//2)
    if expoente % 2 == 0:
        return parcial*parcial
    return parcial*parcial*valor

valor = int(input("Digite o valor a ser exponenciado: "))
expoente = int(input("Digite o expoente do valor: "))
print(expo_rapida(valor, expoente))

