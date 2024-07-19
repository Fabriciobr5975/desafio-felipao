// Variáveis;
let nomeHeroi = "TU5JP4";
let xp = 1;
let classif = "";

// Estrutura de repetição;
do {

	if (xp < 0) { // Se a variável xp for menor que 0 o código vai encerrar com essa mensagem;
		console.log("XP Inválido!, mude a opção xp para um valor maior ou igual a 0");
		break;

	}
	// Se a variável for maior ou igual a 0 ele ira verificar em qual das opções a variável xp se encaixa;
	if (xp <= 1000) {
		classif = "Ferro";

	} else if (xp >= 1001 && xp <= 2000) {
		classif = "Bronze";

	} else if (xp >= 2001 && xp <= 6000) {
		classif = "Prata";

	} else if (xp >= 6001 && xp <= 7000) {
		classif = "Ouro";

	} else if (xp >= 7001 && xp <= 8000) {
		classif = "Platina";

	} else if (xp >= 8001 && xp <= 9000) {
		classif = "Ascedente";

	} else if (xp >= 9001 && xp <= 10000) {
		classif = "Imortal";

	} else {
		classif = "Radiante";
	}

	// Mensagem final se a variável xp for maior ou igual a zero, onde a classificação será dada de acordo com a quantidade de xp;
	console.log("O Herói " + nomeHeroi + " está no nivel " + classif)
	break;

	// Fim da estrutura de repetição:
} while (xp >= 0);

