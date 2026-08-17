def euclides(a,b):
    if b == 0:
        return a
    return euclides(b, a % b)

""" Euclides estendido utiliza a compreensão de que MDC(a,b) é um inteiro s que representa o menor valor
positivo que satisfaz a equação s = ax+by = mdc(a,b), para que com pequenos ajustes no algoritmo de euclides,
seja possível descobrir os coeficientes inteiros x e y que tornem a soma de a e b o valor do MDC(a,b). Em
outras palavras, o mdc(a,b) é uma combinação linear discreta entre os próprios a e b e esse algoritmo
encontra essa combinação. 
"""
def euclidesEstendido(a, b):
    if b == 0:
        # No euclides original seria retornado o valor a nesse ponto, portanto a combinação nesse ponto pode
        # ser compreendida como 1*a + 0*b.
        return a, 1, 0
    # É possível usando um pouco de noção de relações de recorrência, "desfazer" os passos do algoritmo
    # de Euclides padrão para encontrar como esses coeficientes devem parecer considerando as operações
    # feitas. O MDC permanece igual, como b sempre é "jogado" para a, à cada passo do algoritmo, o coefi-
    # ciente y também deve ser passado o coeficiente x à cada passo da recursão. Por fim o termo mais
    # complexo para obter y_parcial, é de certo modo o inverso da operação modular. Como são necessários
    # esses pequenos ajustes, as variáveis são salvas em valores parciais.
    mdc, x_parcial, y_parcial = euclidesEstendido(b, a % b)
    return mdc, y_parcial, y_parcial*(a // b) + x_parcial

a = int(input("Digite o valor a do MCD: "))
b = int(input("Digite o valor b do MDC: "))
mdc = euclides(a,b)
mmc = int(a*b/ mdc)
print(f"MDC = {mdc}\nMMC = {mmc}")
mdc, x, y = euclidesEstendido(a,b)
print(f"A combinação linear do MDC é: {mdc} = {a}*{x} + {b}*{y}")