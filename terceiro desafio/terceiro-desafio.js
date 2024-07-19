class hero {
    constructor(name, age, typeOfHero){
        this.name = name;
        this.age = age;
        this.typeOfHero = typeOfHero;
    }

    attack(typeOfHero){       
        let HeroAttack = "";
        
        if (typeOfHero === "mago" || typeOfHero === "MAGO" || typeOfHero === "Mago"){
            HeroAttack = "magia"
        
        } else if(typeOfHero === "guerreiro" || typeOfHero === "GUERREIRO" || typeOfHero === "Guerreiro"){
            HeroAttack = "espada"
        
        } else if(typeOfHero === "monge" || typeOfHero === "MONGE" || typeOfHero === "Monge"){
            HeroAttack = "artes marciais"

        } else if(typeOfHero === "ninja" || typeOfHero === "NINJA" || typeOfHero === "Ninja"){
            HeroAttack = "shuriken"
            
        } else{
            HeroAttack = "Sem ataque";

        }
        
        console.log(`O ${typeOfHero} atacou usando ${HeroAttack}`)

    }

}

let testHero = new hero("Testando", 20 , "monge")

testHero.attack(testHero.typeOfHero)
