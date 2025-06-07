package Collection;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
//        Map<Integer, String> map=  new HashMap();
//        map.put(1,"A");
//        map.put(2,"B");
//        map.put(3,"C");
////        in the default implementation of java.util.HashMap,
// the null key is always stored at index 0 of the internal array (also called the "table").
//        map.put(null,"hello");
//        System.out.println(map);

//        System.out.println(map.size());
//        System.out.println(map.isEmpty());
//        System.out.println(map.containsKey(null));
//        System.out.println(map.containsValue("A"));
//        System.out.println(map.get(1));
        // it removes the keu=y value from map and return the value which has been removed
//        System.out.println(map.remove(1));
//        map.clear();
//        System.out.println(map.size()); //0
//        Set<Integer> keyset=map.keySet();
//        System.out.println(keyset);


        // RETURN THE COLLECTION VIEW OF ALL VALUES
//        Collection<String> valset=map.values();
//        System.out.println(valset);
//        // return the set view of the mappings present in the map
//        Set<Map.Entry<Integer,String>> entries=map.entrySet();
//        System.out.println(entries);


//        Because putIfAbsent(K key, V value) returns:
//
//🔸 null if no previous value was associated with the key (i.e., the key was absent, and the new value was inserted).
//        System.out.println(map.putIfAbsent(4,"D"));
//      If  Key already present in map	Does not update the value
//        System.out.println(map.putIfAbsent(3,"J"));
//        System.out.println(map);
//
//        // If key does not exist  or value is null , it retrun default val;ue
//        System.out.println(map.getOrDefault(null, "0")); // Output: 0
//
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue() +"Hascode : "+entry.hashCode());
//        }
// Hastable same like hashmap but it is thread safe nop null value , keys are allowed
//        Hashtable<Integer, String> table = new Hashtable<>();
//
//        table.put(1, "Apple");
//        table.put(2, "Banana");
//
//        System.out.println(table.get(1));          // Apple
//        System.out.println(table.containsKey(2));  // true
//        System.out.println(table.containsValue("Banana")); // true
//        System.out.println(table.remove(2));       //


//        LinkedHashMap is a hash table and linked list implementation of the Map interface.
//        It maintains a doubly-linked list across all its entries, which defines the iteration order.
//          Maintains order access oprder also ,, nhull value arwe allowed
// to make it synchronuized use like this new Collection.synchronized(new LinkedHashMap<>())

        // To maintian access order you need to pass accessorder true like this  (LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>(16,0.75f,true);)
//        So the elemnt which is access more will be at
//        This is useful for building LRU (Least Recently Used) caches.
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>(16,0.75f,true);
//        When you create a LinkedHashMap with access order set to true, the map maintains the order in which entries were last accessed (not inserted). This means:
//
//        Every time you call .get() or .put() on an existing key, that entry moves to the end of the map.
//
//        This is especially useful for LRU (Least Recently Used) cache implementations.


//        map1.put(1, "A");
//        map1.put(3, "C");
//        map1.put(2, "B");
//        map1.put(null, "NullKey");
//        map1.get(3);
//        System.out.println(map1);

//       TreeMap is sorted according to atural order it will sort thehe tabvkle according to the key

//        ?/ null value are not allowed
//        Time Complexit is o(logn)
                // It is based on Red balck tree (Self balancing binary search tree)

       //  TreeMap<Integer,String> treeMap=new TreeMap<>();
         // if you want to sort in desc order you can use
        TreeMap<Integer,String> treeMap=new TreeMap<>((Integer key1,Integer key2)->key2-key1);
        treeMap.put(1, "A");
        treeMap.put(3, "C");
        treeMap.put(2, "B");
      //  treeMap.put(null, "NullKey");
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.ceilingKey(3));

        //Navigable maop
        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");

        System.out.println("lowerKey(20): " + map.lowerKey(20));      // 10
        System.out.println("floorKey(20): " + map.floorKey(20));      // 20
        System.out.println("ceilingKey(25): " + map.ceilingKey(25));  // 30
        System.out.println("higherKey(20): " + map.higherKey(20));    // 30

        System.out.println("descendingMap(): " + map.descendingMap()); // reverse order

        System.out.println("subMap(10, true, 30, false): " + map.subMap(10, true, 30, false));
    }



}
