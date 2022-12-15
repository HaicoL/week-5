package Oefeningen;

import java.util.HashMap;
import java.util.Iterator;

public class Samenvoegen {
    public HashMap<String, String> doehet(HashMap<String, String> map1, HashMap<String, String> map2) {
        HashMap<String, String> samen = new HashMap();
        Iterator var4 = map1.keySet().iterator();

        while(var4.hasNext()) {
            String keyMap1 = (String)var4.next();
            String valueMap1 = (String)map1.get(keyMap1);
            if (map2.containsKey(valueMap1)) {
                samen.put(keyMap1, (String) map2.get(valueMap1));
            }
        }

        return samen;
    }
}