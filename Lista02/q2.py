import random

print("Jogo do CRAPS!\n")

dado1 = random.randint(1,6)
dado2 = random.randint(1,6)
somaD = dado1 + dado2

print("Dado 1: " + str(dado1) + "\nDado 2: " + str(dado2))
lancamento = 0

if(somaD == 3 or somaD == 11):
    print("Parabéns, você ganhou!")
elif(somaD == 2 or somaD == 3 or somaD == 12):
    print("CRAPS! Você perdeu!")
else:
    print("\n=====Iniciando estágio 2!=====\n")
    ponto = somaD
    lancamento = 1

while(lancamento == 1):
    dado1 = random.randint(1,6)
    dado2 = random.randint(1,6)
    somaD = dado1 + dado2

    print("Dado 1: " + str(dado1) + "\nDado 2: " + str(dado2) + "\nPonto: " + str(somaD))
    print("\n")
    if(somaD == 7):
        print("CRAPS! Você perdeu!")
        lancamento = 0
    elif(somaD == ponto):
        print("Parabéns, você ganhou!")
        lancamento = 0