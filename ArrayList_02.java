// Importing ArrayList
import java.util.ArrayList;
public class ArrayList_02 {

    public static void main(String[] args) {
        // Declaration and Initialization
        ArrayList<Integer> list = new ArrayList<>(); // Creating an ArrayList of Integers

        // Adding elements
        list.add(10); // Adding value 10 to the list
        list.add(20);
        list.add(30);

        // Accessing elements
        int value = list.get(1); // Accessing the second element
        System.out.println("value: " + value);

        // Iterating through the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
