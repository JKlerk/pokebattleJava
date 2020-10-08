package nl.jklerk;

public class Weakness {
    private final String name;
    private final Float multiplier;

    /**
     * Weakness of the pokemon
     *
     * @param name of the energytype that the pokemon has a weakness to
     * @param multiplier that gets applied when the opponents energytpe is the same as the weakness
     */
    public Weakness(String name, Float multiplier){
        this.name = name;
        this.multiplier = multiplier;
    }

    public String getName(){
        return this.name;
    }

    public Float getMultiplier(){
        return this.multiplier;
    }
}
