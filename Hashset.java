import java.util.HashSet;
import java.util.Set;
public class Hashset {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Mango");
        System.out.println("HashSet: " + set);
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);
        System.out.println("Contains Mango: " + set.contains("Mango"));
        System.out.println("Equals Mango: " + set.equals("Mango"));
        System.out.println("Size of HashSet: " + set.size());
        System.out.println("Is HashSet empty: " + set.isEmpty());
    }
}