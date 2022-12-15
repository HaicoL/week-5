package Telefoonboek;

import java.util.HashMap;

public class Telefoonboek {
    private HashMap<String, String> contacts = new HashMap<>();
    //eerste waarde = sleutel (naam),
//tweede waarde = waarde (telefoonnummer)
//objecten-paren!
    public Telefoonboek() {
        contacts.put("Jan", "123");
        contacts.put("Jos", "456");
        contacts.put("Jozef", "789");
    }

    public int telContacten() {

        return contacts.size();
    }

    public String zoekTelefoonnummerOp(String naam) {

        return contacts.get(naam);
    }
}
