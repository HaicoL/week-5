package Oefeningen;

import java.util.HashMap;

public class TestSamenvoegen {

    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap();
        map1.put("a", "b");
        map1.put("d", "e");
        map1.put("g", "h");
        HashMap<String, String> map2 = new HashMap();
        map2.put("b", "c");
        map2.put("e", "f");
        map2.put("i", "j");
        Samenvoegen samenvoegen = new Samenvoegen();
        HashMap<String, String> samen = samenvoegen.doehet(map1, map2);
        System.out.println(samen);
    }
}