
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
        
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        for(Integer i: hashSet) {
            linkedList2.add(i);
        }
        System.out.println("LinkedList created from HashSet: " + linkedList2);
        System.out.println("Size of LinkedList created from HashSet: " + linkedList2.size());
        
        System.out.println("LinkedList is empty: " + linkedList.isEmpty()); 

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3); 
        treeSet.add(8);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("First element in TreeSet: " + treeSet.first());
        System.out.println("Last element in TreeSet: " + treeSet.last());
        
        NavigableSet<Integer> navigableSet = treeSet.descendingSet();
        System.out.println("NavigableSet (descending order): " + navigableSet);
        // Comparator<Integer> comparator = Collections.reverseOrder();
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        for(Integer i: treeSet) {
            treeSet2.add(i);
        }
        System.out.println("TreeSet created from TreeSet with reverse order: " + treeSet2);
        System.out.println("Size of TreeSet created from TreeSet with reverse order: " + treeSet2.size());
        System.out.println(treeSet2.first());
        
    }
}
