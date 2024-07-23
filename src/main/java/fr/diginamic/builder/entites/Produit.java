package fr.diginamic.builder.entites;

import fr.diginamic.factory.entites.Element;

import java.util.ArrayList;

public class Produit {

    private String nom;
    private String grade;
    private ArrayList<Element> ingredients = new ArrayList<>();
    private ArrayList<Element> additifs = new ArrayList<>();
    private ArrayList<Element> allergenes = new ArrayList<>();
    private Marque marque;
    private Categorie categorie;

    Produit() {
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", grade='" + grade + '\'' +
                ", ingredients=" + ingredients +
                ", additifs=" + additifs +
                ", allergenes=" + allergenes +
                ", marque=" + marque +
                ", categorie=" + categorie +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public ArrayList<Element> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Element> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Element ingredient) {
        this.ingredients.add(ingredient);
    }

    public ArrayList<Element> getAdditifs() {
        return additifs;
    }

    public void setAdditifs(ArrayList<Element> additifs) {
        this.additifs = additifs;
    }

    public void addAdditif(Element additif) {
        this.additifs.add(additif);
    }

    public ArrayList<Element> getAllergenes() {
        return allergenes;
    }

    public void setAllergenes(ArrayList<Element> allergenes) {
        this.allergenes = allergenes;
    }

    public void addAllergene(Element allergene) {
        this.allergenes.add(allergene);
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
