public class NoDuplicateHashSet {
    public static void main(String[] args) {
        java.util.HashSet<String> uniqueElements = new java.util.HashSet<>();
        uniqueElements.add("Apple");
        uniqueElements.add("Banana");
        uniqueElements.add("Orange");
        uniqueElements.add("Apple"); 
        System.out.println("Unique elements in the HashSet: " + uniqueElements);
        System.out.println("Size of the HashSet: " + uniqueElements.size());
        System.out.println("Does the HashSet contain 'Banana'? " + uniqueElements.contains("Banana"));
        System.out.println("Does the HashSet contain 'Grapes'? " + uniqueElements.contains("Grapes"));
        System.out.println("Removing 'Orange' from the HashSet: " + uniqueElements.remove("Orange"));
        System.out.println("Unique elements in the HashSet after removal: " + uniqueElements);
        System.out.println("Size of the HashSet after removal: " + uniqueElements.size());
        System.out.println("Clearing the HashSet.");
        uniqueElements.clear();
        System.out.println("Size of the HashSet after clearing: " + uniqueElements.size());
        System.out.println("Is the HashSet empty? " + uniqueElements.isEmpty());
        System.out.println("Adding 'Grapes' to the HashSet.");
        uniqueElements.add("Grapes");
        System.out.println("Unique elements in the HashSet after adding 'Grapes': " + uniqueElements);
        System.out.println("Size of the HashSet after adding 'Grapes': " + uniqueElements.size());
        System.out.println("Does the HashSet contain 'Grapes'? " + uniqueElements.contains("Grapes"));
        System.out.println("Removing 'Grapes' from the HashSet: " + uniqueElements.remove("Grapes"));
        System.out.println("Unique elements in the HashSet after removing 'Grapes': " + uniqueElements);
        System.out.println(uniqueElements.toString());
        System.out.println(uniqueElements.clear());
    }
}
