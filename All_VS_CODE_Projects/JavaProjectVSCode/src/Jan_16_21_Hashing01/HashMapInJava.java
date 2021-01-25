import java.util.HashMap;
import java.util.Map;

public class HashMapInJava {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("key", 10);
        m.put("GFG", 90);
        m.put("Key2", 12);
        m.put("Rohit", 16);
        System.out.println(m);
        System.out.println(m.size());
        for(Map.Entry<String ,Integer> e: m.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());        
        if(m.containsKey("key"))
            System.out.println("Yes");
        else
            System.out.println("No");
        m.remove("key2");
        System.out.println(m.size());
        System.out.println("-----------");
        if(m.containsValue(10))
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println("-----------");
        System.out.println(m.get("Rohit"));
        System.out.println(m.get("key2"));

    }
    
}
