// para ler e escrever dados em java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner (System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println: .imprime um texto de Saída (output) e pulando uma linha.

import java.util.Scanner;

public class Desafio {
    public static void main (String[] args) {
        //Le os valores de Entrada:
        Scanner leitorDeEntradas = new Scanner(Sysem.in);
        float valorSalario = leitorDeEntradas.nexfloat();
        float valorBeneficios = leitorDeEntradas.nexfloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100)
        {
            //atribuiu a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario
        }
        else if (valorSalario >= 1100,01 && valorSalario <= 2500)
        {
            //atribuiu a aliquota de 10% mediante o salário:
            valorImposto = 0.10F * valorSalario
        }    
        else 
        {
            //atribuiu a aliquota de 15% mediante o salário:
            valorImposto = 0.15F * valorSalario
        }
            //calcula e imprime a saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format(%.2f, saida));
       }
}