package nl.jklerk;

import java.util.ArrayList;

public class Pokemon {
    private final String name;
    private final String energytype;
    private final Weakness weakness;
    private final Resistance resistance;
    private final ArrayList<Attack> attacks;
    private Float hp;

    /**
     *
     * @param name nickname of the pokemon
     * @param type energytype of the pokemon
     * @param hp hp of the pokemon
     * @param weakness weakness of the pokemon
     * @param resistance resistance of the pokemon
     * @param attacks all attacks of the pokemon
     */
    protected Pokemon(String name, String type, Float hp, Weakness weakness, Resistance resistance, ArrayList<Attack> attacks){
        this.name = name;
        this.energytype = type;
        this.hp = hp;
        this.weakness = weakness;
        this.resistance = resistance;
        this.attacks = attacks;
    }

    /**
     * Returns array with attacks in current object
     *
     * @return array with attacks
     */
    public ArrayList<Attack> getAttacks() {
        return this.attacks;
    }

    /**
     * Returns a single attack based on the i parameter
     *
     * @param i integer that searches the attack array and returns a single attack object
     * @return attack object
     */
    public Attack getAttack(Integer i){
        return this.attacks.get(i);
    }

    /**
     * Prints all attacks that are in this objects
     */
    public void getAttacksConsole(){
        for (Attack at: attacks) {
            System.out.println(at.getName());
        }
        System.out.println("\n");
    }

    /**
     * Returns current name of pokemon
     * @return current name of object as string
     */
    public String getName(){
        return this.name;
    };

    /** Returns energytype of pokemon
     * @return energytype of this object
     */
    public String getEnergytype(){
        return this.energytype;
    }


    /**
     * Returns the hp
     *
     * @return current hp of this object
     */
    public Float getHp(){
        return this.hp;
    }

    /**
     * Method that does damage to the receiver class
     *
     * @param receiver class that will be the receiver off the damage
     * @param choice integer that selects which attack should be done
     */
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

    /**
     * Reduces the damage of the receiver based on the damage param
     *
     * @param receiver the pokemon that takes the damage
     * @param damage damage that should be applied to the receiver
     * @return hp after the damage has been applied
     */
    public Float takeDamage(Pokemon receiver, Float damage){
        receiver.setHp(receiver.getHp() - damage);
        return receiver.getHp();
    }

    /**
     * Sets the hp based on the hp param
     *
     * @param hp the new hp
     */
    public void setHp(Float hp) {
        this.hp = hp;
    }
}

