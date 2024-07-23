package fr.diginamic.singleton.tests;

import fr.diginamic.singleton.Configuration;
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void testGetInstance() {
        Configuration config = Configuration.getInstance();
        assertNotNull(config);
    }

    @Test
    public void testGetValueValidKey() {
        Configuration config = Configuration.getInstance();
        String value = config.getValue("db.url");
        assertEquals("jdbc:mysql://localhost:3306/mabase", value);
    }


}
