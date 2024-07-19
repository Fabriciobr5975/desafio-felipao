/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package terceirodesafio;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author arauj
 */
public class TerceiroDesafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciando o objeto scanner da classe Scanner; 
        Scanner scanner = new Scanner(System.in);

        try {
            /*
             * Instanciando o objeto hero da classe Hero e depois chamando os
             * métodos que pegam os valores para o Herói, assim o objeto já é
             * construido com seus respectivos valores o valores.
             */
            Hero hero = new Hero(getNameHero(scanner), getAgeHero(scanner), getTypeOfHero(scanner));

            // Usando o ataque;
            hero.attack();

        } catch (InputMismatchException ex) {
            System.out.println("Você não pode colocar um valor do tipo STRING em um INT!");

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }

    /**
     * Método para pegar o nome do herói
     *
     * @param scanner - Recebe um objeto da classe Scanner para poder pegar via
     * console o nome do herói
     * @return - Retorna o nome desse herói para o construtor da classe Hero
     * @throws Exception - Exceção genérica caso alguma informação não planejada
     * seja inserida
     */
    public static String getNameHero(Scanner scanner) throws Exception {
        System.out.println("Digite o nome do Herói de 4 a 15 caracteres:");
        String name = scanner.nextLine();

        /*
         * Verificação para não deixar o nome vazio e não deixar que o nome
         * ultrapasse valores definidos          
         */
        while (name == null || name.length() < 4 && name.length() > 15) {
            System.out.println("Nome inválido, digite novamente:");
            name = scanner.nextLine();
        }

        return name;
    }

    /**
     * Método para pegar a idade do herói
     *
     * @param scanner - Recebe um objeto da classe Scanner para poder pegar via
     * console o nome do herói
     * @return - Retorna a idade do herói para o contrutor da classe Hero
     *
     * @throws Exception - Exceção genérica caso alguma informação não planejada
     * seja inserida
     * @throws InputMismatchException - Caso o usuário insira um valor que não
     * corresponda a um INT
     */
    public static int getAgeHero(Scanner scanner) throws Exception, InputMismatchException {
        System.out.println("Digite a idade do Héroi:");
        int age = scanner.nextInt();

        /*
         * Verificação simples, onde caso o herói tenha idade inferior a 10 ou
         * idade superior a 1000 o programa deverá pedir a idade novamente
         */
        while (age < 10 || age > 1000) {
            System.out.println("Idade inválida, digite novamente:");
            age = scanner.nextInt();
        }

        return age;
    }

    /**
     * Método para pegar o tipo de herói
     *
     * @param scanner - Recebe um objeto da classe Scanner para poder pegar via
     * console o nome do herói
     * @return - Retorna o tipo desse herói para o construtor da classe Hero
     * @throws Exception - Exceção genérica caso alguma informação não planejada
     * seja inserida
     */
    public static String getTypeOfHero(Scanner scanner) throws Exception {
        System.out.println("Digite o tipo do Herói:");
        String typeOfHero = scanner.next();

        return typeOfHero;
    }
}
