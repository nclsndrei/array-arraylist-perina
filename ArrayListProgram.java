import java.util.ArrayList;

public class ArrayListProgram { // property of navp
    public static void main(String[] navp) {
        ArrayList<Integer> myList = new ArrayList<>(); // arraylist declaration and instantiation

        myList.add(1); // add value to arraylist
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(9);
        
        System.out.println("*** ArrayList Program ***");

        System.out.println("\n--- Original ArrayList ---");
        for (int i = 0; i < myList.size(); i++) { // print elements with their indices using arraylist.size()
            System.out.println("Index: " + i + ", Element: " + myList.get(i));
        }

        // --- ADD an element ---
        int newElement = 11; // new element to add
        myList.add(newElement); // add the new element at the end

        System.out.println("\n--- After Adding Element " + newElement + " ---");
        for (int i = 0; i < myList.size(); i++) { // print elements with their indices using arraylist.size()
            System.out.println("Index: " + i + ", Element: " + myList.get(i));
        }

        // --- REMOVE an element ---
        int removeIndex = 0; // remove the element at index 0
        int removedValue = 1; // element to be removed
        myList.remove(removeIndex); // remove the element at the given index

        System.out.println("\n--- After Removing Element " + removedValue + " Index " + removeIndex + " ---");
        for (int i = 0; i < myList.size(); i++) { // print elements with their indices using arraylist.size()
            System.out.println("Index: " + i + ", Element: " + myList.get(i));
        }

        // --- UPDATE an element ---
        int updateIndex = 3; // index to update
        int updatedValue = 99; // new value
        myList.set(updateIndex, updatedValue); // update the element at the given index

        System.out.println("\n--- After Updating Index " + updateIndex + " to " + updatedValue + " ---");
        for (int i = 0; i < myList.size(); i++) { // print elements with their indices using arraylist.size()
            System.out.println("Index: " + i + ", Element: " + myList.get(i));
        }
    }
}
