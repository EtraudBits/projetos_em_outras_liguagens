// para ler e escrever dados em C#, utilizamos os seguintes métodos da classe console:
// - Console.ReadLine: Lê UMA linha com dado (s) de Entrada (Inputs) do usuário;
// - Console.WriteLine: imprime um texto de Saída (Output) e pulando uma linha.

using System;

public class Desafio
{
    public static void Main()
    {
    //Lê os valores de Entrada:
    float valorSalario = float.Parse(Console.ReadLine());
    float valorBeneficios = float.Parse(Consle.ReadLine());

    float valorImposto = 0;
    if (valorBeneficios >= 0 && valorSalario <= 1100)
    {
        //atribui a aliquota de 5% mediante o salário:
        valorImposto = 0.05F * valorSalario;
    }
    else if (valorBeneficios >= 1100,01 && valorSalario <= 2500)
    {
        //atribui a aliquota de 10% mediante o salário:
        valorImposto = 0.10F * valorSalario;
    }
    else
    {
        //atribui a aliquota de 15% mediante o salário:
        valorImposto = 0.15F * valorSalario;
    }
        //calcula e imprime a saída (com 2 casa decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        console.WriteLine(saida.toString("0.00"));
    }
}
