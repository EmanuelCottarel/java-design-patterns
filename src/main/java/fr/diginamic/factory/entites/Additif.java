package fr.diginamic.factory.entites;

import fr.diginamic.factory.enums.Unite;

public class Additif extends Element{
    public Additif(String nom, double valeur, Unite unite) {
        super(nom, valeur, unite);
    }

    @Override
    public String toString() {
        System.out.println(this.getNom());
        return this.getNom();
    }
}
