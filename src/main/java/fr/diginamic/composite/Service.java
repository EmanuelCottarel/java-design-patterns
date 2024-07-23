package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {
    private String nom;

    private List<IElement> elements = new ArrayList<>();

    public Service(String nom) {
        this.nom = nom;
    }

    @Override
    public double calculerSalaire() {
        double sum = 0;
        for (IElement e : elements) {
            sum += e.calculerSalaire();
        }
        return sum;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<IElement> getElements() {
        return elements;
    }

    public void setElements(List<IElement> elements) {
        this.elements = elements;
    }

    public void addElement(IElement element) {
        this.elements.add(element);
    }
}
