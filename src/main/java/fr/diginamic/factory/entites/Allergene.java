package fr.diginamic.factory.entites;

import fr.diginamic.factory.enums.Unite;

public class Allergene extends Element{
    public Allergene(String nom, double valeur, Unite unite) {
        super(nom, valeur, unite);
    }

    @Override
    public String toString() {
        return "Allergene{}";
    }
}
