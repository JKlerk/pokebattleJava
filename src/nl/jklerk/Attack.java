package nl.jklerk;

public class Attack {
    private String name;
    private Float damage;

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
