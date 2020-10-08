package nl.jklerk;

import nl.jklerk.pokemons.Charmeleon;
import nl.jklerk.pokemons.Pikachu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Pokemon pikachu = new Pikachu("Pik");
        Pokemon charmeleon = new Charmeleon("Charm");
        Scanner input = new Scanner(System.in);

        // Pikachu Text
        System.out.println("As Pikachu select which attack you would like to do against Charmeleon");
        for (int i = 0; i < pikachu.getAttacks().size(); i++) {
            System.out.println(i + ": " + pikachu.getAttack(i).getName());
        }
        pikachu.doDamage(charmeleon, Integer.parseInt(input.nextLine()));


        // Charmeleon text
        System.out.println("As Charmeleon select which attack you would like to do against Pikachu");
        for (int i = 0; i < charmeleon.getAttacks().size(); i++) {
            System.out.println(i + ": " + charmeleon.getAttack(i).getName());
        }
        charmeleon.doDamage(pikachu, Integer.parseInt(input.nextLine()));
    }
}
