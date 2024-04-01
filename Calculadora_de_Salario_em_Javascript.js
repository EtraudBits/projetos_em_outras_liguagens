//Desafios JavaScript na DIO tem funções "gets" e "print" acessíveis globalmente:
// - "gets" : Lê UMA linha com dado (s) de entrada (inputs) do usuário;
// - "print": imprime um texto de saída (output), pulando linha.

//Lê os valores de Entrada:
const valorSalario = parseFloat(prompt());
const valorBeneficios = parseFloat(prompt());

//calcula o imposto através da função "calcularImposto":
const valorImposto = calcularImposto(valorSalario);
//calcula e imprime a saída (com 2 casas decimais):
const saida = valorSalario - valorImposto + valorBeneficios;
console.log (saida.toFixed(2));

//função útil para o calculo do imposto (baseado nas alíquotas).
function calcularImposto(salario) {
    let aliquota;
    if(salario >=0 && salario <= 1100){
        aliquota = 0.05;
    }
    else if (salario >= 1100.01 && salario <=2500){
        aliquota = 0.10;
    }
    else;
        aliquota = 0.15;

    return aliquota * salario;
}