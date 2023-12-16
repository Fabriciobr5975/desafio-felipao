package src;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PrimeiroDesafio {

	public static void main(String[] args) {
		// Scanner;
		Scanner leitor = new Scanner(System.in);

		// Variáveis;
		String nomeHeroi, classif = null;
		double xp;

		// Entrada do valor da variável nomeHeroi;
		nomeHeroi = JOptionPane.showInputDialog(null, "Olá bravo guerreiro, digite abaixo o nome do Herói",
				"Nome do Herói", JOptionPane.QUESTION_MESSAGE);

		// Entrada do valor da variável xp, onde se o valor informado for menor que 0 o
		// JOption ira repetir a pergunta;
		do {

			xp = Double.parseDouble(
					JOptionPane.showInputDialog(null, String.format("Digite a quantidade de XP do %s", nomeHeroi),
							"XP do Héroi", JOptionPane.QUESTION_MESSAGE));

		} while (xp < 0);

		// Estrutuda de decisão que ira verificar qual é a classificação o Herói;
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

		} else if (xp > 10000) {
			classif = "Radiante";
		}

		// Mensagem mostrando os resultados;
		JOptionPane.showMessageDialog(null,
				String.format("O Herói %s tem %.0f de xp e a seu nível foi %s", nomeHeroi, xp, classif),
				"Classificação do Herói", JOptionPane.INFORMATION_MESSAGE);

		// Fechamento do Scanner;
		leitor.close();
	}
}
