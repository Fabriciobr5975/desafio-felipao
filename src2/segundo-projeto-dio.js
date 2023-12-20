// Variáveis;
let vitorias = 0;
let derrotas = 0;

// Constante para a mensagem do primeiro while;
const msg = "Número de vitórias ou de derrotas inválido, mude para algum número maior que 0!";

// Varíaveis das funções;
let saldoDeRankeadas = rankingDoJogador(vitorias, derrotas);
let classifNivelJogador = nivelDoJogador(vitorias, derrotas);

// Se o valor de vitória ou o valor de derrota for menor que 0 o progama deve mandar um mensagem de erro;
while (vitorias < 0 || derrotas < 0) {
    console.log(msg);
    break;
}

// Se os dois valores, vitória e derrota, forem maiores ou igual a 0, imprimi na tela o saldo e o nível do Herói; 
while (vitorias >= 0 && derrotas >= 0) {
    console.log(`O Herói tem de saldo de ${saldoDeRankeadas} e está no nível de ${classifNivelJogador}`);
    break;
}

// Função que retorna o saldo de Rankeada que basicamente é o saldo de vitórias;
function rankingDoJogador(quantVitorias, quantDerrotas) {
    let classif = quantVitorias - quantDerrotas;
    return classif;
}

// Função que pega o resultado da função de cima e através dela retorna o nível do jogador de acordo com o seu saldo de vitórias; 
function nivelDoJogador(vitorias, derrotas) {
    let classVitorias = rankingDoJogador(vitorias, derrotas);
    let nivelJogador = "";

    if (classVitorias <= 10) {
        nivelDoJogador = "Ferro";

    } else if (classVitorias > 10 && classVitorias <= 20) {
        nivelDoJogador = "Bronze";

    } else if (classVitorias > 20 && classVitorias <= 50) {
        nivelDoJogador = "Prata";

    } else if (classVitorias > 50 && classVitorias <= 80) {
        nivelDoJogador = "Ouro";

    } else if (classVitorias > 80 && classVitorias <= 90) {
        nivelDoJogador = "Diamante";

    } else if (classVitorias > 90 && classVitorias <= 100) {
        nivelDoJogador = "Lendário";

    } else {
        nivelDoJogador = "Imortal";

    }

    return nivelDoJogador;

}
