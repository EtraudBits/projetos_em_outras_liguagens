'''
Para Ler e escrever dados em Python, utilizamos as seguintes funções:
- input: Lê UMA linha com dados (s) de Entrada do usuário;
- print: imprime um texto de Saída (output), pulando linha.
'''
#Função útil para o calculo do imposto (baseado nas aliquotas).
def calcular_imposto(salario):
    aliquota = 0.00
    if (salario >= 0 and salario <= 1100):
        aliquota = 0.05
    elif (salario >= 1100.01 and salario <= 2500):
        aliquota = 0.10
    else:
        aliquota = 0.15
    
    return aliquota * salario

#Lê os valores da Entrada
valor_salario = float(input())
valor_beneficios = float(input())

#calcula o imposto através da função "calcula_imposto":
valor_imposto = calcular_imposto(valor_salario)
#calcula e imprime a Saída (com 2 casas decimais):
saida = valor_salario - valor_imposto + valor_beneficios
print(f'{saida:.2f}')

