/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceirodesafio;

/**
 *
 * @author arauj
 */
public class Hero {

    // Atributos;
    private String name;
    private int age;
    private String typeOfHero;
    private String heroAttack = null;

    /**
     * Construtor da classe;
     *
     * @param name - Recebe o nome do herói
     * @param age - Recebe a idade do herói
     * @param typeOfHero - Recebe o tipo do herói
     */
    public Hero(String name, int age, String typeOfHero) {
        this.name = name;
        this.age = age;
        this.typeOfHero = typeOfHero;
    }

    /**
     * Método através do tipo do herói mostra uma mensagem com o tipo de ataque
     * desse herói, junto com algumas informações adicionais
     */
    public void attack() {
        if (this.typeOfHero.equalsIgnoreCase("mago")) {
            this.heroAttack = "Mago";

        } else if (this.typeOfHero.equalsIgnoreCase("guerreiro")) {
            this.heroAttack = "Espada";

        } else if (this.typeOfHero.equalsIgnoreCase("monge")) {
            this.heroAttack = "Artes Marciais";

        } else if (this.typeOfHero.equalsIgnoreCase("ninja")) {
            this.heroAttack = "Shuriken";

        } else {
            this.heroAttack = "Sem ataque";
        }

        System.out.println(String.format("O herói \"%s\" do tipo \"%s\" atacou usando \"%s\"", this.name, this.typeOfHero, this.heroAttack));
    }

    /**
     * Pega o valor salvo no atributo nome
     *
     * @return - Retorna o valor salvo no atributo name
     */
    public String getName() {
        return name;
    }

    /**
     * Muda o nome do herói
     *
     * @param name - Recebe o novo nome do herói
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Pega o valor salvo no atributo idade
     *
     * @return - Retorna o valor salvo no atributo age
     */
    public int getAge() {
        return age;
    }

    /**
     * Muda a idade do herói
     *
     * @param age - Recebe uma nova idade para o herói
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Pega o valor salvo no atributo typeOfHero
     *
     * @return - Retorna o valor salvo no atributo typeOfHero
     */
    public String getTypeOfHero() {
        return typeOfHero;
    }

    /**
     * Muda o tipo do herói
     *
     * @param typeOfHero - Recebe o novo tipo do herói
     */
    public void setTypeOfHero(String typeOfHero) {
        this.typeOfHero = typeOfHero;
    }

    /**
     * Pega o valor salvo no atributo heroAttack
     *
     * @return - Retorna o valor salvo no atributo heroAttack
     */
    public String getHeroAttack() {
        return heroAttack;
    }
}
