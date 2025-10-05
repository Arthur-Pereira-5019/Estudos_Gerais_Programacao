
# **Polígonos**

- Planos, fechados, constituídos por segmentos de retas, portanto, sem curvas.
- Polígonos simples não se cruzam, complexos sim.
- Convexos são aqueles que permitem que ao traçar uma reta entre dois pontos quaisquer dentro do polígono, a reta esteja contida completamente pelo polígono, enquanto nos côncavos, isto não é uma garantia.
- ## **Classificação:**
    - **Equiângulo:** Ângulos iguais
    - **Equilátero:** Lados iguais
    - **Regular:** Equiângulo e Equilátero

- ## **Elementos e Dados:**
    - **Vértice:** Pontos de onde partem os segmentos.
    - **Lado:** Os segmentos
    - **Ângulos:**
        - **Internos:** Ângulo no encontro dos segmentos
        - **Externos:** Ângulo ao lado externo de um polígono, formado entre uma reta e uma extensão da próxima reta.
    - **Diagonal**: Segmento de ligação entre duas retas não consecutivas.
    - **Área**: Espaço bidimensional ocupado pelo polígono.
    - **Apótema**: Segmento de reta entre o ponto médio de um lado e o ponto central do polígono.
    - **Perímetro**: Somatório do comprimento de todos os lados do polígono.


## Cada polígono convexo regular possui suas especificidades:

### **Triângulos:**
 - Polígono com menor número de lados possível.
 - (A)rea = 
   - b.h/2 
   - b.c\*sen(alpha)/2 (triângulos retângulos)
   - l²*sqrt(3)/4
   - sqrt(p\*(p-a)\*(p-b)\*(p-c)) (Fórmula de Herão)
 - Semi(p)erímetro = (a+b+c)/2

### **Quadriláteros:**
  - Paralelogramo: Dois pares de lados que são paralelos. (Quadrados e Losangos)
    - Retângulos: Casos de Paralelogramos que só possuem ângulos retos.
    - Losangos: Casos de Paralelogramos que possuem lados de mesma medida.
    - Quadrados: Figuras que são Losangos e Retângulos.
    *(A)rea = b\*h*

    *(p)erimetro = 2\*(a+b)*

  - Trapézios: Possuem apenas um par de lados paralelos.
    - Retângulos: Possui ângulo reto.
    - Isóceles: Os lados não paralelos (geralmente as retas da esquerda e da direita em boa parte das representações) são de tamanhos iguais.
    - Escalenos: Todos os lados possuem comprimentos diferentes.
  - Irregulares: Não possuem quaisquer tamanhos iguais.
