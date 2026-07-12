package Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMapBasic {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();
        
        // insertion --> put(k,v)
        map1.put("in","India");
        map1.put("en","England");
        map1.put("us","United States");

        System.out.println(map1);

        // modify value of --> in

        map1.put("in","India22");
        System.out.println("modified value of india have printed-- " + map1);
        







        // *** another map ***
        Map<String,String> table = new HashMap<>();
        table.put("br", "Brazil");

        System.out.println("Before: " + table);

        // 2. putAll() combining both map "table + map1" 
        table.putAll(map1);
        System.out.println("After: " + table);


        //3. remove()  - delete any specific entry/ key-value pair from the map represented by key k.
        table.remove("en");
        System.out.println(table);

        // /***  removeAll(K , V) --> remove the netry from the map represnented by the key K associated with value V.          ***/
        
        //4. size() 
        System.out.println(table.size());

        //5. putIfAbsent() -- yaha in pehle se present hai to ye kuch nhi karega 
        table.putIfAbsent("in", "India3");
        System.out.println(table);
        
        //But
        // yaha "is" pehle se present nhi hai to ye "is" ki entry kare dega map me and value "Inida3".
        table.putIfAbsent("is", "India3");
        System.out.println(table);


        //6. get() -- get() se key ki corresponding value ko print karte hai --
        System.out.println("value of br is- "+ table.get("br"));

        //7. getDefalut() -- is key ki corressponding value mere ko do if nhi hai to ye default value return kardo.
        System.out.println(table.getOrDefault("us", "NONE"));

        //8.containsKey()  - kya hamare map me ye "key" present hai.
        System.out.println(table.containsKey("in"));


        //9.containsValue()  - kya hamare map me ye "value" present hai.

        System.out.println(table.containsValue("United States"));   // true
        System.out.println(table.containsValue("United States of America"));    // false
        System.out.println(table);



        // 10. replace() --> iss key me koi v value padi use is value se replace kardo.
        table.replace("in", "Indonesia"); // so yaha hamne 'in' ki value 'india' se 'indonesia' kardi 
        System.out.println(table);

        //11. keySet() --> ye ek set return karta hai jisme sari ki sari KEYS present hoti hai-
        // ye ek sets return kaartt hai -- isiliye iska     SYNTAX thoda alga hai dekh lo achhe se.
        Set<String> kst= table.keySet();
        System.out.println(kst);


        //12. values() -- > "values" se ham sare ke sare values return karte hai --

        // or "keyset" se ham sare ke sare keys ko return karte hai
        
        // values() -->
        Collection<String> valueCollections1 =  table.values();
        System.out.println(valueCollections1);


        //13. entrySet () -->  get all the entries from the map
        // or ye ek "SET" return kart hai so hame "set" se hi ise intialize karnan hoga.
        
        Set<Map.Entry<String, String>> entSt = table.entrySet();
        System.out.println("Printing entires: " + entSt);
 
        

        //14. clear() --> delete all the records from map-
        // System.out.println(table.size());
        // table.clear();
        // System.out.println(table.size());


        /* Iterating over a map 
        SYNTAX -->
        .            Map<Integer, String> map = new HashMap<>();
        .            map.put(1, "One");
        .            map.put(2, "Two");

        .            for(Map.Entry<Integer, String> entry : map.entrySet()) {
        .                    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        .             } 
        
        NOTE ---> Here, Integer as Key and String as Value.
        
        */
 
    }




    
    
}
