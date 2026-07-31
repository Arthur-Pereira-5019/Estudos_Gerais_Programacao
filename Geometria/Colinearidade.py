x1, y1 = map(int,input("Digite as posições x1 e y1: ").split())
x2, y2 = map(int,input("Digite as posições x2 e y2: ").split())
x3, y3 = map(int,input("Digite as posições x3 e y3: ").split())

"""
A colinearidade de três pontos, pode ser compreendida também como a pergunta simples de se três pontos
não formam um triângulo, portanto se encontrarmos que a área do triângulo que esses três pontos formam
é igual a 0, há colinearidade.
Existem várias fórmulas para se calcular a área de um triângulo, mas elas ou são situacionais, ou depen-
dem do conhecimento das arestas do triângulo, portanto não servem. Resta a que iguala a área do triân-
gulo com metade do determinante formado pelos três pontos, que é simples de ser memorizada além de ser
eficiente computacionalmente e não demandar muitas divisões.
Não encontrei uma explicação sobre o funcionamento dessa técnica que não fosse muito teórica, porém
encontrei uma demonstração interessante em: https://xaktly.com/TriangleDeterminant.html e que você
pode fazer você mesmo com um pedaço de papel:
 * Desenhe um triângulo de área não trivial de calcular sem decidir exatamente a coordenada de cada
   ponto para fins de abstração, apenas as anote como (x1,y1), (x2,y2), (x3,y3)
 * Desenhe um quadrado de modo que cada vértice do triângulo esteja em uma aresta diferente do quadrado. 
 * De forma abstrata, não haverão comprimentos para você se orientar, apenas o entendimento que o valor
   de cada aresta pode ser obtida com operações triviais nos pontos que você posicionou no retângulo;
 * Com isso, você pode obter a área do triângulo original calculando a área do quadrado e subtraindo
   da área dos três triângulos;
 * Ao final, você vai encontrar uma expressão como: (1/2)(−x2y3−x1y2+x2y1−x3y1+x1y3+x3y2)
 * Essa mesma expressão é obtida ao fazer: 
(1/2)det(x1 y1 1)
        (x2 y2 1)
        (x3 y3 1)
O que programáticamente é equivalente a:
"""
det = x1*y2 + y1*x3 + x2*y3 - y1*x2 - x1*y2 - y2*x3
if det == 0:
    print("Os pontos são colineares.")
else:
    print(f"Os pontos não são colineares, você informou um triângulo de área {(1/2)*det}")