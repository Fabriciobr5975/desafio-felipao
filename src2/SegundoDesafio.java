package src2;
import java.util.Scanner;

public class SegundoDesafio {

	public static void main(String[] args) {
		// Variáveis;
		int vitorias, derrotas;
		// Declaração da classe Scanner ;
		Scanner leitor = new Scanner(System.in);

		// Estrutura que fica repetindo até receber os valores de vitórias e derrotas maiores ou igual a zero;
		do {
			System.out.println("Digite a quantidade de Vitórias e Derrotas do seu Herói, colocando números maiores ou iguais a 0:");
			vitorias = leitor.nextInt();
			derrotas = leitor.nextInt();
		} while (vitorias < 0 || derrotas < 0);

		// Varíáveis das Funções;
		int saldoDeRankeadas = rankingDoJogador(vitorias, derrotas);
		String classifNivelJogador = nivelDoJogador(vitorias, derrotas);

		// Imprimi na tela o saldo e o nível do Herói;
		System.out.printf("O Herói tem de saldo de %d e está no nível de %s", saldoDeRankeadas, classifNivelJogador);

		// Fechamendo do Scanner;
		leitor.close();
	}

	/**
	 * Esté método retorna o saldo de Rankeada que basicamente é o saldo de vitórias
	 * 
	 * @param vitorias Valor das vitórias do jogador
	 * @param derrotas Valor das Derrotas do jogador
	 * @return Saldo de saldo de vitórias
	 */
	
	public static int rankingDoJogador(int vitorias, int derrotas) {
		int classif = vitorias - derrotas;
		return classif;
	}

	/**
	 * Função que pega o resultado da função de cima e através dela retorna o nível do jogador de acordo com o seu saldo de vitórias
	 * 
	 * @param vitorias Valor das vitórias do jogador
	 * @param derrotas Valor das Derrotas do jogador
	 * @return Nível do jogador de acordo com o seu saldo de vitórias
	 */
	
	public static String nivelDoJogador(int vitorias, int derrotas) {
		int classVitorias = rankingDoJogador(vitorias, derrotas);
		String nivelDoJogador = null;

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

}
