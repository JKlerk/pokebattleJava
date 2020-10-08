package nl.jklerk.pokemons;

import nl.jklerk.Attack;
import nl.jklerk.Pokemon;
import nl.jklerk.Resistance;
import nl.jklerk.Weakness;

import java.util.ArrayList;

public class Charmeleon extends Pokemon {
    public Charmeleon(String name){
        super(name, "Fire", 60f, new Weakness("Water", 2f), new Resistance("Lightning", 0.5f), new ArrayList(){{add(new Attack("Attack1", 20f));add(new Attack("Attack2", 20f));}});
    }
}
