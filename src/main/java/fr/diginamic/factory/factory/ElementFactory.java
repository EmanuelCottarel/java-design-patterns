package fr.diginamic.factory.factory;

import fr.diginamic.factory.entites.Additif;
import fr.diginamic.factory.entites.Allergene;
import fr.diginamic.factory.entites.Element;
import fr.diginamic.factory.entites.Ingredient;
import fr.diginamic.factory.enums.TypesElement;
import fr.diginamic.factory.enums.Unite;

public class ElementFactory {

    public static Element getElement(TypesElement type, String name, double valeur, Unite unite) {
        switch (type) {
            case ADDITIF:
                return new Additif(name, valeur, unite);
            case ALLERGENE:
                return new Allergene(name, valeur, unite);
            case INGREDIENT:
                return new Ingredient(name, valeur, unite);
            default:
                throw new IllegalArgumentException("Type d'élément inconnu: " + type);
        }
    }
}
