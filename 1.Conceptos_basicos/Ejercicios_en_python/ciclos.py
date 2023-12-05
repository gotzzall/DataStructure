# i = 1
# while i <= 5:
#     print(i)
#     i += 1

# print("Hfin del programa")

# def serieCiclica():
#     i = 1
#     n = 2
#     x = 3.0
#     d1 = 3.0
#     d2 = 1.0
#     r = 0

#     while i <= n:
#         r+= (x**(3.0/d1))/d2
#         d1 += 3
#         d2 += 2
#         i += 1
#     #print(f'El valor de la serie es: ', r)
#     print(f'El valor de la serie es: {r}')

# serieCiclica()

# Serie recursiva

def calcular (n, x, d1, d2, i):
    if i == n:
        return x**(3.0/d1)/d2
    else:
        return x**(3.0/d1)/d2 + calcular(n, x, d2+2, d1+3, i+1)

n = int(input('Introduce el valor de n: '))
x = int(input('Introduce el valor de x: '))
d1 = 3
d2 = 1
i = 1

r = calcular(n, x, d1, d2, i)

print(f'El resultado de la serie es: {r}')
