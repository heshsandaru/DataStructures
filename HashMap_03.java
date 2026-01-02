import java.util.HashMap;

public class HashMap_03 {
    public static void main(String[] args) {
        // Declaration and Initialization
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Accessing values
        int value = map.get("Banana"); // Accessing the value for key "Banana"
        System.out.println("value: " + value);

        // Iterating through the HashMap
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
