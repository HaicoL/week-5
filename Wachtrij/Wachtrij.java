package Wachtrij;

import java.util.HashMap;

public class Wachtrij {

    enum Status {
        WACHTEND,
        BEDIEND
    }

    private HashMap<String, Status> lijst = new HashMap<>();

    public void zetInWachtrij(String naam){
        lijst.put(naam, Status.WACHTEND);
    }

    public void toestandBediend(String naam){
        lijst.put(naam, Status.BEDIEND);
    }

}
