package fr.diginamic.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();
        String dbUrl = config.getValue("db.url");
        System.out.println(dbUrl);
    }

}
