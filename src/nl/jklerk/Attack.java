package nl.jklerk;

public class Attack {
    private final String name;
    private final Float damage;

    public Attack(String name, Float damage){
        this.name = name;
        this.damage = damage;
    }

    public String getName(){
        return this.name;
    }

    public Float getDamage(){
        return this.damage;
    }
}
