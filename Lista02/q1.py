import math

vetor = [1,2,3,4,5]
media = 0

for i in range(5):
    media+= vetor[i]

media/=5

vetDif = []
variacao = 0

for i in range(5):
    dif = vetor[i] - media
    vetDif.append(math.pow(dif,2))
    variacao += vetDif[i];

variacao/=5

result = math.sqrt(variacao)

print("Variacao: " + str(variacao) + "\nMedia: " + str(media) + "\nDesvio: " + str(result))
