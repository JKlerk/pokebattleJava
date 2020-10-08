package nl.jklerk.pokemons;

import nl.jklerk.Attack;
import nl.jklerk.Pokemon;
import nl.jklerk.Resistance;
import nl.jklerk.Weakness;

import java.util.ArrayList;

public class Pikachu extends Pokemon {
    public Pikachu(String name){
        super(name, "Lightning", 60f, new Weakness("Fire", 1.5f), new Resistance("Fighting", 0.5f), new ArrayList(){{add(new Attack("Attack1", 20f));add(new Attack("Attack2", 20f));}});
    }
}
