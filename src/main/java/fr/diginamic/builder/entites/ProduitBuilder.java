package fr.diginamic.builder.entites;

import fr.diginamic.factory.entites.Element;
import fr.diginamic.factory.enums.TypesElement;
import fr.diginamic.factory.enums.Unite;
import fr.diginamic.factory.factory.ElementFactory;

public class ProduitBuilder {

    Produit produit;

    public ProduitBuilder() {
        this.produit = new Produit();
    }

    public ProduitBuilder appendNom(String nom) {
        produit.setNom(nom);
        return this;
    }

    public ProduitBuilder appendGrade(String grade){
        produit.setGrade(grade);
        return this;
    }

    public ProduitBuilder appendMarque(String marque){
        produit.setMarque(new Marque(marque));
        return this;
    }

    public ProduitBuilder appendCategorie(String categorie){
        produit.setCategorie(new Categorie(categorie));
        return this;
    }

    public ProduitBuilder appendIngredient(String nom, double quantite, Unite unite){
        produit.addIngredient(ElementFactory.getElement(TypesElement.INGREDIENT, nom, quantite, unite));
        return this;
    }

    public ProduitBuilder appendAllergenes(String nom, double quantite, Unite unite){
        produit.addAllergene(ElementFactory.getElement(TypesElement.ALLERGENE, nom, quantite, unite));
        return this;
    }

    public ProduitBuilder appendAdditif(String nom, double quantite, Unite unite){
        produit.addAdditif(ElementFactory.getElement(TypesElement.ADDITIF, nom, quantite, unite));
        return this;
    }

    public Produit get(){
        return produit;
    }

}
