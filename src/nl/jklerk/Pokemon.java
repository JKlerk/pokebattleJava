package nl.jklerk;

import java.util.ArrayList;

public abstract class Pokemon {
    private final String name;
    private final String energytype;
    private Float hp;
    private Weakness weakness;
    private Resistance resistance;
    private ArrayList<Attack> attacks;

    protected Pokemon(String name, String type, Float hp, Weakness weakness, Resistance resistance, ArrayList<Attack> attacks){
        this.name = name;
        this.energytype = type;
        this.hp = hp;
        this.weakness = weakness;
        this.resistance = resistance;
        this.attacks = attacks;
    }

    public ArrayList<Attack> getAttacks() {
        return this.attacks;
    }

    public Attack getAttack(Integer i){
        return this.attacks.get(i);
    }

    public void getAttacksConsole(){
        for (Attack at: attacks) {
            System.out.println(at.getName());
        }
        System.out.println("\n");
    }

    public String getName(){
        return this.name;
    };

    public String getEnergytype(){
        return this.energytype;
    }

    public Float getHp(){
        return this.hp;
    }

    public void doDamage(Pokemon receiver, Integer choice){
        Pokemon attacker = this;
        Attack attack = getAttack(choice);

        Float multiplier;
        if(attacker.getEnergytype().equals(receiver.weakness.getName())){
            multiplier = receiver.weakness.getMultiplier();
            System.out.println("Its very effective!");
        } else if(attacker.getEnergytype().equals(receiver.resistance.getName())){
            multiplier = receiver.resistance.getMultiplier();
            System.out.println("Its not very effective!");
        } else{
            multiplier = 1f;
        }

        Float calcDamage = attack.getDamage() * multiplier;
        Float newHP = receiver.takeDamage(receiver, calcDamage);


        System.out.println(attacker.getName() + " did " + calcDamage + " against " + receiver.getName() + " with attack " + attack.getName() + " Hp is now at " + newHP + "\n");
    }

    public Float takeDamage(Pokemon receiver, Float damage){
        receiver.setHp(receiver.getHp() - damage);
        return receiver.getHp();
    }

    public void setHp(Float hp) {
        this.hp = hp;
    }
}

