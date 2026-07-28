import math
limit = int(input("Forneça o limite dos primos: "))
p = []
s = []
for i in range (2,limit):
    p.append(i)

i = 0
while i < len(p):
    c = p[i]
    s.append(c)
    j = c
    while j < len(p):
        if p[j] % c == 0:
            p.pop(j)
        j+=1
    i+=1

for i in range(0,len(s)):
    print(s[i])