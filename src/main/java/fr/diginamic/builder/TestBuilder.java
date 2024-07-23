package fr.diginamic.builder;

import fr.diginamic.builder.entites.Produit;
import fr.diginamic.builder.entites.ProduitBuilder;
import fr.diginamic.factory.enums.Unite;

public class TestBuilder {

    public static void main(String[] args) {

        ProduitBuilder builder = new ProduitBuilder();
        Produit produit = builder.appendNom("chips lays bbq")
                .appendCategorie("chips")
                .appendAdditif("e212", 15, Unite.MICRO_GRAMMES)
                .appendAllergenes("noix", 20, Unite.MICRO_GRAMMES)
                .appendIngredient("Pommes de terre", 100, Unite.MICRO_GRAMMES)
                .appendGrade("4")
                .appendMarque("Lays")
                .get();

        System.out.println(produit);
    }
}
