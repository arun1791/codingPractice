package mapparct;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MapTry {

    public static void main(String[] args) {
        // System.out.println("MapTry main true");
        // Map<String, Integer>map=new HashMap<String, Integer>();
        // map.put("arun", 4);
        // map.put("neha", 8);
        // map.put("neeta", 1);

        // System.out.println(map);
        // Set<Entry<String, Integer>> entrySet = map.entrySet();
        // for (Entry<String,Integer> entry : entrySet) {
        //     System.out.println(entry.getKey()+"teststst-"+entry.getValue());
            
        // }

        Map fees=(Map) Proxy.newProxyInstance(HashMap.class.getClassLoader(),
         new Class[]{Map.class}, new ObjectHander(new HashMap<>()));
         fees.put("2000", "java");
         System.out.println(fees);
    }
    
}