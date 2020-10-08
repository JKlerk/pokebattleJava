package nl.jklerk;

public class Resistance {
    private String name;
    private Float multiplier;

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
