
package Collections;
import java.util.*;
class CollectionsExa {
    public static void main(String[] args) {
        // Code to demonstrate collections in Java
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println("HashSet: " + hashSet);
        hashSet.remove(2);
        System.out.println("HashSet after removal: " + hashSet);
        System.out.println("HashSet contains 3: " + hashSet.contains(3));
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("Java");
        System.out.println("LinkedList: " + linkedList);
        linkedList.remove("World");
        System.out.println("LinkedList after removal: " + linkedList);
        System.out.println("LinkedList contains 'Java': " + linkedList.contains("Java"));
        System.out.println("Size of HashSet: " + hashSet.size());
        System.out.println("Size of LinkedList: " + linkedList.size());

    }
}
