package fr.diginamic.composite;

public class TestComposite {
    public static void main(String[] args) {

        Service dsin = new Service("DSIN");
        Employe directeur = new Employe("RASPEY", "Cécile", 10000);
        dsin.addElement(directeur);
        Employe architecte = new Employe("BECHKAR", "Bilel", 8000);
        dsin.addElement(architecte);

        Service bigData = new Service("BIG DATA");
        dsin.addElement(bigData);
        Employe chefService = new Employe("RANMEY","JB", 7500);
        bigData.addElement(chefService);
        Employe concepteur = new Employe("DOE","Jane", 3500);
        bigData.addElement(concepteur);

        Service javaDeveloper = new Service("JAVA DEVELOPER");
        dsin.addElement(javaDeveloper);
        Employe chefService2 = new Employe("GUIINEAU", "KEVIN", 7500);
        javaDeveloper.addElement(chefService2);
        Employe leadDev = new Employe("Martin", "Paul", 3500);
        javaDeveloper.addElement(leadDev);

        System.out.println(dsin.calculerSalaire());
    }

}
