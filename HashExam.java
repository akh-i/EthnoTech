import java.util.*;
class HashExam {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "Akhila");
        hashMap.put("2", "Pagundla");
        hashMap.put("1", "Akhila");
        hashMap.put("3", "Akhi");
        System.out.println(hashMap);
        System.out.println(hashMap.get("1"));
        System.out.println(hashMap.get("2"));
        System.out.println(hashMap.remove("3")); 
        System.out.println(hashMap.containsKey("1"));
        System.out.println(hashMap.containsValue("Akhila"));
        LinkedHashMap<String,Integer> hashMap1 = new LinkedHashMap<>(); 
        hashMap1.put("Even", 2);
        hashMap1.put("Odd", 3);
        System.out.println(hashMap1);
    }
} 