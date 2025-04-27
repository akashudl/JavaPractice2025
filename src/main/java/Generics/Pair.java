package Generics;



//; More Than One Generic type expmaple


//Duplicate Parmater are not allowed in generic ty[pe
public class Pair<K,V> {
    private K key;
    private V value;

    public void put(K key,V value){
        this.key=key;
        this.value=value;
    }
    public void displayPair(){
        System.out.println("Key is : "+key + " value is " + value);
    }
}
