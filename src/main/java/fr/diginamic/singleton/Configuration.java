package fr.diginamic.singleton;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class Configuration {
    private static Configuration instance = new Configuration();
    private ResourceBundle configuration;
    private Map<String, String> cache= new HashMap<>();

    private Configuration() {
        ResourceBundle fichier = ResourceBundle.getBundle("configuration");
        for(String key: fichier.keySet()){
            cache.put(key, fichier.getString(key));
        }
    }

    public static Configuration getInstance() {
        return instance;
    }

    public String getValue(String key) {
        return cache.get(key);
    }

}
