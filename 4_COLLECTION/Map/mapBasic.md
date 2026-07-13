
## What is Map Interface ?
> `In Java, elements of Map are stored in key/value pairs. Keys are unique values associated with individual Values. A map cannot contain duplicate keys. And, each key is associated with a single value.`


### Map Characteristics->
1. No Duplicate Keys - Each Key can map to at most one value. However, different keys can map to the same value.
2. Key-Value Association - It maintains an association of keys to values.
3.  Implementations - Some of the well-known classes that implement the Map interface are HashMap, TreeMap, LinkedHashMap, and Hashtable.
4. Order - The Map interface itself doesn't guarantee any specific order of its elements. However, some specific implementations like TreeMap maintain a sorted order, and LinkedHashMap maintains the insertion order.
5. Null Values - Maps allow null values and depending on the implantation, null kets. For example, HashMap allows one null key and multiple null values, but Hashtable does not allow null keys or values.


### Map Methods-->
1. put(K, V) - Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.
2. putAll() - Inserts all the entries from the specified map to this map.
3. putifAbsent(K, V) - Inserts the association if the key K is not already associated with the value V.
4. get(K) - Returns the value associated with the specified key K. If the key is not found, it returns null.
5. getOrDefault(K, defaultValue) - Returns the value associated with the specified key K. If the key is not found, it returns the defaultValue.
6. containsKey(K) - Checks if the specified key K is present in the map or not.
containsValue(V) - Checks if the specified value V is present in the map or not.
replace(K, V) - Replace the value of the key K with the new specified value V.
replace(K, oldValue, newValue) - Replaces the values of the key K with the new values newValue only if the key K is associated with the value oldValue.
remove(K) - Removes the entry from the map that has key K associated with value V.
keyset() - Returns a set of all the keys present in a map.
values() - Returns a set of all the values present in a map.
entrySet() - Returns a set of all the key/value mapping present in a map.





// Map implementation using HashMap
Map<Key, Value> numbers = new HashMap<>();






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