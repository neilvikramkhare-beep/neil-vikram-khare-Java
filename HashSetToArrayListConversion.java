import java.util.ArrayList;
import java.util.HashSet;
public class HashSetToArrayListConversion {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        ArrayList<String> arrayList = new ArrayList<>(hashSet);
        System.out.println("ArrayList: " + arrayList);
    }
}
