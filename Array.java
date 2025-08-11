
public class Array { // property of navp
	public static void main(String[] navp) {
		int[] myArray; // array declaration
		myArray = new int[5]; // array instantiation 
		
		myArray[0] = 1; // add value to array indices
		myArray[1] = 3;
		myArray[2] = 5;
		myArray[3] = 7;
		myArray[4] = 9;
		
		System.out.println("*** Array Program ***");
		
		System.out.println("\n--- Original Array ---");
		for (int i = 0; i < myArray.length; i++) { // print elements with their indices using array.length
			System.out.println("Index: " + i + ", Element: " + myArray[i]);
		}
		
		// --- ADD an element ---
		int newElement = 11; //new element to add
		int[] newArray = new int[myArray.length + 1]; // create new array with +1 length
		
		for (int i = 0; i < myArray.length; i++) { // copy the old elements to the new array
			newArray[i] = myArray[i];
		}
		
		newArray[newArray.length - 1] = newElement; // add the new element at the end
		
		System.out.println("\n--- After Adding Element " + newElement + " ---");
		for (int i = 0; i < newArray.length; i++) { // print elements with their indices using array.length
			System.out.println("Index: " + i + ", Element: " + newArray[i]);
		}
		
		// --- REMOVE an element ---
		int removeIndex = 0; // remove the element at index 0
		int removedValue = 1; // element to be removed
		
		int[] removedArray = new int[newArray.length - 1];
		
		for(int i = 0, j = 0; i < newArray.length; i++) {
			if(i != removeIndex) {
				removedArray[j++] = newArray[i];
			}
		}
		
		System.out.println("\n--- After Removing Element " + removedValue + " Index " + removeIndex + " ---");
		for (int i = 0; i < removedArray.length; i++) { // print elements with their indices using array.length
			System.out.println("Index: " + i + ", Element: " + removedArray[i]);
		}
		
		//--- UPDATE an element ---
		int updateIndex = 4; // index to update
		int updatedValue = 22; // new value
		
		removedArray[updateIndex] = updatedValue;
		
		System.out.println("\n--- After Updating Index " + updateIndex + " to " + updatedValue + " ---");
		for (int i = 0; i < removedArray.length; i++) { // print elements with their indices using array.length
			System.out.println("Index: " + i + ", Element: " + removedArray[i]);
		}
	}
}
