
import java.util.HashSet;

public class PS_73_Hashset {
    public static void main(String[] args) {
        HashSet<String> set  = new HashSet<>(16,0.7f);
        
        set.add("Apple");
        set.add("Banana");  
        set.add("Orange");
        set.add("Grapes");
        //  set.clear();
        // System.out.println("HashSet after clearing: " + set);
        System.out.println("HashSet after additions: " + set);
        set.remove("Banana");
        System.out.println("HashSet after removing Banana: " + set);
       
    }
}
