import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava 
{
    public static void main(String[] args) 
    {
        HashSet<String> h = new HashSet<>();
        h.add("General")      ;
        h.add("Structure");
        h.add("Öf");
        h.add("HashSet");
        System.out.println(h);
        System.out.println(h.contains("General"));

        // Iterator to iterate each value of hashset

        Iterator<String> i = h.iterator();
        while(i.hasNext())
            System.out.println(i.next()+" ");

        System.out.println("\nSize befor removing Öf");
        System.out.println(h.size());
        h.remove("Öf");
        System.out.println("Size after removing Öf");
        System.out.println(h.size());
        for (String string : h) {
            System.out.println(string+" ");
        }
        System.out.println(h.isEmpty());
        // Clear the Hashset
        h.clear();
        System.out.println("HashSet size after clear => "+h.size());
        
    }
    
}
