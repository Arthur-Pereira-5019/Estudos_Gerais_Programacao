def produtoDiagonalPrincial(A,n):
    produto = 1
    for i in range(n):
        produto *= A[i][i]
    return produto