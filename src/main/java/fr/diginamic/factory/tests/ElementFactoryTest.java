package fr.diginamic.factory.tests;

import fr.diginamic.factory.entites.Additif;
import fr.diginamic.factory.entites.Allergene;
import fr.diginamic.factory.entites.Element;
import fr.diginamic.factory.entites.Ingredient;
import fr.diginamic.factory.enums.TypesElement;
import fr.diginamic.factory.enums.Unite;
import fr.diginamic.factory.factory.ElementFactory;
import org.junit.Test;
import static org.junit.Assert.*;

public class ElementFactoryTest {

    @Test
    public void testGetElementAdditif(){
        Element element = ElementFactory.getElement(TypesElement.ADDITIF, "Additif A", 1.0, Unite.MILLI_GRAMMES);
        assertNotNull(element);
        assertTrue(element instanceof Additif);
        assertEquals("Additif A", element.getNom());
        assertEquals(1.0, element.getValeur(), 0.01);
        assertEquals(Unite.MILLI_GRAMMES, element.getUnite());
    }

    @Test
    public void testGetElementIngredient(){
        Element element = ElementFactory.getElement(TypesElement.INGREDIENT, "Ingredient A", 1.0, Unite.MILLI_GRAMMES);
        assertNotNull(element);
        assertTrue(element instanceof Ingredient);
        assertEquals("Ingredient A", element.getNom());
        assertEquals(1.0, element.getValeur(), 0.01);
        assertEquals(Unite.MILLI_GRAMMES, element.getUnite());
    }

    @Test
    public void testGetElementAllergene(){
        Element element = ElementFactory.getElement(TypesElement.ALLERGENE, "Allergene A", 1.0, Unite.MILLI_GRAMMES);
        assertNotNull(element);
        assertTrue(element instanceof Allergene);
        assertEquals("Allergene A", element.getNom());
        assertEquals(1.0, element.getValeur(), 0.01);
        assertEquals(Unite.MILLI_GRAMMES, element.getUnite());
    }
}
