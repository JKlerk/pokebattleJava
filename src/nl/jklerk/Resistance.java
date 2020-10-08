package nl.jklerk;

public class Resistance {
    private final String name;
    private final Float multiplier;

    /**
     * Resistance of the pokemon
     *
     * @param name of the energytype it has resistance to
     * @param multiplier that gets applied when the opponents energytpe is the same as the resistance
     */
    public Resistance(String name, Float multiplier){
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
