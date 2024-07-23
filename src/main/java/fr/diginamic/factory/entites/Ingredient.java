package fr.diginamic.factory.entites;

import fr.diginamic.factory.enums.Unite;

public class Ingredient extends Element{
    public Ingredient(String nom, double valeur, Unite unite) {
        super(nom, valeur, unite);
    }

    @Override
    public String toString() {
        return "Ingredient{} ";
    }
}
