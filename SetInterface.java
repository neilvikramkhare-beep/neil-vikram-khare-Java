import java.util.HashSet;
public class SetInterface {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("HashSet: " + set);
        set.clone();
        System.out.println("Cloned HashSet: " + set);
        set.contains("Banana");
        System.out.println("Does the HashSet contain Banana? " + set.contains("Banana"));
        set.isEmpty();
        System.out.println("Is the HashSet empty? " + set.isEmpty());
        set.size();
        System.out.println("Size of the HashSet: " + set.size());
        set.getClass();
        System.out.println("Class of the HashSet: " + set.getClass());
        set.hashCode();
        System.out.println("Hash code of the HashSet: " + set.hashCode());
        set.iterator();
        System.out.println("Iterator of the HashSet: " + set.iterator());
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);
        set.clear();
        System.out.println("After clearing the HashSet: " + set);
    }
}
