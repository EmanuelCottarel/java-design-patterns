package fr.diginamic.factory;

import fr.diginamic.factory.entites.Additif;
import fr.diginamic.factory.entites.Element;
import fr.diginamic.factory.enums.TypesElement;
import fr.diginamic.factory.enums.Unite;
import fr.diginamic.factory.factory.ElementFactory;

public class FactoryTest {
    public static void main(String[] args) {
        Element ingredient = ElementFactory.getElement(TypesElement.INGREDIENT, "tomate", 12, Unite.MICRO_GRAMMES);
        System.out.println(ingredient);
        Element additif = ElementFactory.getElement(TypesElement.ADDITIF, "colorant", 10, Unite.MICRO_GRAMMES);
        System.out.println(additif);
        Element allergene = ElementFactory.getElement(TypesElement.ALLERGENE, "milk", 10, Unite.MILLI_GRAMMES);
        System.out.println(allergene);

    }
}
