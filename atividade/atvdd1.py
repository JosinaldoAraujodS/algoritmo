print("Programa 12 Casas")
nome = str(input("Informe seu nome: "))
dia = int(input("Informe o dia de nescimento: "))
mes = int(input("Informe o mes de nascimento: "))
ano = int(input("Informe o ano de nascimento: "))
alt = float(input("Informe sua altura: "))
peso = float(input("Informe seu peso: "))
sx = str(input("Informe seu sexo: "))

imc = peso / (alt*alt)

if sx == 'm':
    print(f'{nome} Cavaleiro de ALGO, ', end='')
    cav = "Cavaleiro"
elif sx == 'f':
    print(f'{nome} Amazona de ALGO, ', end='')
    cav = "Amazona"
if 18.5 < imc < 24.9:
    print(f'Parabéns {cav}, vc está apto!')
else:
    print(f'Não pode ser um {cav} devido seu peso!')

print("FIM DO PROGRAMA...")

