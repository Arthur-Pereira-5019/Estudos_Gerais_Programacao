def metodoGaussiano(A, m, n):
    h = 0
    k = 0
    while h < m and k < n:
        i_max = argmax(A,k,h,m)
        if A[i_max][k] == 0:
            k = k + 1
        else:
            inverter_linhas(A, h, i_max)
            for i in range(h+1,m):
                f = A[i][k] / A[h][k]
                A[i][k] = 0
                for j in range(k+1,n):
                    A[i][j] = A[i][j] - A[h][j] * f
            h = h + 1
            k = k + 1
    return A

def inverter_linhas(A, pos_l1, pos_l2):
    l_mem = A[pos_l1]
    A[pos_l1] = A[pos_l2]
    A[pos_l2] = l_mem
    return A

def argmax(A, coluna, inicio, fim):
    arg = inicio
    max_v = abs(A[inicio][coluna])
    for i in range (inicio,fim):
        if abs(A[i][coluna]) > max_v:
            arg = i
            max_v = abs(A[i][coluna])
    return arg
