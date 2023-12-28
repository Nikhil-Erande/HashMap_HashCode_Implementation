import java.util.Objects;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);

        System.out.println(hashMap.get("apple")); // Output: 1
        System.out.println(hashMap.containsKey("banana")); // Output: true

        hashMap.remove("banana");
        System.out.println(hashMap.containsKey("banana")); // Output: false
    }
}